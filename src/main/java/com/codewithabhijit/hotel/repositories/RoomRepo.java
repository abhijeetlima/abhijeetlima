package com.codewithabhijit.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithabhijit.hotel.entities.Room;

public interface RoomRepo extends JpaRepository<Room,Integer> {

}
