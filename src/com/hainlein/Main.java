package com.hainlein;

import com.hainlein.domain.Assistant;
import com.hainlein.domain.Receptionist;
import com.hainlein.domain.Veterinarian;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        Veterinarian vet1 = new Veterinarian("Joe", "Ashley", "2251M", register);
        Assistant ass1 = new Assistant("Duo", "Jhonson", "2639A", register);
        Receptionist rec1 = new Receptionist("Carl", "Jhonson", "1596R", register);
        Menu mainMenu = new Menu(rec1, vet1, ass1);
        mainMenu.start();
    }


}
