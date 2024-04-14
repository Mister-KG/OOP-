package com.example.StudentRegistrationLogin.Service.Impl;

import com.example.StudentRegistrationLogin.Dao.LoginDao;
import com.example.StudentRegistrationLogin.Dao.StudentDao;
import com.example.StudentRegistrationLogin.Entity.Student;
import com.example.StudentRegistrationLogin.Repo.StudentRepo;
import com.example.StudentRegistrationLogin.Service.StudentService;
import com.example.StudentRegistrationLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

public class StudentImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String addStudent(StudentDao studentDao) {

        Student student = new Student(

                studentDao.getStudentId(),
                studentDao.getStudentname(),
                studentDao.getStudentaddress(),
                studentDao.getStudentemail(),
                this.passwordEncoder.encode(studentDao.getPassword())
        );

        studentRepo.save(student);
        return student.getStudentname();
    }

    @Override
    public LoginResponse loginStudent(LoginDao loginDao) {
        String msg="";
        Student student= studentRepo.findByEmail(loginDao.getEmail());
        if (student!=null){
            String password = loginDao.getPassword();
            String encodedPassword= student.getPassword();
            Boolean isPwdRight= passwordEncoder.matches(password,encodedPassword);
            if (isPwdRight){
                Optional<Student> student1= studentRepo.findOneByEmailAndPassword(loginDao.getEmail(),loginDao.getPassword());
                if (student1.isPresent()){
                    return new LoginResponse("Login Success",true);
                } else {
                    return new LoginResponse("Login Failed",false);
                }
            }else {
                return new LoginResponse("Password Not Match",false);
            }
        } else {
            return  new LoginResponse("Email does not exist",false);
        }

    }


    StudentDao studentDao;
}
