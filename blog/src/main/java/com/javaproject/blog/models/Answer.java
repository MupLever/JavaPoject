package com.javaproject.blog.models;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long answer_id;

    @ManyToOne(fetch = FetchType.EAGER)
    private User author;

    @ManyToOne(fetch = FetchType.EAGER)
    private Question question;

    private String title, text;
    public Answer() {}
    public Answer(String title, String text, Question question ,User user) {
        this.title = title;
        this.text = text;
        this.question = question;
        this.author = user;
    }
    public String GetTitleAnswer() { return this.title; }
    public String GetTextAnswer() { return this.text;  }
    // public String GetAuthorAnswer() { return this.author; }
    // public String GetQuestionOfAnswer() { return this.question; }
    
    public void SetTitleAnswer(final String title) { this.title = title; }
    public void SetTextAnswer(final String text)   { this.text = text;   }
}
