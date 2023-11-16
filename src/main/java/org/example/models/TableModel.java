package org.example.models;

import org.example.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;
    @Override
    public Collection<Table> loadTables() {
        if (tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservetionData, int tableNo, String name) {
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservetionData, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
    throw  new RuntimeException("Некоректный номер столика.");
    }
}
