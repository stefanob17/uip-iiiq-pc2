package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Ingresa año");
        a= sc.nextInt();
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println("El año "+a+" Si es bisiesto ");
        }else{
            System.out.println("El año "+a+" No es bisiesto ");
        }
    }
}