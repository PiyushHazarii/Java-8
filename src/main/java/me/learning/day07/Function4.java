package me.learning.day07;

import java.util.function.Function;

public class Function4 {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> 2 * x;
        Function<Integer, Integer> function2 = x -> x * x * x;

        System.out.println(function1.andThen(function2).apply(4)); // 512
        System.out.println(function2.andThen(function1).apply(4)); // 128

        // compose just ulta karta hai matlab agar pehele function1 diye hai compose mein
        // and uske baad function2 diye hai to pehele function 2 ko execute karega then function1.
        System.out.println(function1.compose(function2).apply(4)); // 128

        // identity function wo hai jisme hum jo bhi input daalenge wo wahi return karega
        // isme koi rocket science nhi hai...
        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Piyush"));
    }
}
