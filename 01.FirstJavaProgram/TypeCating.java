import java.util.Scanner;

/**
 * TypeCating
 */
public class TypeCating {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // destination type > source type for automatically conversion
        // example float> integer
         // int num1 = input.nextFloat();  //you cant not do like this
          //System.out.println(num1);
        // float num = input.nextFloat();
        // System.out.println(num);

        // converting a bigger number in smaller type eplicitly is called type casting

        // int num2 = (int)(56.324f);
        // System.out.println(num2);

        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b);

        char abc = (char)(38);
        System.out.println(abc);
    }
}