
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class demo {

    public static void main(String args[]) {
        System.out.println("hii");
        ArrayList<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("sachin");
        list.add("kohli");
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(list);
        // using map in a new array list
        List<Integer> listi = Arrays.asList(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);
        // even list 
        List<Integer> evenList = listi.stream()
                .filter(i -> i > 2)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenList);

        int sum = evenList.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of the list: " + sum);

        int max = evenList.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        //.orElse(0);
        System.out.println("Max of the list: " + max);

    }
}
