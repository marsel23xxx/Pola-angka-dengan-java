
package angka_bentuk;
import java.util.Scanner;
public class BentukKotak_Inc_Samping {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
                int i,j,k;
        System.out.println("------------------------------------");
        System.out.println("       MENCOBA BENTUK KOTAK INC     ");
        System.out.println("------------------------------------");
        System.out.print("Masukkan nilai k : ");
        k=input.nextInt();
        for(i=1;i<=k;i++){
            for(j=1;j<=k;j++){
                System.out.print(j+" ");
            }
                System.out.println();
        }
    }  
}