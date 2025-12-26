package com.repairnet.mapper;

import com.repairnet.dto.UserDto;
import com.repairnet.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface UserMapper {
    UserDto toDTO(User user);
    User toEntity(UserDto dto);
}
