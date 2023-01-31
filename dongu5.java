package Giris;

import java.util.Scanner;

public class dongu5 {
    public static void main(String[] args) {
        int i,k;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı Değeri Giriniz:");
        i=inp.nextInt();
        for(k=1; k<=i; k*=4){
            System.out.println("4'ün Katı olan Sayılar:"+k);
        }for(k=1; k<=i; k*=5){
            System.out.println("5'in Katı olan Sayılar:"+k);
    }
}
}
