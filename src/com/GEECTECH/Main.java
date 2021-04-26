package com.GEECTECH;

public class Main {

    public static void main(String[] args) {
        int temperature = 9;
        boolean isSunny =true;
        int numberOfPeople = 15;

        if (temperature > 6 && isSunny) {
            System.out.println("Сегодня будет");
        }


        if (temperature < 0 && numberOfPeople >10){
            System.out.println("На лыжу");}


     if (temperature <0 || numberOfPeople >7 ) {
         System.out.println("На коньки");}

     if (isSunny || numberOfPeople < 8){
         System.out.println("Go garden");
     }
     if (isSunny&& temperature > 0 || numberOfPeople > 0) {
         System.out.println("go cinema");

         if (isSunny || temperature < 0 && numberOfPeople >15){
             System.out.println("Go to home" );
         }
         if (!isSunny && temperature >6 || numberOfPeople > 20){
             System.out.println("Go to cafe");
         }
     }
      }
}
