package com.example.mapper;

import com.example.entity.Student;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student WHERE _num = #{_num}")
    Student findByNum(@Param("_num") int _num);
}
