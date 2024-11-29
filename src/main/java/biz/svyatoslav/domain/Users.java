package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {

    public NewUser getUserWithNameAndWeight() {
        return new NewUser("Bob", 0, 80, Gender.MALE);
    }

    public NewUser getUserWithNoNameNoHeightValidWeightGenderMale() {
        NewUser user = new NewUser("", 0, 80, Gender.MALE);
        return user;
    }
}
