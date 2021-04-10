package com.company;

import java.io.*;

public class CallFromOtherCountry {

    double costToUsa = 10;//вартість дзвінка в америку
    double costToUkraine = 1.5; // вартість дзвінка в україну
    double costToPolish = 2;// вартість дзвінка в польщу
    double costForNative = 1; // вартість дзвінка по своїй країні
    double costUsaNative = 0, costUkraineNative =0, costPolishNative = 0; //загальна ціна яку ви проговорили по рідній країні
    double timeUkrFromUkraine =0.0,  timePolishFromPolish =0, timeUsaFromUsa =0; //к-сть хвилин по свої рідній країні (з якої звонять)
    double ukraineTime = 0, polishTime = 0, usaTime = 0;
    String whoToCall; // для вибору кому дзвонити
    String ifDifferentCountry; // для вибору кому дзвонити
    double randomTime;//для генерацію рандомногочасу
    double count = 0; //рахує загальну к-сть хвилин
    double countCost = 0;//рахує вартість
    int callLeft = 3; // скільки дзвінкуів залишилось
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader br = new BufferedReader(inputStreamReader);

    public void mainPhoneLine() throws IOException {
        if (ifZeroCall()){
            System.out.println("У вас закінчились дзвінки");
            counter();
        }else {
            System.out.println("У якій країні ви зараз \n1 - Україна : \n2 - Польща : \n3 - Америка? " +
                    "\nЩоб вийти натисніть 4: \nУ вас залишилось (" + (this.callLeft) + ") дзвінків");
            ifDifferentCountry = br.readLine();
            switch (ifDifferentCountry){
                case ("1"):{
                    this.callLeft --;
                    callFromUkraine();
                }
                case ("2"):{
                    this.callLeft --;
                    callFromPolish();
                }
                case ("3"):{
                    this.callLeft --;
                    callFromUSA();
                }
                case ("4"):{
                    counter();
                }
            }
        }

    }

   private void counter(){
        count = ukraineTime + timeUkrFromUkraine + polishTime + timePolishFromPolish +usaTime + timeUsaFromUsa;
        System.out.printf("Ви проговорили %.2f хвилин", this.count);
        System.out.printf("\nЗ Українаю : %.2f хв. При %.0f $ за хв." , this.ukraineTime, costToUkraine);
        System.out.printf("\nПо території України : %.2f хв. При %.0f $ за хв." , this.timeUkrFromUkraine, costForNative);
        System.out.printf("\nЗ Польщою : %.2f хв. При %.0f за хв." , this.polishTime, costToPolish);
        System.out.printf("\nПо території Польщі : %.2f хв. При %.0f $ за хв." , this.timePolishFromPolish,costForNative);
        System.out.printf("\nЗ Америкою : %.2f хв. При %.0f за хв." , this.usaTime, costToUsa);
        System.out.printf("\nПо території Америки : %.2f хв. При %.0f $ за хв." , this.timeUsaFromUsa,costForNative);
        this.costUkraineNative = timeUkrFromUkraine * costForNative;
        this.costPolishNative = timePolishFromPolish * costForNative;
        this.costUsaNative = timeUsaFromUsa * costForNative;
        this.countCost = (ukraineTime* costToUkraine) + ( polishTime* costToPolish)+(usaTime* costToUsa) + costUsaNative + costPolishNative + costUkraineNative;
        System.out.printf("\nЗагальна вартість розмов = %.2f $, \n************* З них розмови по: **************\n\tтериторії України = %.2f $" +
                        "\n\tтериторії Польщі = %.2f $  \n\tтериторії Америки = %.2f $ ",this.countCost,this.costUkraineNative,this.costPolishNative,this.costUsaNative);
       System.exit(0);
    }

    private void callFromUkraine() throws IOException {
        System.out.println("(Україна)Щоб позвонити за кордон натисніть 1, якщо ні то натисніть Enter " );
        ifDifferentCountry = br.readLine();
        if (ifDifferentCountry.equals("1")){
            System.out.println("Куди будете дзвонити?" );
            System.out.println("\t1 - Польща\n" + "\t2 - Америка " );
            whoToCall = br.readLine();
            switch (whoToCall){
                case("1"):{
                    callToPolish();
                }
                case ("2"):{
                    callToUsa();
                }
            }
        }
        else {
            randomTime =  1 + Math.random()*100;
            System.out.printf("Ваша розмова по території  України тривала : %.2f", randomTime);
            System.out.println(" ");
            this.costUkraineNative += randomTime * costForNative;
            this.timeUkrFromUkraine = randomTime + timeUkrFromUkraine;
            mainPhoneLine();
        }
    }

    private  void callFromPolish() throws IOException {
        System.out.println("(Польща)Щоб позвонити за кордон натисніть 1, якщо ні то натисніть Enter " );
        ifDifferentCountry = br.readLine();
        if (ifDifferentCountry.equals("1")){
            System.out.println("Куди будете дзвонити?" );
            System.out.println("\t1 - Україна\n" + "\t2 - Америка " );
            whoToCall = br.readLine();
            switch (whoToCall){
                case("1"):{
                    System.out.println("dddd" + whoToCall);
                    callToUkraine();
                }
                case ("2"):{
                    callToUsa();
                }
            }
        }
        else {
            randomTime =  1 + Math.random()*100;
            System.out.printf("Ваша розмова по території Польщі тривала : %.0f", randomTime);
            System.out.println(" ");
            this.costPolishNative += costPolishNative*costForNative;
            this.timePolishFromPolish = randomTime + timePolishFromPolish;
            mainPhoneLine();
        }
    }

    private void callFromUSA() throws IOException {
        System.out.println("(Америка)Щоб позвонити за кордон натисніть 1, якщо ні то натисніть Enter " );
        ifDifferentCountry = br.readLine();
        if (ifDifferentCountry.equals("1")){
            System.out.println("Куди будете дзвонити?" );
            System.out.println("\t1 - Україна\n" + "\t2 - Польща " );
            whoToCall = br.readLine();
            switch (whoToCall){
                case("1"):{
                    callToUkraine();
                }
                case ("2"):{
                    callToPolish();
                }
            }
        }
        else {
            randomTime =  1 + Math.random()*100;
            System.out.printf("Ваша розмова по території Америки тривала : %.0f " , randomTime);
            System.out.println(" ");
            this.costUsaNative += costUsaNative*costForNative;
            this.timeUsaFromUsa = randomTime + timeUsaFromUsa;
            mainPhoneLine();
        }
    }

    private void callToUkraine() throws IOException {
        ukraineTime = 1 + Math.random() * 100;
        System.out.printf("Ваша розмова з Україною тривала : %.0f хв", ukraineTime);
        System.out.println(" ");
        this.ukraineTime += ukraineTime;
        mainPhoneLine();
    }

    private void callToPolish() throws IOException {
        polishTime = 1 + Math.random() * 100;
        System.out.printf("Ваша розмова з Польщою тривала : %.0f хв", polishTime);
        System.out.println(" ");
        this.polishTime += polishTime;
        mainPhoneLine();
    }

    private void callToUsa() throws IOException {
        usaTime = 1 + Math.random() * 100;
        System.out.printf("Ваша розмова з Америкою тривала : %.0f хв " , usaTime);
        System.out.println(" ");
        this.usaTime += usaTime;
        mainPhoneLine();
    }

    public boolean ifZeroCall() throws IOException {
        if (this.callLeft == 0){
            System.out.println("****************** Ти все проговорив ******************");
            return true;
        }
        else {
            return  false;
        }
    }
}
