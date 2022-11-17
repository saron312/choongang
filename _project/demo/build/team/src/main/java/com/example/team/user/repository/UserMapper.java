package com.example.team.user.repository;

import java.util.List;

import com.example.team.user.entity.UserInfoEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

//    @Select("select * from userinfo")
//    @Results({
//            @Result(property = "userId", column = "userid"),
//            @Result(property = "password", column = "password")
//    })
    public void save(UserInfoEntity userInfoEntity);
    public List<UserInfoEntity> selectAll();

    @Select("SELECT * FROM USERINFO userid = #{userid}")
    UserInfoEntity findByUserId(@Param("userid") String userid);

}
