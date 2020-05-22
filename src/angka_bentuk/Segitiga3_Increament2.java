package angka_bentuk;
import java.util.Scanner;
public class Segitiga3_Increament2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int j,i,n,k;
        System.out.println("---------------------------------");
        System.out.println("    MEMBUAT SEGITIGA INCREAMENT  ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan nilai N : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
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