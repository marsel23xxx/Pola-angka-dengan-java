
package angka_bentuk;
import java.util.Scanner;
public class BentukX_Increament {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int j;
        int i;
        System.out.println("-----------------------------");
        System.out.println("     ANGKA X INCREAMENT      ");
        System.out.println("-----------------------------");
        System.out.print("Masukkan angka N : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print(i);
                    System.out.print(" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }       
    }    
}
