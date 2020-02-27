package com.crudspringbootmongodb2;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee<string> {
    private int id;
    private string name;
    private string designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getDesignation() {
        return designation;
    }

    public void setDesignation(string designation) {
        this.designation = designation;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                ", designation=" + designation +
                '}';
    }
}
