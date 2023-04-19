package com.digital.utils;

import com.github.javafaker.Faker;

public class FakeDataProvider {
    public static  Faker faker= new Faker();
//    public static String generateName(){
//        return faker.name().firstName()+faker.name().lastName();
//    }

    public static void main(String[] args) {
        //System.out.println(generateName());
        System.out.println(FakeDataProvider.faker.name().fullName());
    }
}
