package lesson6.task4;

import java.util.Random;

public class IdentityDocument {
    private final IdentityDocumentType documentType;
    private final String id;

    public IdentityDocument(IdentityDocumentType documentType, String id) {
        this.documentType = documentType;
        this.id = id;
    }

    public IdentityDocumentType getDocumentType() {
        return documentType;
    }

    public String getId() {
        return id;
    }

    public static IdentityDocument random() {
        IdentityDocumentType documentType = IdentityDocumentType.values()[new Random().nextInt(IdentityDocumentType.values().length)];
        String randomId = StringGenerator.generate(documentType);
        return new IdentityDocument(documentType, randomId);
    }
}
