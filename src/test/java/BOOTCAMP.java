import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class BOOTCAMP {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell_J\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
            if(driver instanceof ChromeDriver){
                System.out.println("true");
            }else System.out.println("false");
            System.exit(0);

        ///////////////////////// QUESTION 1
        /*
        int[] nums = {12,2,2,3,3,3,4,4,5,5,6};
        if((nums.length==2)&&(nums[0]==nums[1])){
            System.out.println(nums[0]);
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length-1; i++) {
            if ((nums[i-1]==nums[i])&&(nums[i]!=nums[i+1])){
                System.out.println(nums[i]);
            }
        }
        */
        /////////////////////////////////////////////////////////ITERATOR!!!!!!!!!!!!!
        /*
        List<Integer> list = new ArrayList<>() ;
        list.add(120);
        list.add(121);
        list.add(123);
        try {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
                System.out.println(list.size());
                it.remove();
                System.out.println(list.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        ////////////////////////////////////////////////////////////////////////////
        /*
        int[] a1={1,2};
        int[] a2={1,2};
        Object[] o = new Object[a1.length+a2.length];
        */

        ////////////////////////////////////////////////////////////////

        Pojo pojo1 = new Pojo("james");
        Pojo pojo2 = new Pojo("Jenn");

//        Set<Pojo> set = new HashSet<>();
//        set.add(pojo1);
//        set.add(pojo2);

        List<Pojo> list = new ArrayList<>();
        list.add(pojo1);
        list.add(pojo2);
        Comparator<Pojo> COMPARE_KEY = new Comparator<Pojo>() {
            @Override
            public int compare(Pojo o1, Pojo o2) {

                return 0;
            }
        };
        Collections.sort(list,COMPARE_KEY);


    }
}

class Pojo {
    private String id;

    public Pojo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return id == pojo.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
