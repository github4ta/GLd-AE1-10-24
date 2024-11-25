package by.onliner.util;

import by.onliner.ui.utils.randomNicknameMethods.RandomNicknameSymbols;
import org.apache.commons.lang3.RandomStringUtils;

public class Util {
    public static String generatePassword() {
        return RandomStringUtils.randomAscii(9, 13);
    }

    public static String generateNick() {
        int min = 3;
        int max = 9;
        int stringLength = min + (int) (Math.random() * (max - min));
        String nick = "";
        for (int i = 0; i <= stringLength; i++) {
            nick += RandomNicknameSymbols.getRandomChar();
        }
        return nick;
    }
}
