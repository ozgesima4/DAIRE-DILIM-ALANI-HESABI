package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
     
      double pı=3.14,r,dilim;
        Scanner input= new Scanner(System.in);
        System.out.println("Dairenin yarıçapını ve merkez acının olcusunu yazın:");
        r=input.nextDouble();
        dilim=input.nextDouble();
        System.out.println("daire diliminin alanı :"+( pı*r*r*dilim)/360);
       
        
    }
    
}
