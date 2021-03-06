//Given a list of integers, sort all the values present in it in descending order using Stream functions

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class DescendingOrderValues {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

             myList.stream()
                   .sorted(Collections.reverseOrder())
                   .forEach(System.out::println);
    }
}