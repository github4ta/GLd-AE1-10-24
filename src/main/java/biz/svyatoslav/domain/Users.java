package biz.svyatoslav.domain;

import biz.svyatoslav.enums.Gender;

public class Users {

    public NewUser getUserWithValidData() {
        return new NewUser("Name", 180, 80, Gender.MALE);
    }

    public NewUser getZeroWeightUser(){
        NewUser newUser =  new NewUser("Benya", 180, 0, Gender.MALE);
        return newUser;
    }

    public NewUser getUserWithNoData() {
       NewUser newUser = new NewUser("", 0, 0, Gender.MALE);
       return newUser;
    }

    public NewUser getUserWithNameAndWeight() {
        return new NewUser("Bob", 0, 80, Gender.MALE);
    }

    public NewUser getUserWithNoNameNoHeightValidWeightGenderMale() {
        NewUser user = new NewUser("", 0, 80, Gender.MALE);
        return user;
    }

    public NewUser getUserDataWithHeight() {
        return new NewUser("", 180, 0, Gender.MALE);
    }

    public NewUser getUserData() {
        return new NewUser("Eugene", 0, 0, Gender.MALE);
    }
}
