package angka_bentuk;
import java.util.Scanner;
public class BentukZigZag_inc {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int lebar;
        int tinggi=4;
        int m=tinggi-1;
        int x=m;
        System.out.println("-----------------------------------");
        System.out.println("     ZIG ZAG BENTUK ANGKA INC      ");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan lebar ZigZag : ");
        lebar=input.nextInt();
        for(int i=0;i<=m;i++){
            for(int j=0;j<=m*lebar*2;j++){
                if(j%(m*2)==x||j%(m*2)==m+i){
                    System.out.printf("%02d",j);
                }
                else{
                    System.out.print("  ");
                }
            }
            x--;
            System.out.println();
        }
    }    
}
