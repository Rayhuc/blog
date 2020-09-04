package com.rayhuc.mapper;

import com.rayhuc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User queryByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
