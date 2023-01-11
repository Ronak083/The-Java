import java.util.LinkedList;

public class LinkedListops {

        public static void main(String[] args) {
            LinkedList<String> countries = new LinkedList<>();
            countries.add("India");
            countries.add("USA");
            countries.add("Poland");
            countries.add("Egypt");
            countries.add("Thailand");
            countries.add("Russia");
            new LinkedListops().printList(countries);
            countries.add(1, "Canada");
            countries.add("Bragil");
            new LinkedListops().printList(countries);
            countries.set(7, "Brazil");
            new LinkedListops().printList(countries);
            countries.remove(4);
            new LinkedListops().printList(countries);
        }
        void printList(LinkedList<String> list){
            for(String element: list){
                System.out.println("Element: "+element);
            }
            System.out.println("*****************************");
        }
}
