package lesson6.task4;

import java.util.Random;

public class StringGenerator {
    private static final String NUMBERS = "0123456789";
    private static final String RUSSIAN_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String RANDOM_SYMBOLS = "F28FOH7A83BS78OGB7A0F7A290FH8JA29A24";

    public static String generate(IdentityDocumentType documentType) {
        switch (documentType) {
            case MILITARY_ID:
                return generateMilitaryId();
            case DIPLOMATIC_PASSPORT:
                return generateDiplomaticId();
            case FOREIGN_CITIZEN_PASSPORT:
                return generateForeignCitizenId();
            case RUSSIAN_CITIZEN_PASSPORT:
                return generateRussianCitizenId();
            case INTERNATIONAL_PASSPORT:
                return generateInternationalId();
            default:
                throw new IllegalArgumentException("Такой тип документа не существует" + documentType.name());
        }
    }

    private static String generateMilitaryId() {
        return String.format("%s %s", randomString(RUSSIAN_ALPHABET, 2), randomOrEmpty() + randomString(NUMBERS, 6));
    }

    private static String generateDiplomaticId() {
        return String.format("%s %s", randomString(NUMBERS, 2), randomString(NUMBERS, 7));
    }

    private static String generateForeignCitizenId() {
        return randomString(RANDOM_SYMBOLS, 25);
    }

    private static String generateRussianCitizenId() {
        return String.format("%s %s %s", randomString(NUMBERS, 2), randomString(NUMBERS, 2), randomString(NUMBERS, 6));
    }

    private static String generateInternationalId() {
        return String.format("%s %s", randomString(NUMBERS, 2), randomString(NUMBERS, 7));
    }

    private static String randomString(String symbolsType, int count) {
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < count; i++) {
            tempString.append(symbolsType.charAt(new Random().nextInt(symbolsType.length())));
        }
        return tempString.toString();
    }

    private static String randomOrEmpty() {
        int random = new Random().nextInt(100);
        if (random <= 50) return "";
        else
            return String.valueOf(StringGenerator.NUMBERS.charAt(new Random().nextInt(StringGenerator.NUMBERS.length())));
    }
}
