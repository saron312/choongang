package com.example.team.board.repository;

import com.example.team.board.dto.SearchDto;
import com.example.team.board.entity.BoardEntity;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    public List<BoardEntity> boardList();

    @Select("SELECT * FROM BOARD WHERE board_id = #{id}")
    public BoardEntity boardArticle(int id);


    @Insert(
            "INSERT INTO board (title, content, board_pw)"+" "+
            " values ( #{title, jdbcType=VARCHAR}, #{content, jdbcType=VARCHAR}, #{board_pw, jdbcType=VARCHAR} )"
    )
    public void insert(BoardEntity boardEntity);

    @Delete(
            "DELETE FROM BOARD WHERE"+" "+
            "board_id = #{id}"
    )
    public void delete(int id);

    @Update(
            "UPDATE BOARD SET title = #{title}, content = #{content}, board_pw=#{board_pw} WHERE board_id=1;"+" "+
            "COMMIT;"
    )
    public void update(BoardEntity boardEntity);
}
