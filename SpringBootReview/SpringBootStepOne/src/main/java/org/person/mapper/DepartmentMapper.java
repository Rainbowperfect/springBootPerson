package org.person.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.person.pojo.Department;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDepartmentId(Integer id);
}
