package com.strangeryoga.spring.data.jpa.repo;

import com.strangeryoga.spring.data.jpa.entity.Guardian;
import com.strangeryoga.spring.data.jpa.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepoTest {
    @Autowired
    private StudentRepo studentRepo;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("stranger@gmail.com")
                .firstName("Stranger")
                .lastName("Yoga")
                //.guardianName("Cris")
                //.guardianEmail("cris@gmail.com")
                //.guardianMobile("8293892839")
                .build();
        studentRepo.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian  = Guardian.builder()
                .email("mno@gmail.com")
                .name("mango")
                .mobile("8239283998")
                .build();

        Student student = Student.builder()
                .emailId("abc@gmail.com")
                .firstName("Abc")
                .lastName("Xyz")
                .guardian(guardian)
                .build();
        studentRepo.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepo.findAll();

        System.out.println("studentList = "+ studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> students =
                studentRepo.findByFirstName("Abc");

        System.out.println("students = "+ students);
    }

    @Test
    public void printStudentByFirstNameContaining() {
        List<Student> students =
                studentRepo.findByFirstNameContaining("St");

        System.out.println("students = "+ students);
    }

    @Test
    public void printStudentBasedOnGuardianName() {
        List<Student> students =
                studentRepo.findByGuardianName("mango");

        System.out.println("students = "+ students);
    }

    @Test
    public void printgetStudentByEmailAddress() {
        Student student =
                studentRepo.getStudentByEmailAddress(
                        "abc@gmail.com"
                );

        System.out.println("student = "+ student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress() {
        String firstName =
                studentRepo.getStudentFirstNameByEmailAddress(
                        "stranger@gmail.com"
                );
        System.out.println("firstName = "+ firstName);
    }

    @Test
    public void printgetStudentByEmailAddressNative() {
        Student student =
                studentRepo.getStudentFirstNameByEmailAddressNative(
                        "abc@gmail.com"
                );
        System.out.println("student = "+ student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepo.getStudentFirstNameByEmailAddressNativeNamedParam(
                        "abc@gmail.com"
                );
        System.out.println("student = "+ student);
    }

    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepo.updateStudentNameByEmailId(
                "crisproar",
                "abc@gmail.com"
        );
    }


}