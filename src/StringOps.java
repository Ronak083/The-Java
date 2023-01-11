import java.util.ArrayList;
public class StringOps {
    static ArrayList<String> listname = new ArrayList<>();
    public static void main(String[] args) {
        listname.add("Ronak");
        listname.add("Raj");
        listname.add("Amit");
        System.out.println(listname);
        listname.add("Vikas");
        listname.add("John");
        StringOps str = new StringOps();
        str.displayList(listname);
        System.out.println("****************");
        str.removeNameByPosition(0);
        str.displayList(listname);
        System.out.println("****************");
        str.removeNameByString("Raj");
        str.displayList(listname);
    }
    void displayList(ArrayList<String> names){
        for (String name:names){
            System.out.println(name);
        }
    }
    void removeNameByPosition(int position){
        listname.remove(position);
    }
    void removeNameByString(String name){
        listname.remove(name);
    }
}