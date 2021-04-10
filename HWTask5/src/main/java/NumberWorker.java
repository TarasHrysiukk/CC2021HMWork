import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberWorker extends Main {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void containe(float n){
        float firstExtrim = Main.extrime[0];
        float secondExtrim = Main.extrime[1];

        if (n>firstExtrim && n<secondExtrim){
            System.out.println("Число "+ n +" входить у інтрвал "+ Arrays.toString(Main.extrime));
        }else {
            System.out.println("Число "+ n +" НЕ входить у інтрвал "+ Arrays.toString(Main.extrime));
        }
    }

    public void maxMinNumber() throws IOException {
        int min = 0;
        int max = 0;
        boolean count = true;
        System.out.println("Скільки цілих чисел хочете ввести? ");
        //int a = Integer.parseInt(br.readLine());
        int[] arr = new  int[Integer.parseInt(br.readLine())];
        System.out.println("Введіть будь яких три цілих числа :  \n(пісдя кожного введеного нажимайте клавішу Enter)");
       // int []arr = new int[]{Integer.parseInt(br.readLine())};
        for (int i = 0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            //min = arr[0];
            if (count== true | min>arr[i]){
                min=arr[i];
                count = false;
            }
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Ви ввели" + Arrays.toString(arr));
        System.out.println(" Minimum = "+min);
        System.out.println(" Maximum = "+max);
    }
}
