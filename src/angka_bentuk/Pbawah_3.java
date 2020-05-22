package angka_bentuk;
import java.util.Scanner;
public class Pbawah_3 {
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        int j,i,n,tinggi;
          
        System.out.println("-------------------------------");
        System.out.println("  MEMBUAT PIRAMIDA DECREAMENT  ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Nilai Tinggi : ");
        tinggi=input.nextInt();
        for(i=tinggi;i>=1;i--){
            for(n=tinggi-1;n>=i;n--){
                System.out.print(" ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
                System.out.println();
        }
    }    
}
