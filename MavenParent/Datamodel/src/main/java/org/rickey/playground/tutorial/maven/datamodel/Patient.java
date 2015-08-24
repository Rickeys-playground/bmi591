package org.rickey.playground.tutorial.maven.datamodel;

/**
 * Created by mhchowd1 on 8/23/2015.
 */
public class Patient {
    private String name;
    private int age;
    private int id;

    public Patient(){}
    public String getName() {return name;}
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
