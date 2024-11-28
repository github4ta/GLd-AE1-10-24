package biz.svyatoslav.pages;

public class CalculatorMessages {

    private static final String NO_GENDER = "Не указан пол.";

    private static final String VALID_WEIGHT = "Вес должен быть в диапазоне 3-500 кг.\n";

    private static final String VALID_HEIGHT = "Рост должен быть в диапазоне 50-300 см.\n";

    public static final String NO_NAME = "Не указано имя.\n";

    public static final String NO_DATA = NO_NAME + VALID_HEIGHT + VALID_WEIGHT + NO_GENDER;

    public static final String NO_WEIGHT_NO_HEIGHT = VALID_HEIGHT + VALID_WEIGHT + NO_GENDER;

    public static  final String NO_WEIGHT = VALID_WEIGHT + NO_GENDER;

    public static  final String NO_HEIGHT = VALID_HEIGHT + NO_GENDER;
}
