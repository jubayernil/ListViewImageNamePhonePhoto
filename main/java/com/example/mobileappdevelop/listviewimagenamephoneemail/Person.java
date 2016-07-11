package com.example.mobileappdevelop.listviewimagenamephoneemail;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 11-7-16.
 */
public class Person {
    private String name;
    private String phone;
    private String email;
    private int imageId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Person() {
    }

    public Person(int imageId, String name, String phone, String email) {
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.imageId = imageId;
    }

    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(R.drawable.bill, "Bill", "123", "bill@live.com"));
        persons.add(new Person(R.drawable.jack, "Jill", "123", "jack@live.com"));
        persons.add(new Person(R.drawable.larry, "Larry", "123", "larry@live.com"));
        persons.add(new Person(R.drawable.mark, "Mark", "123", "mark@live.com"));
        return persons;
    }
}
