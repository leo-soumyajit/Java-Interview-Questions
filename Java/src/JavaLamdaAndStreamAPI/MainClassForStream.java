package JavaLamdaAndStreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClassForStream {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Orange","Kiwi");
        Stream<String> stream = fruits.stream();
        stream.sorted()
                .map(fruit-> fruit.length())
                .forEach((fruit)-> System.out.println(fruit));

        List<Integer> number = List.of(1,2,1,3,51,1,3,56,76);
        List<Integer> newList = number.stream()
                .sorted()
                .filter(n -> n%2!=0)
                .collect(Collectors.toList());

        System.out.println(newList);

    }

}
