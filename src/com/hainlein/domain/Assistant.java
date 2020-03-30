package com.hainlein.domain;

import com.hainlein.Register;
import com.hainlein.interfaces.Printable;

public class Assistant implements Printable {
    protected String name;
    protected String surname;
    protected String cardID;
    protected Register register;

    public Assistant(String name, String surname, String cardID, Register register) {
        this.name = name;
        this.surname = surname;
        this.cardID = cardID;
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    @Override
    public void menu() {

    }

    @Override
    public void start() {

    }
}
