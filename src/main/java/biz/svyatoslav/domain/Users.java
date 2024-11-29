package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {
    public NewUser getZeroWeightUser(){
        NewUser newUser =  new NewUser("Benya", 180, 0, Gender.MALE);
        return newUser;
    }
}
