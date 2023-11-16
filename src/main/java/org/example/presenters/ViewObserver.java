package org.example.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderData, int tableNo, String name);
}
