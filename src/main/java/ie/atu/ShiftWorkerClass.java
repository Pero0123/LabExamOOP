package ie.atu;
import java.util.*;
import java.io.*;
public class ShiftWorkerClass {
    private String name;
    private String gender;
    private int shift;
    private int age;

    ShiftWorkerClass()
    {
        //default constructor
    }

    ShiftWorkerClass(String name, String gender, int shift, int age)
    {
        this.name = name;
        this.gender = gender;
        this.shift = shift;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        if(gender == "Man"||gender=="Woman"||gender=="Non-Binary") {
            this.gender = gender;
        }
        else{
            System.out.println("Gender must be: Man, Woman, or Non-Binary");
        }
    }
    public void setShift(int shift) {
        if(shift==1 || shift==2) {
            this.shift = shift;
        }
        else{
            System.out.println("Shift must be 1 for day or 2 for night");
        }
    }
    public void setAge(int age) {
        if(age >=18) {
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }
    public int getAge() {
        return age;
    }
    public int getShift() {
        return shift;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
}
