package com.javaproject.blog.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long question_id;
    private long question_user_id;
    private String title, text;
    public Question() {}

    public Question(String title, String text) {
        this.title = title;
        this.text = text;
    }
    final public String GeTitleQuestion() { return this.title; }
    final public String GetTextQuestion() { return this.text;  }
    
    public void SetTitleQuestion(final String title) { this.title = title; }
    public void SetTextQuestion(final String   text) { this.text = text;   }
}
