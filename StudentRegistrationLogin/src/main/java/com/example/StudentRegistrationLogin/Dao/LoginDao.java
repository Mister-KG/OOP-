package com.example.StudentRegistrationLogin.Dao;

public class LoginDao {
    private String email;
    private String password;

    public LoginDao(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginDao() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
