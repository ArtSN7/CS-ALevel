import java.util.ArrayList;
import java.util.Random;


public class random{ 
    public static void main(String[] args) {

        int ind;


        ArrayList <String> list = new ArrayList<>();

        list.add("Python");
        list.add("Java");
        list.add("JS");
        list.add("GO");
        list.add("C++");
        list.add("Ruby");

        Random rand = new Random(); // creating object

        ind = rand.nextInt(list.size()); // random inex

        System.out.println(list.get(ind));

    }

}