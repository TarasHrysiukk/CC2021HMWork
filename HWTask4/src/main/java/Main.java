import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Persone persone = new Persone();
        Persone persone1 = new Persone( "Taras" ,1999);
        Persone persone2 = new Persone("Oleh",1997);
        Persone persone3 = new Persone("Oksana",1870);
        Persone persone4 = new Persone("Nastya",2000);
        System.out.println(persone1);
        persone1.changeName(); //вводити з клавіатури імя
        System.out.println("**********persone 1 після зміни імені********** " + "\n"+persone1 );
        System.out.println(persone2);
        System.out.println(persone3);
        System.out.println(persone4);
        System.out.println(persone);
        persone.setName("Andriy");
        System.out.println(persone);
        persone1.setBirthYear(1995);
        System.out.println("**********persone 1 після зміни року народжкення**********" + "\n"+persone1);
    }
}
