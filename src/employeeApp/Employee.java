package employeeApp;

import java.util.Arrays;

public class Employee {
    private long id;
    private  String fullName;
    private  String email;
    private  String password;
    private  String[] healthplans;


    public Employee(long id, String fullName, String email, String password,String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public void addHealthPlan(int index, String name){
        if(index < 0  || index >= healthplans.length){
            System.out.println("İndex değeri geçersiz");
            return;
        }// GEÇERLİ İNDEXMİ

        if(healthplans[index] !=null){
            System.out.println("Bu index dolu.");
        }else{
            healthplans[index] = name;
            System.out.println("Eklendi " + name);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}