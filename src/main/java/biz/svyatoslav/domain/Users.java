package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {
    public NewUser getUserWithNoData() {
       NewUser newUser = new NewUser("", 0, 0, Gender.MALE);
       return newUser;
    }
}
