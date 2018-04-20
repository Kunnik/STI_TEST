/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sti_kymakun_2018;

import javafx.beans.property.SimpleStringProperty;

/**
 * Třída pro reprezentaci commitu v tabulce
 * @author beola
 */
public class TableCommit {

    private final SimpleStringProperty date;
    private final SimpleStringProperty username;
    private final SimpleStringProperty message;

    public TableCommit(String date, String username, String filename) {
        this.date = new SimpleStringProperty(date);
        this.username = new SimpleStringProperty(username);
        this.message = new SimpleStringProperty(filename);
    }

    public String getDate() {
        return date.get();
    }

    public void setDate(String p) {
        date.set(p);
    }

    public String getUsername() {
        return username.get();
    }

    public void setUsername(String p) {
        username.set(p);
    }

    public String getMessage() {
        return message.get();
    }

    public void setMessage(String p) {
        message.set(p);
    }
}
