package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	FlowerBed  flowerBed = new FlowerBed();
	WhatIsUrName whatIsUrName = new WhatIsUrName();
	CallFromOtherCountry callFromOtherCountry = new CallFromOtherCountry();
	System.out.println("//////////////////////////////////////Flower Bed/////////////////////////");
	flowerBed.findPerimetr(40);
	flowerBed.findArea(40);
	System.out.println("////////////////////////////What is your name ///////////////////////////////////");
	whatIsUrName.whatIsYouName();
	System.out.println("////////////////////////////Call From Different Country///////////////////////////////////");
	callFromOtherCountry.mainPhoneLine();
    }
}
