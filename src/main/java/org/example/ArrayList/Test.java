package org.example.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cars  = new ArrayList<>();
        ArrayList<String> colours =  new ArrayList<>(List.of("Brown","Purple"));
        cars.add("Volvo");
        cars.add("Ford");
//        for (String i : cars){
//            System.out.println("Car item => " + i);
//        }

        Boolean isContained = cars.contains("Fords");
//        System.out.println(isContained);


        colours.add("Red");
        colours.add("Gold");
        colours.add("Greed");
        colours.add("Black");

        System.out.println(colours);
        Collections.sort(colours);
        System.out.println(colours);

//        colours.size())

//        colours.clear();
        //        colours.remove(1);


        colours.add(1,"Orange");

//        var letstream = colours.stream().allMatch(e -> e.contains("Red"));
//        Boolean letstream = colours.stream().anyMatch(e -> e.contains("Red"));
//        var letstream = colours.stream().findFirst();
//        var letstream = colours.stream().filter(e-> e.equals("Gold"));
//        var letstream = colours.stream().filter(e-> e.startsWith("R"));
//        var letstream = colours.stream()
//                .map(val-> val + "=S")
//                        .collect(Collectors.toList());






//        System.out.println("letstream => " + letstream);
//        System.out.println("letstream => " + letstream.toList());
//        System.out.println("letstream => " + letstream.toList());
//        System.out.println("letstream => " + letstream);




//        colours.remove("Red");
//        System.out.println(colours);
//        System.out.println( colours.get(2));





    }
}
