
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


public class JDBC2 {
    private String oracleDBURL = "jdbc:oracle:thin:@ec2-18-219-41-108.us-east-2.compute.amazonaws.com:1521:xe";
    private String oracleDBUSERNAME = "hr";
    private String oraclePASSWORD = "hr";
    static final Logger log = Logger.getLogger(JDBC2.class.getName());
    //static final String path = "/src/test/resources/log4j.properties";


    public static void main(String[] args) {
        //PropertyConfigurator.configure(path);
        new JDBC2().go();
    }

    public void go() {

        try (
                Connection connection = DriverManager.getConnection(oracleDBURL, oracleDBUSERNAME, oraclePASSWORD);
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet resultSet = statement.executeQuery
                        ("sselect months_between( trunc(hire_date,'month'),trunc(hire_date, 'year')) as month from " +
                                "employees");
        ) {
                ResultSetMetaData metaData = resultSet.getMetaData();
            System.out.println(metaData.getColumnName(1));
        } catch (SQLException e) {
            log.error(
                    e.getMessage()+e.getSQLState()+e.getErrorCode()
            );
        }
    }

}
