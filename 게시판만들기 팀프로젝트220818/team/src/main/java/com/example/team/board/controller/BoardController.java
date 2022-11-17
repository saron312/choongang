package com.example.team.board.controller;

import com.example.team.board.entity.BoardEntity;
import com.example.team.board.service.BoardService;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    // BOARD LIST with PAGE HELPER LIBRARY
    @GetMapping("/list")
    public String boardList(@RequestParam(required = false, defaultValue = "1") int pageNum, Model model){
        int pageSize = 10;
        PageInfo<BoardEntity> pageInfo = boardService.boardList(pageNum,pageSize);
        model.addAttribute("articles",pageInfo);
        return "boardList";
    }

    @GetMapping("/view-article")
    public String boardArticle(@RequestParam int id, Model model){
        BoardEntity be = boardService.boardArticle(id);
        model.addAttribute("viewArticle", be);
        return "viewArticle";
    }

    // WRITE ARTICLE
    @GetMapping("/write-article")
    public String insert(){
        return "writeForm";
    }

    @PostMapping("/write-article")
    public String insert(@ModelAttribute BoardEntity boardEntity){
        boardService.insert(boardEntity);
        return "redirect:/board/list";
    }

    // DELETE ARTICLE
    @GetMapping("/delete-article")
    public String delete(@RequestParam int board_id){
        boardService.delete(board_id);
        return "redirect:/board/list";
    }

    // UPDATE ARTICLE
    @GetMapping("/update-article")
    public String update(@RequestParam int board_id, @RequestParam String board_pw, Model model){
        model.addAttribute("board_id",board_id);
        model.addAttribute("board_pw",board_pw);
        return "updateForm";
    }

    @PostMapping("/update-article")
    public String update(@ModelAttribute BoardEntity boardEntity){
        boardService.update(boardEntity);
        return "redirect:/board/list";
    }
}