package com.loredanacostea.homework6.observer.service;

import com.loredanacostea.homework6.observer.BusyServiceObserver;
import com.loredanacostea.homework6.observer.model.BusyObject;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class BusyService {

    private List<BusyServiceObserver> observers = new ArrayList<>();

    public BusyObject findByName(String name) {
        return BusyObject.builder()
                .name("Test " + name)
                .creationDate(LocalDate.now())
                .build();
    }

    public void updateObjectAndDependencies(String name, LocalDate creationDate) {
        BusyObject busyObject = findByName(name);

        if (creationDate.isBefore(busyObject.getCreationDate())) {
            throw new IllegalArgumentException("The date can't be set before the original creation date");
        }
        busyObject.setCreationDate(creationDate);

        updateChildren();
    }

    public void addObserver(BusyServiceObserver observer) {
        observers.add(observer);
    }

    private void updateChildren() {
        observers.forEach(BusyServiceObserver::notifyChildren);
    }
}
