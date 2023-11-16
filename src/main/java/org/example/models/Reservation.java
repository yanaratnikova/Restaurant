package org.example.models;

import java.util.Date;

public class Reservation {
    private static int counter = 1000;
    private  final int id;
    private final Table table;
    private Date date;
    private String name;

    public int getId() {
        return id;
    }

    public Reservation(Table table, Date date, String name) {
        this.table = table;
        this.date = date;
        this.name = name;
        id = ++counter;
    }
}
