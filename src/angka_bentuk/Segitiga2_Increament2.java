package angka_bentuk;
import java.util.Scanner;
public class Segitiga2_Increament2 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n;
        System.out.println("----------------------------------");
        System.out.println("   MEMBUAT SEGITIGA INCERAMENT    ");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
                System.out.println();
        }
    }    
}
