import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        DBA dba = new DBA();
        dba.printListData(list);
    }
}
class DBA{
    public <E> void printListData(List<E> list){
        for (E element  : list) {
            System.out.println(element);
        }
    }
    public <E> void printArrayData(E[] arrayData){
        for (E arrayDatum : arrayData) {
            System.out.println(arrayDatum);
        }
    }
}
