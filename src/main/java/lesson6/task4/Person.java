package lesson6.task4;

import lesson6.task1.NameGenerator;

public class Person {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final IdentityDocument DOCUMENT;

    Person(String firstName, String lastName, IdentityDocument document) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.DOCUMENT = document;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public IdentityDocument getIdentityDocument() {
        return DOCUMENT;
    }

    public static Person random() {
        return new Person(NameGenerator.generate(), NameGenerator.generate(), IdentityDocument.random());
    }
}
