package ClassJustWrite;

import java.sql.SQLOutput;

public class Student {
    private String name = "john";

    private String classes = "C02";

    public Student() {};

    protected void setName(String name){
        this.name = name;
    }

    protected void setClasses(String classes){
        this.classes = classes;
    }

    public void display() {
        System.out.println("name : " + name + "\nclasses : "  +classes);
    }

}
