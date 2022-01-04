package com.yanazaitsava.spring.mvc;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Employee {
    @Size(min=2, message = " name must be min 2 symbols")
    private String name;
    //@NotEmpty(message = " surname is required field") //@NotEmpty треб. чтобы значение было ни null, и ни пустым значением
    @NotBlank(message = " surname is required field") //@NotBlank выпол. те же функции, что @NotEmpty и проверяет отсутс. неск. пробелов
    private String surname;
    private int salary;
    private String department;
    private String carBrand;


    private Map<String,String> departments;

    private Map<String,String> carBrands;

    private String[] languages;

    private Map<String,String> languageList;



    public Employee() {
        departments=new HashMap<>();
        departments.put("IT","Information Technology");// первое значение выводится, второе показывается в выпад. списке
        departments.put("HR","Human Resources");
        departments.put("Sales","Sales");

        carBrands=new HashMap<>();
        carBrands.put("BMW","BMW");
        carBrands.put("Audi","Audi");
        carBrands.put("Mercedes-Benz","MB");

        languageList=new TreeMap<>();
        languageList.put("English","EN");
        languageList.put("Deutch","DE");
        languageList.put("French","FR");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
