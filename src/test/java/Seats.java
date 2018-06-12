import java.util.*;

public class Seats {
    public static void main(String[] args) {
        String s = "lasjdfals;jkfas;ljfasl;fja;lfdjsda;lfdjdsal;fjasd;ljfasddflkjasf;ljasdf;lkjsdaf;lsdjadf;lsdjaf;lsdajflkjsdadf";
        char[] c = s.toCharArray();

        List<String> list = new ArrayList<>();
        for (char s1 : c) {
            list.add(String.valueOf(s1));
        }

        Set set = new HashSet();
        set.addAll(list);
        set.forEach(System.out::println);
        set.forEach(element->set.remove(element));
        System.out.println(set.size());
//        Iterator iterator1=set.iterator();
//        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }
    }
}