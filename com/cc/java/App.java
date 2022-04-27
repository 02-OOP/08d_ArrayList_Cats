package com.cc.java;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
     
        // Vorüberlegung
       // Cat cat = new Cat("Grizabella");

    //    Cat cat1 = new Cat("Grizabella");
    //    Cat cat2 = new Cat("Rum Tum Tugger");
    //    Cat cat3 = new Cat("Alonzo");
    //    Cat cat4 = new Cat("Suzanne");

       //cat1 / cat2 .. more of the same ...DRY

        String [] nameArr = {"Grizabella","Rum Tum Tugger","Alonzo","Suzanne"};
        ArrayList<Cat> objList = new ArrayList<>();

        for (int i = 0; i < nameArr.length; i++) {
            // new Cat(nameArr[i]); // Objekte , ABER keine Referenz
            objList.add(new Cat(nameArr[i]));
        }

        output("Cats: " + objList);
        output(objList.get(0).getAttributes());


    }





    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

