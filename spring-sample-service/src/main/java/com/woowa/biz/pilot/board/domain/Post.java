package com.woowa.biz.pilot.board.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "Post")
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified;

    public Post() {
    }

    public Post(Long id, String content, Date lastModified) {
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
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", lastModified=" + lastModified +
                '}';
    }
}