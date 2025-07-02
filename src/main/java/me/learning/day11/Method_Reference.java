package me.learning.day11;

import java.util.Arrays;
import java.util.List;

public class Method_Reference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hindi", "English", "Odia", "French", "Tamil");
        // list .for each ek consumer leta hai
        // isme hum method reference de skte hai jo method pehele se hi available present hoga.
        list.forEach(Method_Reference::printt);
        list.forEach(x -> printt(x));

        // ye dono same kaam kr raha haiMethod
    }
    public static void printt(String name){
        System.out.println(name);
    }
}
