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
        setName(name);
        setGender(gender);
        setShift(shift);
        setAge(age);
    }
    public void setName(String name) {
        try {
            int nameSize = name.length();
            if (nameSize>= 6 || nameSize<= 21) {
                this.name = name;
            }
            else {
                System.out.println(name.length());
                throw new IllegalArgumentException("Invalid name");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
    public void setGender(String gender) {
        try {
            if (gender == "Man" || gender == "Woman" || gender == "Non-Binary") {
                this.gender = gender;
            } else {
                throw new IllegalArgumentException("Gender must be: Man, Woman, or Non-Binary");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
    public void setShift(int shift) {
        try {
            if(shift==1||shift==2) {
                this.shift = shift;
            }
            else{
                System.out.println("Shift must be 1 for day or 2 for night");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
    }
    public void setAge(int age) {
        try {
            if(age >=18) {
                this.age = age;
            }
            else{
                throw new IllegalArgumentException("Invalid age");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
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
