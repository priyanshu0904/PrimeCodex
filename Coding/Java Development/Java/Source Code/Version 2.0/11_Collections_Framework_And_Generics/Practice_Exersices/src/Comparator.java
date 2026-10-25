import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Comparator {
    static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Lion", "Ant", "Dog", "Bhalu");
        System.out.println(list);
        sortInDesc(list);
        System.out.println(list);
    }

    public static void sortInDesc(List<String> strList){
        //method 1
        //Collections.sort(strList);
        //Collections.reverse(strList);

        //method 2
        Collections.sort(strList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                }else if(o1.charAt(0) < o2.charAt(0)){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
    }
}
