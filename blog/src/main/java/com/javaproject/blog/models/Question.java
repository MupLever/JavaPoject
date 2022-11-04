package com.javaproject.blog.models;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long question_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private String title, text;
    public Question() {}

    public Question(String title, String text, User user) {
        this.title = title;
        this.text = text;
        this.author = user;
    }
    public String GeTitleQuestion() { return this.title;   }
    public String GetTextQuestion() { return this.text;    }
    public User getAuthorQuestion() { return this.author;  }

    public void SetAuthorQuestion(User user)         { this.author = user; }
    public void SetTitleQuestion(final String title) { this.title = title; }
    public void SetTextQuestion(final String   text) { this.text = text;   }
}
