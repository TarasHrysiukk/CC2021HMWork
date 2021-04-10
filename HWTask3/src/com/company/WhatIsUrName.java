package com.company;

import java.io.*;

public class WhatIsUrName {
    String name;
    String city;
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader br = new BufferedReader(inputStreamReader);

    public void whatIsYouName() throws IOException {
        System.out.println("Як тебе звати? ");
        this.name = br.readLine();
        System.out.println("Звідки ти " + name + " ? ");
        this.city = br.readLine();
        System.out.println("Тебе зват " + name +", ти родом із "+city);
    }
}
