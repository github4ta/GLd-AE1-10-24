package biz.svyatoslav.enums;

public enum Gender {
    FEMALE("f"),
    MALE("m");

    public final String label;

    private Gender(String label){
        this.label = label;
    }
}
