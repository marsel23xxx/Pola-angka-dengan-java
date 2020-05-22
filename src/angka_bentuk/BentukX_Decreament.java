package angka_bentuk;
import java.util.Scanner;
public class BentukX_Decreament {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int n;
        int j;
        int i;
        System.out.println("-----------------------------");
        System.out.println("     ANGKA X DECREAMENT      ");
        System.out.println("-----------------------------");
        System.out.print("Masukkan angka N : ");
        n=input.nextInt();
        for(i=n;i>=1;i--){
            for(j=n;j>=1;j--){
                if(i==j||i+j==n+1){
                    System.out.print(i);
                    System.out.print(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }    
}
