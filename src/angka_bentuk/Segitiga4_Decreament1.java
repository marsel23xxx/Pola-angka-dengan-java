package angka_bentuk;
import java.util.Scanner;
public class Segitiga4_Decreament1 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int j,i,n,k;
        System.out.println("------------------------------------");
        System.out.println("     MEMBUAT SEGITIGA DECREAMENT    ");
        System.out.println("------------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(i=n;i>=1;i--){
            for(j=n-1;j>=i;j--){
                
                System.out.print("  ");
            }
            for(k=1;k<=i;k++){
                System.out.print(" "+k);
            }
                System.out.println();
        }
    }    
}
