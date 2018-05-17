package com.jdbc.tests;

import org.testng.annotations.Test;


import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

public class JDBC1 {
    String oracleDBURL = "jdbc:oracle:thin:@ec2-18-219-41-108.us-east-2.compute.amazonaws.com:1521:xe";
    String oracleDBUSERNAME = "hr";
    String oraclePASSWORD = "hr";
   // @Test
    public void oracleJDBC() throws Exception{
        Connection connection = DriverManager.getConnection(oracleDBURL,oracleDBUSERNAME,oraclePASSWORD);
        Statement statemment = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statemment.executeQuery("select * from countries");
        resultSet.absolute(1);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("COUNTRY_NAME"));
            System.out.println();
        }
        connection.close();
    }




   @Test
    public void oracleTestFlexible(){

        String string = "select * from employees, departments\n" +
                "where employees.DEPARTMENT_ID = departments.DEPARTMENT_ID\n" +
                "and job_id = 'IT_PROG'";
        List<Map<String,Object>> list = new ArrayList<>();

       ResultSetMetaData metaData=null;
            try(        Connection connection = DriverManager.getConnection(oracleDBURL,oracleDBUSERNAME,oraclePASSWORD);
                        Statement statement =connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(string);
            ){
                Map<String, Object> map=null;
                while (resultSet.next()){
                    metaData = resultSet.getMetaData();

                    map = new HashMap<>();
                    for (int i = 1; i < metaData.getColumnCount(); i++) {
                        map.put(metaData.getColumnName(i), resultSet.getString(i));
                    }
                   list.add(map);
                }

                System.out.print("| ");
                for(String key: list.get(0).keySet()){
                    System.out.print(key+" | ");
                }
                System.out.println();
                for (int i = 0, x=1; i < list.size(); i++,x++) {
                    System.out.print("| ");
                    for (int j = 1; j < metaData.getColumnCount(); j++) {
                        System.out.print(list.get(i).get(metaData.getColumnName(j))+" | ");

                    }
                    System.out.println();
                }
            }
         catch (SQLException  e) {
            e.printStackTrace();
        }

   }



    //@Test
    public void oracleGroup(){



    }














}
