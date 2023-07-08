import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen dizinizin eleman sayısını belirtiniz: ");
        int list_length = scanner.nextInt();
        int list[] = new int[list_length];
        for (int i=0;i<list_length;i++){
            System.out.print("dizinin " + (i+1) + ". elemanını giriniz: ");
            int num = scanner.nextInt();
            list[i] = num;
        }
        System.out.println("Yazdığınız dizi:" + Arrays.toString(list));
        double harmonicSerias = 0;
        for (int i= 0; i<list_length ; i++){
            harmonicSerias +=  1/(double)(list[i]);
        }
        System.out.println ("Harmonik seri:" + harmonicSerias);
        double harmonicAverage =list_length/harmonicSerias;
        System.out.println("Harmonik ortalama: " + harmonicAverage );


    }
}