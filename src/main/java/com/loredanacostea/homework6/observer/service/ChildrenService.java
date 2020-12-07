package com.loredanacostea.homework6.observer.service;

import com.loredanacostea.homework6.observer.BusyServiceObserver;

public class ChildrenService implements BusyServiceObserver {

    private final BusyService busyService;

    public ChildrenService(BusyService busyService) {
        this.busyService = busyService;
        this.busyService.addObserver(this);
    }

    @Override
    public void notifyChildren() {
        System.out.println(this.getClass().getSimpleName() + " notified. Updating it..");
    }
}
