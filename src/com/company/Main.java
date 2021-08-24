package com.company;

public class Main {

    public static void main(String[] args) {
////	// write your code here
////        int num [] = {45,76,540,-20,65};
////        System.out.println(num[1]);
////        //Перезапись элемента
////        num [2] = 456;
////        //Двумерный массив
//        System.out.println(num [2]);
//        int num2 [] [] = new int [2] [3];
//        num2 [0] [0] = 65;
//        num2 [0] [1] = 32;
//        num2 [0] [2] = -15;
//        num2 [1] [0] = 788;
//        num2 [1] [1] = 90;
//        num2 [1] [2] = -312;
//
//        System.out.println(num2[0] [1]);
//
//

//        int i = 1;
//        while (i < 20){
//            System.out.println("i = " + i); i++;
//        }

//        int num [][]=new int [1] [2];
//        num [0] [0] = 76;
//        num [0] [1] = 98;
//        num [0] [2] = 250;
//        num [1] [0] = 345;
//        num [1] [1] = 12;
//        num [1] [2] = 345;

//
        String name [] = {"Баястан","Руслан","Нюша","Саня"};
        System.out.println(" Здравствуйте : " + name[0] + " , " + name[1] + " , " + name[2] );
        for (int i = 0; i < name.length; i++)
        switch (name[i]){
            case "Баястан":
                System.out.println("Доброе утро : " + name[i]);
                break;
            case "Руслан":
                System.out.println("Добрый день : " + name[i]);
                break;
            case "Нюша":
                System.out.println("Добрый вечер : " + name[i]);
                break;case "Саня":
                System.out.println("Доброй ночи : " + name[i]);
                break;
            default:
                System.out.println("Нету такого имени!" + name[i]);
        }




    }


}
