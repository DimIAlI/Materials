package org.example.Structural.Proxy;

import java.time.LocalDate;
/*
* Клиентскому коду не видна разница между использованием прокси объекта
* и проксируемого объекта (используется идентичный интерфейс)
*/
public class Main {
    public static void main(String[] args) {
        prepareReport(new DailyReport(), LocalDate.now());
        prepareReport(new ProxyDailyReport(), LocalDate.now());

    }

    private static void prepareReport(Report report, LocalDate localDate) {
        System.out.println(report.doReport(localDate));
    }
}
