package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Find fr = new Find();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        fr.findByName(str);
    }
}
