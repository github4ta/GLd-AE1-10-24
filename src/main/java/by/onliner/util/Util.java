package by.onliner.util;

import org.apache.commons.lang3.RandomStringUtils;

public class Util {
    public static String generatePassword(){
        return RandomStringUtils.randomAscii(9,13);
    }
}
