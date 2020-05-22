package angka_bentuk;
import java.util.Scanner;
public class Segitiga2_Increament1 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n;
        System.out.println("----------------------------------");
        System.out.println("   MEMBUAT SEGITIGA INCREAMENT    ");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(i+" ");
            }
                System.out.println();
        }
    }    
}

