package com.hainlein.domain;
import com.hainlein.enums.ClassOfAnimal;

public class Pet {
    private String name;
    private String cardID;
    private int age;
    private String problemWithHealth;
    private String treatment;
    private ClassOfAnimal classOfAnimal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProblemWithHealth() {
        return problemWithHealth;
    }

    public void setProblemWithHealth(String problemWithHealth) {
        this.problemWithHealth = problemWithHealth;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public ClassOfAnimal getClassOfAnimal() {
        return classOfAnimal;
    }

    public void setClassOfAnimal(ClassOfAnimal classOfAnimal) {
        this.classOfAnimal = classOfAnimal;
    }
}
