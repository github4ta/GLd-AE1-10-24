package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class NewUser {
    private String name;
    private int height;
    private int weight;
    private Gender gender;

    public NewUser(String name, int height, int weight, Gender gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Gender getGender() {
        return gender;
    }
}
