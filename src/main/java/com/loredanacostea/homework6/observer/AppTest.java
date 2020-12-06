package com.loredanacostea.homework6.observer;

import com.loredanacostea.homework6.observer.service.BusyService;
import com.loredanacostea.homework6.observer.service.ChildrenService;
import com.loredanacostea.homework6.observer.service.HistoryService;

import java.time.LocalDate;

public class AppTest {

    public static void main(String[] args) {
        BusyService busyService = new BusyService();
        HistoryService historyService = new HistoryService(busyService);
        ChildrenService childrenService = new ChildrenService(busyService);
        busyService.updateObjectAndDependencies("ss", LocalDate.now());
    }
}
