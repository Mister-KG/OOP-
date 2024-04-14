package com.example.StudentRegistrationLogin.Service;


import com.example.StudentRegistrationLogin.Dao.LoginDao;
import com.example.StudentRegistrationLogin.Dao.StudentDao;
import com.example.StudentRegistrationLogin.response.LoginResponse;

public interface StudentService {

    String addStudent(StudentDao studentDao);

    LoginResponse loginStudent(LoginDao loginDao);

}
