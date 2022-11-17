package com.example.team.board.service;

import com.example.team.board.entity.BoardEntity;
import com.example.team.board.repository.BoardMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public PageInfo<BoardEntity> boardList(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return PageInfo.of(boardMapper.boardList());
    }
    public BoardEntity boardArticle(int id){
        return boardMapper.boardArticle(id);
    }
    public void insert(BoardEntity boardEntity){
        boardMapper.insert(boardEntity);
    }
    public void delete(int id){
        boardMapper.delete(id);
    }
    public void update(BoardEntity boardEntity){
        boardMapper.update(boardEntity);
    }
}