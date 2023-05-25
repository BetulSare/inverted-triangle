
package inverted.triangle;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int row = scan.nextInt();
        for (int i = row; i >=1; i--) {
            for (int j = row-i; j >=1; j--) {
                System.out.print(" ");
            }
            
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
}
