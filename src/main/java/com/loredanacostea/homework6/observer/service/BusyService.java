package com.loredanacostea.homework6.observer.service;

import com.loredanacostea.homework6.observer.HistoryMsgObserver;
import com.loredanacostea.homework6.observer.UpdateChildrenObserver;
import com.loredanacostea.homework6.observer.model.BusyObject;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class BusyService {

    private List<HistoryMsgObserver> historyMsgObservers = new ArrayList<>();
    private List<UpdateChildrenObserver> observers = new ArrayList<>();

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

        addHistoryMessage();
        updateChildren();
    }

    public void addObserver(HistoryMsgObserver historyMsgObserver) {
        historyMsgObservers.add(historyMsgObserver);
    }

    private void addHistoryMessage() {
        historyMsgObservers.forEach(HistoryMsgObserver::addHistoryMessage);
    }

    public void addObserver(UpdateChildrenObserver updateChildrenObserver) {
        observers.add(updateChildrenObserver);
    }

    private void updateChildren() {
        observers.forEach(UpdateChildrenObserver::notifyChildrenUpdate);
    }
}
