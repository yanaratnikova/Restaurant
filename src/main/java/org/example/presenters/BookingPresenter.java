package org.example.presenters;

import org.example.models.TableModel;
import org.example.views.BookingView;

import java.util.Date;

public class BookingPresenter implements ViewObserver{
    private final Model model;
    private final View view;
    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }
    public void updateTableUI(){
        view.showTables(model.loadTables());

    }

    @Override
    public void onReservationTable(Date orderData, int tableNo, String name) {
        System.out.println("Презентер реагирует на событие");
        try {
            int reservationNo = model.reservationTable(orderData, tableNo, name);
            view.showSeservationTableResalt(reservationNo);
        }
        catch (RuntimeException e){
            view.showSeservationTableResalt(-1);
        }
    }
}
