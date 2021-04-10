package com.company;

import java.io.BufferedReader;
import  java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть значення цеглинки a(висота),b(довжина),c(ширина) :");
        System.out.print("a = ");
        int aheight = Integer.parseInt(br.readLine());
        System.out.print("b = ");
        int blength = Integer.parseInt(br.readLine());
        System.out.print("c = ");
        int cwidth = Integer.parseInt(br.readLine());

        System.out.println("Введіть значення отвору x(висота), y(ширина) :");
        System.out.print("x = ");
        int xlenght = Integer.parseInt(br.readLine());
        System.out.print("y = ");
        int ywidth = Integer.parseInt(br.readLine());

        if (blength<xlenght && cwidth<ywidth)
        {
            System.out.println("Цеглина влізе у отвір");
            return;
        }
        if (blength<xlenght && cwidth>ywidth && cwidth<xlenght && blength<ywidth)
        {
            System.out.println("Ця цеглина влізе у отвір , якщо її розвернути на 90 градусів (b||y)");
            return;
        }
        if (blength>xlenght && cwidth<ywidth && cwidth<xlenght && blength<ywidth)
        {
            System.out.println("Цеглина влізе у отвір , якщо її розвернути на 90 градусів (c||x)");
            return;
        }
        if (blength<xlenght && cwidth>ywidth && aheight<ywidth)
        {
            System.out.println("Ця крута цеглина влізе у отвір , якщо покласти ребро а||y)");
            return;
        }
        if (blength>xlenght && cwidth<ywidth && aheight<xlenght)
        {
            System.out.println("Цеглина влізе у отвір , якщо покласти ребро а||x)");
            return;
        }
        else {
            System.out.println("Цеглина не влізе у отвір");
        }
    }
}
