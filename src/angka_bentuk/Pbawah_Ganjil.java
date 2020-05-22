package angka_bentuk;
import java.util.Scanner;
public class Pbawah_Ganjil {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n,k;
        System.out.println("--------------------------------");
        System.out.println("   MEMBUAT PIRAMIDA DECREAMENT  ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan nilai N : ");
        n=input.nextInt();
        int spasi=n/2;
        int tinggi=n-spasi;
        for(i=tinggi;i>=1;i--){
            for(j=spasi;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=n;k++){
                System.out.print(n);
            }
            n-=2;
            System.out.println();
        }
    } 
}
