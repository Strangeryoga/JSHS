package org.jsp.Bulding_Rooms_controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.Bulding_Rooms_dao.Bulding_Rooms_dao;
import org.jsp.Bulding_Rooms_dto.Bulding;
import org.jsp.Bulding_Rooms_dto.Rooms;

public class Bulding_Rooms_controller {

	public static void main(String[] args) {
		Bulding bl=new Bulding();
		bl.setName("JSpi");
		bl.setAddress("near thane station");
		
		Rooms rm=new Rooms();
		rm.setRname("marine drive");
		rm.setAddress("2nd floor");
		rm.setPhoneno(382938982);
		
		bl.setRooms(rm);

		
//		Rooms rm1=new Rooms();
//		rm.setRname("marine drive");
//		rm.setAddress("2nd floor");
//		rm.setPhoneno(382938982);
//		bl.setRooms(rm1);
			
		
		
		
		Bulding_Rooms_dao dao=new Bulding_Rooms_dao();
		dao.saveBulding(bl);
//		dao.saveRooms(rm);
		
		
		
	}
}
