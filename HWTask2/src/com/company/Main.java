package com.company;

public class Main {
    public static void main(String[] args) {
        int n = (int) (Math.random()*10000);//генерую число до 10000
        int nn = (int) Math.pow(n,2); // квадрат числа
        System.out.println("Число n = " + n); //вивід  згенерованого числа
        System.out.println("Квадрат числа n = " + nn); // вивід квадрату числа
        String str = Integer.toString(nn); // роміщаємо число і стрінгу str
        System.out.println("Чи є символ \"3\" є у квадраті числа n? Відповідь : " + str.contains("3")); //Перевірка чи входить символ "3" у увадрат числа n
        System.out.println("Міняю порядок цифр числа " + str);//виводимо стрінгу str
        String reversestr = new StringBuffer(str).reverse().toString();//Mіняємо порядк цифр у квадраті числа n
        System.out.println("Новий порядок цифр : " + reversestr);//виводимо поміняну стрінгу  reversestr
        String str2 = reversestr.substring(reversestr.length()-1); // шукаємо останній символ стрінги
        String str3 = Character.toString(reversestr.charAt(0)); // шукаємо перший символ стрінги
        System.out.println("Перший символ " + str3);//виводисо перший симол
        System.out.println("Останній символ " +str2);//виводисо останній симол
        String strNew = str2 + reversestr.substring(1,reversestr.length()-1) + str3; // міняємо місцями перший і останній символи
        System.out.println("Новий рядок з поміняними символами " + strNew); //виводисо поміняну стрінгу
    }
}
