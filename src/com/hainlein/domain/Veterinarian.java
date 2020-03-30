package com.hainlein.domain;

import com.hainlein.Register;
import com.hainlein.interfaces.Printable;

import java.util.Scanner;

public class Veterinarian extends Assistant implements Printable {
    private Scanner in = new Scanner(System.in);

    public Veterinarian(String name, String surname, String cardID, Register register) {
        super(name, surname, cardID, register);
    }
}
