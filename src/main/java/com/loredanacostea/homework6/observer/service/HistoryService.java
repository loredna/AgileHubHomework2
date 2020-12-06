package com.loredanacostea.homework6.observer.service;

import com.loredanacostea.homework6.observer.HistoryMsgObserver;

public class HistoryService implements HistoryMsgObserver {

    private final BusyService busyService;

    public HistoryService(BusyService busyService) {
        this.busyService = busyService;
        this.busyService.addObserver(this);
    }

    @Override
    public void addHistoryMessage() {
        System.out.println(this.getClass().getSimpleName() + " child notified. Adding history message..");
    }

}
