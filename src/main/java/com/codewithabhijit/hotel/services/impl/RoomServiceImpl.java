package com.codewithabhijit.hotel.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithabhijit.hotel.entities.Room;
import com.codewithabhijit.hotel.exceptions.ResourceNotFoundException;
import com.codewithabhijit.hotel.payloads.RoomDto;
import com.codewithabhijit.hotel.repositories.RoomRepo;
import com.codewithabhijit.hotel.services.RoomService;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepo roomRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public RoomDto createRoom(RoomDto roomDto) {
		
		Room room =this.modelMapper.map(roomDto, Room.class);
		
		Room  addedRoom = this.roomRepo.save(room);
		
	      
	
		
		return this.modelMapper.map(addedRoom, RoomDto.class);
	}

	@Override
	public RoomDto updateRoom(RoomDto roomDto ,Integer roomId) 
	{
		Room room = this.roomRepo.findById(roomId).orElseThrow(()->new ResourceNotFoundException ("Room","Room Id",roomId ));
		
		room.setRoomNumber(roomDto.getRoomNumber());
		room.setPrice(roomDto.getPrice());
		room.setCleaningStatus(roomDto.getCleaningStatus());
		room.setBedType(roomDto.getBedType());
		room.setAvailability(roomDto.getAvailability());
		
		Room updatedroom = this.roomRepo.save(room);
		
		
		return this.modelMapper.map(updatedroom,RoomDto.class );
	}

	@Override
	public RoomDto getRoom(Integer  roomId) {
		
		Room room =this.roomRepo.findById(roomId).orElseThrow(()->new ResourceNotFoundException ("Room","room Id",roomId ));
	   
		
		
		return this.modelMapper.map(room, RoomDto.class);
	}

	@Override
	public List<RoomDto> getRooms() {
	    List<Room> rooms = this.roomRepo.findAll();
	    List<RoomDto> roomDtos = rooms.stream()
	            .map(room -> this.modelMapper.map(room, RoomDto.class))
	            .collect(Collectors.toList());

	    return roomDtos;
	}

	@Override
	public void deleteRoom(Integer roomId) {
		
		Room room = this.roomRepo.findById(roomId).orElseThrow(()->new ResourceNotFoundException ("Room","room id",roomId));
		
		this.roomRepo.delete(room);
		
		

	}

}
