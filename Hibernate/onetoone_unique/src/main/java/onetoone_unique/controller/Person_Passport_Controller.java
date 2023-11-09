package onetoone_unique.controller;

import java.util.List;

import onetoone_unique.dao.Person_Passport_Dao;
import onetoone_unique.dto.Passport;
import onetoone_unique.dto.Person;

public class Person_Passport_Controller {
	public static void main(String[] args) {
		
		Person person=new Person();
		person.setId(1);
		person.setName("yogo");
		person.setAddress("Boston");
		
		Passport passport =new Passport();
		passport.setId(1001);
		passport.setName("killer");
		passport.setDate_of_issue("83-2-00");
		
		person.setPassport(passport);
		
		Person_Passport_Dao ppd=new Person_Passport_Dao();
//		ppd.savePerson(person); //to save person records as well as passport
//		ppd.update(person); //to update person records as well as passport
//		ppd.updatePassport(passport); //to update passport records 
//		ppd.savePassport(passport);  //to save passport records
		
		
//		ppd.findPerson(2);
		
//		ppd.removePerson(1);
		
//		ppd.findAll();
		
		List<Person> list=ppd.findAll1();
		System.out.println(list);
	}

}
