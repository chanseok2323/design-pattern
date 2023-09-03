package com.java.builder;

import java.time.LocalDate;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());

        TourPlan cancunTrip = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();

        Stream<String> build = Stream.<String>builder().add("test").add("test2").build();
    }
}
