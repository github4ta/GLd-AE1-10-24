package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {

    public NewUser getUserWithValidData() {
        return new NewUser("Name", 180, 80, Gender.MALE);
    }
}
