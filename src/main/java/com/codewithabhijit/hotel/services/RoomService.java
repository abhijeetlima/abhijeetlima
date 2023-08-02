package com.codewithabhijit.hotel.services;

import java.util.List;

import com.codewithabhijit.hotel.payloads.RoomDto;

public interface RoomService {
	
	
	
	//CREATE
	RoomDto  createRoom(RoomDto roomDto);
	
	//UPDATE
	RoomDto  updateRoom(RoomDto roomDto,Integer roomId);
	
	
	//get 
	RoomDto  getRoom(Integer roomId);
	
	
	
	//GET ALL
	List<RoomDto> getRooms();
	
	
	
	//DELETE
	void deleteRoom(Integer roomId);
	

}


