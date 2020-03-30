package com.hainlein;

import com.hainlein.domain.Assistant;
import com.hainlein.domain.Receptionist;
import com.hainlein.domain.Veterinarian;

import java.util.Scanner;

public class Menu {
    private Receptionist receptionist;
    private Veterinarian veterinarian;
    private Assistant assistant;

    public Menu(Receptionist receptionist, Veterinarian veterinarian, Assistant assistant) {
        this.receptionist = receptionist;
        this.veterinarian = veterinarian;
        this.assistant = assistant;
    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("Login as:\n"
        + "1. Receptionist " + receptionist.getName() + " " + receptionist.getSurname() + " " + receptionist.getCardID() + "\n"
        + "2. Assistant " + assistant.getName() + " " + assistant.getSurname() + " " + assistant.getCardID() + "\n"
        + "3. Veterinarian " + veterinarian.getName() + " " + veterinarian.getSurname() + " " + veterinarian.getCardID() + "\n"
        + "Choose any variant, please:");

    }
}
