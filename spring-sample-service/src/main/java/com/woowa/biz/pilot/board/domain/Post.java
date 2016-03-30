package com.woowa.biz.pilot.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Data
public class Post {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String content;
}