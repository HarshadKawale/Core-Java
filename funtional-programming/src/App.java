import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> of = List.of(10, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        printAllNumbersInListFunctional(of);
        printAllNumbersInListStructured(of);
    }

    private static void printAllNumbersInListFunctional(List<Integer> of) {
        of.stream().forEach(System.out::println);
    }

    private static void printAllNumbersInListStructured(List<Integer> of) {
         for(int numbers : of){

         System.out.println( numbers);

         }

    }
}
