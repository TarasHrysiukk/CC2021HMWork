import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persone {
    private  String name;// два приватних поля
    private double birthYear;//**//
    private double personeAge;
    Calendar date = new GregorianCalendar();

    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader br = new BufferedReader(inputStreamReader);

    Persone() {             //дефолтний конструктор
        birthYear = 2010;
        name = "Arsen";
        personeAge = date.getWeekYear() - birthYear ;
    }

    Persone (String n, double b){ //конструктор з параметрами
        birthYear = b;
        name = n;
        personeAge = date.getWeekYear() - birthYear ;//Віднімає від поточного року рік народження персони
    }


    public String getName() {
        return name;
    }

    public double getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void changeName() throws IOException {
        System.out.print("Введіть  нове ім'я персони :  ");
        name = br.readLine();
        setName(name);
    }

    public void setBirthYear(double birthYear) {
        personeAge = date.getWeekYear() - birthYear ;//Віднімає від поточного року рік народження персони
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Name = " + name  +
                ", Birth Year = " + birthYear +
                ", Persone Age = " + personeAge;
    }
}
