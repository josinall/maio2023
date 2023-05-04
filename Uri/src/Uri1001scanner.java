


import java.util.Locale;
import java.util.Scanner;


public class Uri1001scanner {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int X = a+b+c;
        
        System.out.println("X = "+X);
        
        leitor.close();
    }
    
}
