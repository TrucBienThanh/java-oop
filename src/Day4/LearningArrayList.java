package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearningArrayList {
    public static void main(String[] args) {

        List<String> myStringList = new ArrayList<>();
        myStringList.add("5");
        myStringList.add("2");
        myStringList.add("3");
        myStringList.add("4");

        //Get value
        String valueOfIndex1 = myStringList.get(1);
        System.out.println("valueOfIndex1: " + valueOfIndex1);

        //Loop
        for (String s : myStringList) {
            System.out.println(s);
        }

        for (int elementIndex = 0; elementIndex < myStringList.size(); elementIndex++) {
            System.out.println("Element " + (elementIndex + 1) + ": " + myStringList.get(elementIndex));
        }
        //Insert a value into an array list | add
        //|....0...|...1...|...2...|...3...|

        myStringList.add(2, "insert");
        String valueOfIndex2 = myStringList.get(2);
        System.out.println("valueOfIndex2: " + valueOfIndex2);
        for (String s : myStringList) {
            System.out.println(s);
        }

        for (int elementIndex = 0; elementIndex < myStringList.size(); elementIndex++) {
            System.out.println("Element " + (elementIndex + 1) + ": " + myStringList.get(elementIndex));
        }

        //Update value | set
        myStringList.set(3, "5");
        for (int elementIndex = 0; elementIndex < myStringList.size(); elementIndex++) {
            System.out.println("Element " + (elementIndex + 1) + ": " + myStringList.get(elementIndex));
        }

        // Remove a value from array list | remove
//        myStringList.remove(3);
//        for (int elementIndex = 0; elementIndex < myStringList.size(); elementIndex++) {
//            System.out.println("_Element " + (elementIndex + 1) + ": " + myStringList.get(elementIndex));
//        }

        // Check element existences
        myStringList.contains("insert");

    }
}
