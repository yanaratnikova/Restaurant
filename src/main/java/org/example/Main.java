package org.example;

import org.example.models.Table;
import org.example.models.TableModel;
import org.example.presenters.BookingPresenter;
import org.example.views.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTableUI();
        bookingView.reservationTable(new Date(), 3, "Станислав");
    }
}