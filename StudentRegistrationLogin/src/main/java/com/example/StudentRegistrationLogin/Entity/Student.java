package com.example.StudentRegistrationLogin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Column(name = "student_name", length = 255)
    private String studentname;

    @Column(name = "student_address",length = 255)
    private String studentaddress;

    @Column(name = "student_email",length = 255)
    private String studentemail;

    @Column(name = "student_password",length = 255)
    private String password;

    public Student(int studentId, String studentname,
                   String studentaddress, String studentemail,
                   String password) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
        this.studentemail = studentemail;
        this.password = password;
    }

    public Student() {
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public String getStudentemail() {
        return studentemail;
    }

    public void setStudentemail(String studentemail) {
        this.studentemail = studentemail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
