package com.cc.java;

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

        for (int i = 0; i < nameArr.length; i++) {
            new Cat(nameArr[i]); // Objekte , ABER keine Referenz
        }



    }





    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

