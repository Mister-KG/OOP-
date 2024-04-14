package com.example.StudentRegistrationLogin.StudentController;

import com.example.StudentRegistrationLogin.Dao.LoginDao;
import com.example.StudentRegistrationLogin.Dao.StudentDao;
import com.example.StudentRegistrationLogin.Service.StudentService;
import com.example.StudentRegistrationLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")

public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping(path =  "/save")
    public String saveStudent(@RequestBody StudentDao studentDao){
        String id = studentService.addStudent(studentDao);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginStudent(@RequestBody LoginDao loginDao){
        LoginResponse loginResponse=studentService.loginStudent(loginDao);
        return ResponseEntity.ok(loginResponse);
    }
}
