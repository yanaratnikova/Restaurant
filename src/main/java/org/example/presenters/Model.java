package org.example.presenters;

import org.example.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservetionData, int tableNo, String name);
}
