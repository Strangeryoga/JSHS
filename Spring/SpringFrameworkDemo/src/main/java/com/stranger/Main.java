package com.stranger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

//        Staff staff = context.getBean(Nurse.class);
//        staff.assist();

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
//        System.out.println(doctor.getQualification());
//       < System.out.println(doctor);
//
//        Doctor doctor1 = context.getBean(Doctor.class);
//        doctor.assist();
//        System.out.println(doctor1);>
    }
}