package com.example.team.mainpage.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommonMapper {
    @Update(
            "CREATE TABLE userinfo " +
            "(userid VARCHAR(20) Primary KEY, password VARCHAR(20) NOT NULL);"+"\n"+

            "CREATE TABLE board " +
            "( board_id LONG PRIMARY KEY AUTO_INCREMENT, title VARCHAR(1000) NOT NULL , content VARCHAR(5000), "+
            "board_pw VARCHAR(1000) NOT NULL);"+"\n"+

            "INSERT INTO userinfo (userid, password) " +
            "values ('logo', 1234), ('usuu', 1233), ('lotto',5452), ('human',12354),('pineapple',5453)," +
                    " ('rumor',123541), ('apple',5454), ('easy',12354), ('bbad',5452), ('agood',12354),('farmer',5452)," +
                    " ('fisher',12354);"+"\n"+

            "INSERT INTO board (title, content, board_pw) " +
            "VALUES('articleExample','ContentExample', 1234 ), ('articleExample','ContentExample', 1234 )," +
                    "( 'articleExample','articleContentExample', 1234 ), ('articleExample','ContentExample', 1234 )," +
                    "( 'articleExample','articleContentExample', 1234 ), ('articleExample','ContentExample', 1234 )," +
                    "( 'articleExample','articleContentExample', 1234 ), ('articleExample','ContentExample', 1234 )," +
                    "( 'articleExample','articleContentExample', 1234 ), ('articleExample','ContentExample', 1234 )," +
                    "( 'articleExample','articleContentExample', 1234 ), ('articleExample','ContentExample', 1234 );"

    )
    void init();
}
