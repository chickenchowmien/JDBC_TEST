import java.util.*;

public class TestRandom {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
                list.add(4);
                list.add(3);//index 1
                list.add(1);
                list.add(2);
                list.remove(1);
       // Collections.sort(list);
                for(Integer i: list){
                    System.out.println(i);
                }

        System.out.println("************************************");
        Iterator it = list.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
    }
}
