package angka_bentuk;
import java.util.Scanner;
public class Patas_2 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int i,j,k,n,z=1;
        System.out.println("-----------------------------------");
        System.out.println("    MEMBUAT PIRAMIDA INCREAMENT    ");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(i=0;i<n;i++){
            for(j=n-1;j>i;j--){
                System.out.print(" ");                
            }
            for(k=1;k<=z;k++){
                System.out.print(k);
            }
                z+=2;
                System.out.println();
        }
    }    
}

