package com.example.team.board.entity;

import lombok.Data;

@Data
public class BoardEntity {
    private Long board_id;
    private String title;
    private String content;
    private String board_pw;

}
