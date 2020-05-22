package angka_bentuk;
import java.util.Scanner;
public class Patas_5 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int i,j,k,n,z=1,m=1;
        System.out.println("-------------------------------------");
        System.out.println("    MEMBUAT PIRAMIDA INCDECREAMENT   ");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");                
            }
            for(k=i-1;k>=-(i-1);k--){
                System.out.print(i-Math.abs(k));
            }
                z+=2;
                System.out.println();
        }
    }    
}