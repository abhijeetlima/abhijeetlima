/*
 * package com.codewithabhijit.hotel.services.impl;
 * 
 * import org.modelmapper.ModelMapper; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.codewithabhijit.hotel.entities.User; import
 * com.codewithabhijit.hotel.payloads.UserDto; import
 * com.codewithabhijit.hotel.repositories.UserRepo; import
 * com.codewithabhijit.hotel.services.UserService;
 * 
 * @Service
 */
/*public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper modelMapper;
    
    
    @Autowired
    private UserRepo userRepo;

    @Override
    public String authenticate(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);

        // Replace this with your actual authentication logic
        if ("admin".equals(user.getUsername())) {
            return "Admin";
        } else if ("recp".equals(user.getUsername())) {
            return "Recp";
        } else {
            return "None";
        }
    }

}*/

