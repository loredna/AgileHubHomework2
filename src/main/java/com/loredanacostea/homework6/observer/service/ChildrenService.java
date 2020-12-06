package com.loredanacostea.homework6.observer.service;

import com.loredanacostea.homework6.observer.UpdateChildrenObserver;

public class ChildrenService implements UpdateChildrenObserver {

    private final BusyService busyService;

    public ChildrenService(BusyService busyService) {
        this.busyService = busyService;
        this.busyService.addObserver(this);
    }

    @Override
    public void notifyChildrenUpdate() {
        System.out.println(this.getClass().getSimpleName() + " notified. Updating it..");
    }
}
