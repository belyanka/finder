package com.birb.finder;

/**
 * Created by belyanka on 01.06.2017.
 */
public class Bird {

    private String name;
    private String latinName;
    private String sex;

    public Bird(String name, String latinName, String sex) {
        this.name = name;
        this.latinName = latinName;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
