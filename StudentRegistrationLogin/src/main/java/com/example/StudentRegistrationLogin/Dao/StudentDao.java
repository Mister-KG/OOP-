package com.example.StudentRegistrationLogin.Dao;

public class StudentDao {

    private int studentId;
    private String studentname;
    private String studentaddress;
    private String studentemail;
    private String password;

    public StudentDao(int studentId, String studentname, String studentaddress, String studentemail, String password) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studentaddress = studentaddress;
        this.studentemail = studentemail;
        this.password = password;
    }

    public StudentDao() {
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

    @Override
    public String toString() {
        return "StudentDao{" +
                "studentId=" + studentId +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", studentemail='" + studentemail + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
