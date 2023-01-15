import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsOps {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> setL = new LinkedHashSet<>();
        Set<String> setT = new TreeSet<>();
        for(int i =30;i>0;i--){
            set.add("A" + i);
            setT.add("A" + i);
            setL.add("A" + i);
        }

        for (String i: set) {
            System.out.println(i);
        }
        System.out.println("*****************************");
        for (String i: setL) {
            System.out.println(i);
        }
        System.out.println("*****************************");
        for (String i: setT) {
            System.out.println(i);
        }
    }
}
