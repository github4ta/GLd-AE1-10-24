package by.onliner.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Util {

    public static String generateEmail() {
        Random random = new Random();

        int minLength = 9;
        int maxLength = 16;
        int length = random.nextInt(maxLength - minLength + 1) + minLength;

        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] names = new char[length];
        for (int i = 0; i < names.length; i++) {
            names[i] = letters.charAt(random.nextInt(letters.length()));
        }
        String name = new String(names);

        List<String> domains = new ArrayList<>();
        domains.add("gmail.com");
        domains.add("mail.ru");
        domains.add("yahoo.com");
        String domain = domains.get(random.nextInt(domains.size()));

        return name + "@" + domain;
    }

    public static String generatePassword(){
        return RandomStringUtils.randomAscii(9,13);
    }
}
