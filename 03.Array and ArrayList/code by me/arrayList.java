import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        // Syntax 
        Scanner input =  new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(10);
        arr.add(12);
        arr.add(18);
        arr.add(20);
        arr.add(210);
        
        // list.add(1);
        // list.get(0);
        // list,set();  changing the element
        // list.add();  adding element at particular index
        // list.size()  giving the size of array
        // list.addAll(index,another arraylist name)
        // list.remove
        System.out.println(arr);
        System.out.println(arr.contains(18));

        arr.set(0, 125487);
        System.out.println(arr);

        arr.add(3, 258);
            System.out.println(arr);

           /* 
                for (int i = 0; i < 5; i++) {
                arr.add(input.nextInt());
            }

            for (int i = 0; i < 5; i++) {
                System.out.println(arr.get(i));
            } */ 

            input.close();
    }
}
