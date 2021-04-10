import java.io.*;

public class Main {
    public static float[] extrime = {-5,5};
    public static void main(String[] args) throws IOException {
        String s1; //для зчитувння float
        NumberWorker numberWorker = new NumberWorker();
        float f1,f2,f3;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);

        numberWorker.maxMinNumber();
        System.out.println("Введіть будь-яке число float  f1: ");
        s1 = br.readLine();
        f1 = Float.parseFloat(s1);
        numberWorker.containe(f1);

        System.out.println("f2 : ");
        s1 =  br.readLine();
        f2 = Float.parseFloat(s1);
        numberWorker.containe(f2);

        System.out.println("f3 : ");
        s1 =  br.readLine();
        f3 = Float.parseFloat(s1);
        numberWorker.containe(f3);
    }
}

