package com.woowa.biz.pilot.board.controller;

import java.util.Date;

public class PostResponse {
    private Long id;
    private String content;
    private Date lastModified;

    public PostResponse(Long id, String content, Date lastModified) {
        this.id = id;
        this.content = content;
        this.lastModified = lastModified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "PostResponse{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", lastModified=" + lastModified +
                '}';
    }
}
