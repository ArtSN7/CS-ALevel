import java.util.ArrayList;
import java.util.Scanner;


public class pops_func{ 
    public static void main(String[] args) {
        int ind;
        Scanner input = new Scanner(System.in);

        ArrayList <String> list = new ArrayList<>();

        list.add("Python");
        list.add("Java");
        list.add("JS");
        list.add("GO");
        list.add("C++");
        list.add("Ruby");

        System.out.println("input index to delete: ");

        ind = input.nextInt();

        list.remove(ind);

        System.out.println(list);


    }

}