package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {
    public NewUser getUserDataWithHeight() {
        return new NewUser("Eugene", 0, 0, Gender.MALE);
    }
}
