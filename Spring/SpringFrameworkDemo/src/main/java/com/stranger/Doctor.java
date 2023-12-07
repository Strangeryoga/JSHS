package com.stranger;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
//
    private String Qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "Qualification='" + Qualification + '\'' +
                '}';
    }

    //
//    public Doctor(String qualification) {
//        Qualification = qualification;
//    }
//
    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Method is called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct Method is called");
    }
}
