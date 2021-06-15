package demmy.mcube.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity   //linking to a DB
//serialise helps to convert to different types of Strings
public class Employee implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false) // it can not be updated
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false) // it can not be updated
    private String employeeCode;

    public Employee(){}

    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode){
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    // for printing
    @Override
    public String toString(){
        return "Employee{" +
                "id =" + id +
                ", name ='" + name +  '\'' +
                ", email ='" + email +  '\'' +
                ", phone ='" + phone +  '\'' +
                ", imageUrl ='" + imageUrl +  '\'' +
                '}';
    }


}
