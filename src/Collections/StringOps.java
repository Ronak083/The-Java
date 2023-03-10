package Collections;

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
        System.out.println("****************");
        str.modifyname(0,"ronak");
        str.displayList(listname);

    }
    int search(String name){
        return listname.indexOf(name);
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
    void modifyname(int position, String name){
        listname.set(position, name);
    }
}