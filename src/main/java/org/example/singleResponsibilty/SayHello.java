package org.example.singleResponsibilty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SayHello {

    public static void main(String[] args) throws IOException {
        System.out.println("Say hello in your language:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String hello=reader.readLine();
        System.out.println("This is how hellow is said "+ hello);
    }
}
