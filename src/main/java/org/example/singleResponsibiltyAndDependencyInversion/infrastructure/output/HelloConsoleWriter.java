package org.example.singleResponsibiltyAndDependencyInversion.infrastructure.output;

import org.example.singleResponsibiltyAndDependencyInversion.domain.HelloWriter;

public class HelloConsoleWriter implements HelloWriter {
    public void sayHello(String hello) {
        System.out.println("This is how hellow is said "+ hello);
    }
}
