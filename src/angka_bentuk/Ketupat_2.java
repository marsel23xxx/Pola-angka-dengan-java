package angka_bentuk;
import java.util.Scanner;
public class Ketupat_2 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n,tinggi;
        System.out.println("----------------------------------");
        System.out.println("       MEMBUAT KETUPAT ANGKA      ");
        System.out.println("----------------------------------");
        System.out.print("Masukkan Nilai Tinggi : ");
        tinggi=input.nextInt();
        for(i=1;i<=tinggi;i++){
            for(n=tinggi-1;n>=i;n--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=1;i<=tinggi;i++){
            for(n=tinggi-i;n<tinggi;n++){
                System.out.print(" ");
            }
            for(j=i+1;j<=tinggi;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }    
}