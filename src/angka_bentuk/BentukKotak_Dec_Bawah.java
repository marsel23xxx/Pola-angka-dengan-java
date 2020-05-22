package angka_bentuk;
import java.util.Scanner;
public class BentukKotak_Dec_Bawah {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
                int i,j,k,l;
        System.out.println("-----------------------------------");
        System.out.println("       MENCOBA BENTUK KOTAK DEC    ");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nilai k : ");
        k=input.nextInt();
        System.out.print("Masukkan nilai l : ");
        l=input.nextInt();
        
        for(i=k;i>=1;i--){
            for(j=l;j<=k;j++){
                System.out.print(j+" ");
            }
                System.out.println();
        }
    }  
}
