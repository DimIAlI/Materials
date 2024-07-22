package org.example.Structural.Proxy;

import java.time.LocalDate;

public class DailyReport implements Report {

    private String report;

    @Override
    public String doReport(LocalDate date) {
        //Получение данных
        //Подготовка отчета
        if (report == null) {
            setReport("Ежедневный отчет за " + date);
        }
        return getReport();
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
}
