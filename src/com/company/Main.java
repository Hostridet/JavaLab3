package com.company;

public class Main {

    public static void main(String[] args) {
	    PersonalInfo person = new PersonalInfo("39 14 93438", "Moscow", "123-456-789-01");
        System.out.println(person.getPassport());
        System.out.println(person.getRegistration());
        System.out.println(person.getSnills());
    }
}
