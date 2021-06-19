package lesson6.task4;

import lesson6.task1.NameGenerator;

public class Person {
    String firstName;
    String lastName;
    IdentityDocument document;

    Person(String firstName, String lastName, IdentityDocument document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public IdentityDocument getIdentityDocument() {
        return document;
    }

    public static Person random() {
        return new Person(NameGenerator.generate(), NameGenerator.generate(), IdentityDocument.random());
    }
}
