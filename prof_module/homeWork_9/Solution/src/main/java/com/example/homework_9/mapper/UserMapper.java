package com.example.homework_9.mapper;

import com.example.homework_9.dto.UserDto;
import com.example.homework_9.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends GenericMapper<User, UserDto>{

    protected UserMapper(ModelMapper mapper) {
        super(mapper, User.class, UserDto.class);
    }
}

