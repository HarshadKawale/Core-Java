import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String str = "Indian";

        List<Integer> integerList = new ArrayList<>();

        integerList.add(3);
        integerList.add(2);
        integerList.add(4);
        integerList.add(1);
        integerList.add(5);
        integerList.add(6);
        integerList.add(9);

        // Create sample string list
        List<String> stringList = new ArrayList<>();

        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Yellow");
        stringList.add("Black");
        stringList.add("AB");

        // Arrays.stream(str.split("")).distinct().forEach(System.out::println);

        // stringList.stream()
        //         .sorted(Comparator.comparing(String::length))
        //         .forEach(i -> System.out.print(i + " "));

                integerList.stream()
                .filter(n->String.valueOf(n).startsWith("1"))
                .forEach(System.out::println);

                
    }

}
