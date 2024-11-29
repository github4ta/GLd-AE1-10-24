package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {
    public NewUser getUserDataWithHeight() {
        return new NewUser("", 180, 0, Gender.MALE);
    }
}
