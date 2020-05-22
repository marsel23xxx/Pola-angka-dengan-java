package angka_bentuk;
import java.util.Scanner;
public class BentukX_IncDec {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j;
        int i;
        int n;
        System.out.println("--------------------------------");
        System.out.println(" BENTUK X INCREAMENT DECREAMENT ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Nilai N  : ");
        n=input.nextInt();
        
        
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print(j);
                    System.out.print(" ");                    
                }
                else{
                    System.out.print(" ");
                }
            }
                    System.out.println("");
        }
    }    
}
