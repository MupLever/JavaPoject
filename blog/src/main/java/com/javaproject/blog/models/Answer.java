package com.javaproject.blog.models;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn(name = "user_id")
    private User author;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Question question;

    private String title, text;
    public Answer() {}
    public Answer(String title, String text, Question question ,User user) {
        this.title = title;
        this.text = text;
        this.question = question;
        this.author = user;
    }
    public String GetTitleAnswer()        { return this.title;    }
    public String GetTextAnswer()         { return this.text;     }
    public User GetAuthorAnswer()         { return this.author;   }
    public Question GetQuestionOfAnswer() { return this.question; }
    
    public void SetTitleAnswer(String title)           { this.title = title;       }
    public void SetTextAnswer(String text)             { this.text = text;         }
    public void SetAuthorAnswer( User user)            { this.author = user;       }
    public void SetQuestionOfAnswer(Question question) { this.question = question; }
}
