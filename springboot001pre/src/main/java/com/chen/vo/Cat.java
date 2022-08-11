package com.chen.vo;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author hainc
 * @Date 2022/8/11 10:03
 * @Version 1.0
 **/
public class Cat {
    private String cardId;
    private String name;
    private Integer age;

    public Cat() {
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat(String cardId, String name, Integer age) {
        this.cardId = cardId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "cardId='" + cardId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
