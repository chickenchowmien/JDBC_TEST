import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenericMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        SortedSet set = new TreeSet<>();
        set.addAll(list);
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

    public void printListData(SortedSet set) {
    }
}
