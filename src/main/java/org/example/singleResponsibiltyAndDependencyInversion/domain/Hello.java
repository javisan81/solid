package org.example.singleResponsibiltyAndDependencyInversion.domain;

public class Hello {
    private HelloReader helloReader;
    private HelloWriter helloWriter;

    public Hello(HelloReader helloReader, HelloWriter helloWriter) {
        this.helloReader = helloReader;
        this.helloWriter = helloWriter;
    }

    public void hello(){
        helloWriter.sayHello(helloReader.readHelloInUserLanguage());
    }
}
