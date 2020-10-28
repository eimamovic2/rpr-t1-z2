package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
static int SumaCifara(int x){
    int suma=0;
    while(x!=0){
        suma+=x%10;     //uzimamo zadnju cifru
        x/=10;          //otkidamo zadnju cifru broja
    }
    return suma;
}
    public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n=in.nextInt();
        System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=1;i<=n;i++){
            if(i%SumaCifara(i)==0){        //uslov za djeljivost sa sumom cifara
                System.out.print(i + " ");
            }
        }
    }
}
