package by.onliner.ui.utils.randomNicknameMethods;

public class RandomNicknameSymbols {
    public static char getRandomChar() {
        int randomCharCategory = (int) (Math.random() * 3) + 1;
        if (randomCharCategory == 1) {
            return getRandomCapitalLetter();
        } else if (randomCharCategory == 2) {
            return getLowercaseLetter();
        } else
            return getRandomNumber();
    }

    private static char getRandomCapitalLetter() {
        int min = 65;
        int max = 91;
        int letter = min + (int) (Math.random() * (max - min));
        return (char) letter;
    }

    private static char getLowercaseLetter() {
        int min = 97;
        int max = 123;
        int letter = min + (int) (Math.random() * (max - min));
        return (char) letter;
    }

    private static char getRandomNumber() {
        int min = 48;
        int max = 58;
        int letter = min + (int) (Math.random() * (max - min));
        return (char) letter;
    }
}
