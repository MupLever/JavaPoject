package com.javaproject.blog.models;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long answer_id;
    private long answer_user_id;
    private long answer_question_id;
    private String title, text;

    final public String GeTitleAnswer() { return this.title; }
    final public String GetTextAnswer() { return this.text; }
    
    public void SetTitleAnswer(final String title) { this.title = title; }
    public void SetTextAnswer(final String text)   { this.text = text;   }
}
