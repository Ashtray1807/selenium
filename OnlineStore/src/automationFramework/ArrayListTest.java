package automationFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        //Creating a generic ArrayList
        ArrayList arlTest = new ArrayList();

        //Size of the ArrayList
        System.out.println("Size of ArrayList at creation: " + arlTest.size());
        Thread.sleep(3000);

        //Let's add some elements to it
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");

        //Recheck the size after adding elements
        System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

        //Display all elements
        System.out.println("List of elements: " + arlTest);

        //Remove some elements
        arlTest.remove("D");
        System.out.println("See contents after removing one element: " + arlTest);

        //Remove element by index
        arlTest.remove(2);
        System.out.println("See contents after removing element by index: " + arlTest);

        //Check the size after removing elements
        System.out.println("Size of arrayList after removing elements: " + arlTest.size());
        System.out.println("List of all elements after removing elements: " + arlTest);

        //Check if the list contains a "K"
        System.out.println(arlTest.contains("K"));

        //Check if the list contains a "D"
        System.out.println(arlTest.contains("D"));
    }

    }