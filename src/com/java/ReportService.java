package com.java;

import java.util.List;
import java.util.Map;

public class ReportService {

    public void maxProfitProduct(Map<String, List<MonthlyReport>> monthsReport, String mounts) {
        //можно так

        if (monthsReport.get(mounts).get(0).isExpense()) {
            //logic
        }

        //или боле подробно так

        List<MonthlyReport> monthlyReports = monthsReport.get(mounts);
        MonthlyReport monthlyReport = monthlyReports.get(0);
        boolean expense = monthlyReport.isExpense();
        if (expense) {
            //logic
        }

        String s = System.lineSeparator();
    }

    static class MonthlyReport {
        private boolean isExpense;

        public boolean isExpense() {
            return isExpense;
        }
    }
}
