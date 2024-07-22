package org.example.Structural.Proxy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
/*
* Реализация кэширования
* Расширяемый метод выполняет свою работу, не связанную с проксируемым классом
* и после ее выполнения передает управление основному,
* при этом ЖЦ проксируемого объекта контролируется прокси классом
* (он инициализирует, а не передается извне)
*/
public class ProxyDailyReport implements Report {

    private DailyReport dailyReport;
    private static final Map<LocalDate, DailyReport> reports = new HashMap<>();

    @Override
    public String doReport(LocalDate date) {
        if (!reports.containsKey(date)) {
            dailyReport = new DailyReport();
            dailyReport.doReport(date);
            reports.put(date, dailyReport);
        }
        return reports.get(date).getReport();
    }
}
