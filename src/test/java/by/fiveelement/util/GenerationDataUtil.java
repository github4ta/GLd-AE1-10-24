package by.fiveelement.util;

import com.github.javafaker.Faker;

import java.util.Random;

public class GenerationDataUtil {
    public static String generateName() {
        Faker faker = new Faker();
        return faker.name().name();
    }

    public static String generateEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String generatePassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public static String generateBelarusMobilePhone() {
        Random random = new Random();
        String countryCode = "+375";
        int[] mobileCodes = {25, 29, 33, 44};
        int code = mobileCodes[random.nextInt(mobileCodes.length)];
        int number = 1000000 + random.nextInt(9000000);
        return String.format("%s%d%07d", countryCode, code, number);
    }
}
