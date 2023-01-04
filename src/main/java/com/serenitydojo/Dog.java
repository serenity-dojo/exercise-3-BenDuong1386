package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    int age;
    private static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public static String makeNoise() {
        return DOG_NOISE;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }
}
