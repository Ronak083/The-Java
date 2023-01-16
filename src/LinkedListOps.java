import java.util.LinkedList;

public class LinkedListOps {
        public static void main(String[] args) {
            LinkedList<String> countries = new LinkedList<>();
            countries.add("India");
            countries.add("USA");
            countries.add("Poland");
            countries.add("Egypt");
            countries.add("Thailand");
            countries.add("Russia");
            new LinkedListOps().printList(countries);
            countries.add(1, "Canada");
            countries.add("Bragil");
            new LinkedListOps().printList(countries);
            countries.set(7, "Brazil");
            new LinkedListOps().printList(countries);
            countries.remove(4);
            new LinkedListOps().printList(countries);
        }
        void printList(LinkedList<String> list){
            for(String element: list){
                System.out.println("Element: "+element);
            }
            System.out.println("*****************************");
        }
}
