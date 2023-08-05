package com.codewithabhijit.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import com.codewithabhijit.hotel.payloads.ApiResponse;
import com.codewithabhijit.hotel.payloads.RoomDto;
import com.codewithabhijit.hotel.services.RoomService;

import javax.validation.Valid;


@RestController
@RequestMapping("/room")
@CrossOrigin(origins = "http://localhost:3000") 
public class RoomController {

    @Autowired
    private RoomService roomService;

    
    //CREATE
    
    @PostMapping("/")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<RoomDto> createRoom(@Valid @RequestBody RoomDto roomDto) {
    	
    
        RoomDto createRoom = this.roomService.createRoom(roomDto);
        System.out.println(createRoom.getBedType());
        return new ResponseEntity<RoomDto>(createRoom, HttpStatus.CREATED);
    }
    
    //UPDATE

    @PutMapping("/{roomId}")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<RoomDto> updateRoom(@Valid  @RequestBody RoomDto roomDto, @PathVariable Integer roomId) {
        RoomDto updatedRoom = this.roomService.updateRoom(roomDto, roomId);
        return new ResponseEntity<RoomDto>(updatedRoom, HttpStatus.OK);
    }

    @DeleteMapping("/rooms/{roomId}")
//    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<ApiResponse> deleteRoom(@PathVariable Integer roomId) {
        this.roomService.deleteRoom(roomId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Room is deleted successfully", true), HttpStatus.OK);
    }

    @GetMapping("/rooms/{roomId}")
//    @PreAuthorize("hasAuthority('USER')")
    public ResponseEntity<RoomDto> getRoom(@PathVariable Integer roomId) {
        RoomDto roomDto = this.roomService.getRoom(roomId);
        return new ResponseEntity<RoomDto>(roomDto, HttpStatus.OK);
    }

    @GetMapping("/")
//    @PreAuthorize("hasAuthority('USER')")
    public ResponseEntity<List<RoomDto>> getRooms() {
    
        List<RoomDto> rooms = this.roomService.getRooms();
        return ResponseEntity.ok(rooms);
    }
}
