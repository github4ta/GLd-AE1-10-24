package biz.svyatoslav.domain;

public class User {
    private String name;
    private int height;
    private int weight;
    private String gender;

    public User(String name, int height, int weight, String gender) {
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

    public String getGender() {
        return gender;
    }
}
