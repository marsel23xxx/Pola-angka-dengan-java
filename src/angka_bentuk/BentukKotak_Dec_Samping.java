package angka_bentuk;
import java.util.Scanner;
public class BentukKotak_Dec_Samping {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
                int i,j,k;
        System.out.println("-----------------------------------");
        System.out.println("       MENCOBA BENTUK KOTAK DEC    ");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nilai k : ");
        k=input.nextInt();
        for(i=k;i>=1;i--){
            for(j=k;j>=1;j--){
                System.out.print(j+" ");
            }
                System.out.println();
        }
    }  
}
