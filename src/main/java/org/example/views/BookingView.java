package org.example.views;

import org.example.models.Table;
import org.example.presenters.View;
import org.example.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo>0){
            System.out.printf("Столик успешно забронированю Номер номер резерва : #%d\n", reservationNo);
        }
        else {
            System.out.println("Произошла ошибка бронирования. Повторите операцию позже.");
        }
    }

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);

    }

    /**
     * Действие клиента(пользователь нажал на кнопкубронирования), бронирование столика
     * @param orderData
     * @param tableNo
     * @param name
     */

    public void reservationTable(Date orderData, int tableNo, String name){
        System.out.println("Возбуждается событие бронирования столика");
        System.out.println("Происходит уведомление наблюдателей....");
        for (ViewObserver observer: observers){
            observer.onReservationTable(orderData, tableNo, name);
        }
    }
}
