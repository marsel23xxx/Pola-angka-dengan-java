package angka_bentuk;
import java.util.Scanner;
public class BentukX_DecInc {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int n;        
        int j;
        int i;
        System.out.println("--------------------------------");
        System.out.println(" BENTUK X DECREAMENT INCREAMENT ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Nilai N  : ");
        n=input.nextInt();
        
        for(i=n;i>=1;i--){
            for(j=n;j>=1;j--){
                if(i==j||i+j==n+1){
                    System.out.print(j+" ");
                                      
                }
                else{
                    System.out.print(" ");
                }
            }
                    System.out.println("");
        }
    }    
}
