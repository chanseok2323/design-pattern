package com.java.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan();
}
