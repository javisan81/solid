package org.example.singleResponsibiltyAndDependencyInversion.infrastructure.input;

import org.example.singleResponsibiltyAndDependencyInversion.domain.HelloReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloConsoleReader implements HelloReader {
    public  String readHelloInUserLanguage() {
        System.out.println("Say hello in your language:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
