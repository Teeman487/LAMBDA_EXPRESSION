package PRE_LAMBDA_EXPRESSION;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void convertToLowerCase(String s){
        String result = s.toLowerCase();
        System.out.println(result);

    }




    public static void main(String[] args) {
        ConsumerExample.convertToLowerCase("TOHEEB");

        // CONSUMER EXAMPLE

        Consumer<String> convertToUpperCase = (str) -> System.out.println(str.toUpperCase());
        convertToUpperCase.accept("yrtrretyuywtggdgdh");

        Consumer<String> trimWords = (word) -> System.out.println(word.replace("t","h").trim());
        trimWords.accept("   trim this word     ");

        // SUPPLIER EXAMPLE
        Supplier<Double> squareOfNumber = () -> Math.pow(2,3);
        Double sq = squareOfNumber.get();
        System.out.println(sq);

        // PREDICATE EXAMPLE
        Predicate<Integer> isOdd = (numb) -> numb % 2 != 0 ;
        System.out.println(isOdd.test(4));
        System.out.println(isOdd.test(5));

        // STREAM API
        List<String> list = Arrays.asList("rofia", "morenike", "aisha", "lola", "ade");
        list.stream().map(name -> name.toUpperCase()).filter(name -> name.contains("A")).forEach(name -> System.out.println(name));

        List<Integer> numb = Arrays.asList(2,4,6,7,9);
        numb.stream().filter(number -> number % 2 == 0).map(number -> number * 100).forEach(number -> System.out.println(number));

        int sumNumb = numb.stream().filter(number -> number % 2 == 0).map(number -> number * 100).mapToInt(number -> number).sum();
        System.out.println(sumNumb);


    }

}
