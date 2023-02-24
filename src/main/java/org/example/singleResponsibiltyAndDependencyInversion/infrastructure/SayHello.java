package org.example.singleResponsibiltyAndDependencyInversion.infrastructure;

import org.example.singleResponsibiltyAndDependencyInversion.domain.Hello;
import org.example.singleResponsibiltyAndDependencyInversion.infrastructure.input.HelloConsoleReader;
import org.example.singleResponsibiltyAndDependencyInversion.infrastructure.output.HelloConsoleWriter;

public class SayHello {

    public static void main(String[] args)  {
        new Hello(new HelloConsoleReader(), new HelloConsoleWriter()).hello();
    }

}
