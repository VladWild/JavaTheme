package com.java.yandex;

import java.util.ArrayList;
import java.util.List;

public class MainReportExample {

    public static void main(String[] args) {
        List<MonthlyReport> monthlyReports = new ArrayList<>();
        List<YearlyReport> yearlyReports = new ArrayList<>();
        print(monthlyReports);
        print(yearlyReports);
    }

    public static void print(List<? extends Report> reports) {
        for (Report report : reports) {
            System.out.println(report);
        }
    }

    static class Report {

    }

    static class MonthlyReport extends Report {

    }

    static class YearlyReport extends Report {

    }
}
