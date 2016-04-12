package com.vsu.at.voicerecorder;

/**
 * Created by apcom on 12.04.2016.
 */
public class Speaker {
    private static Speaker ourInstance = new Speaker();
    private static String name;
    private static int age;
    private static int gender; /* 0 - мужской, 1 - женский */

    public static Speaker getInstance() {
        return ourInstance;
    }

    private Speaker() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Speaker.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Speaker.age = age;
    }

    public static int getGender() {
        return gender;
    }

    public static void setGender(int gender) {
        Speaker.gender = gender;
    }
}
