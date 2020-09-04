package com.rayhuc.mapper;

import com.rayhuc.domain.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeMapper {

    int saveType(Type type);

    Type getTypeById(Long id);

    Type getTypeByName(String name);

    List<Type> getAllType();

    List<Type> getAdminType();

    int deleteType(Long id);

    int updateType(Type type);


}
