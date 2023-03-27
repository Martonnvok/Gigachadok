
package gigachad;

import java.util.Scanner;



public class elsoFeladat {
    private static final  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        kiir("Kérek egy pozitív egész számot: ");
        ellenOrzes();
        
    }

    private static void ellenOrzes() {
        String paros = "";
        int egeszSzam = sc.nextInt();
        if (egeszSzam% 2 == 0) {
            int ossz = egeszSzam/2;
            paros="A szám páros, a kapott szám: "+ossz;
        }
        else if (egeszSzam% 2 == 1) {
            int paratlan=egeszSzam;
        }
        while(paratlan != 1){
                int ossz = egeszSzam*3+1/2;
                paros="A szám páratlan, a kapott szám: "+ossz;
            }
        
        kiir(paros);
        

    }
    
    
    
    private static void kiir(String str){
        System.out.print(str);
    }
    
}   

