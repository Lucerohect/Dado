/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dado.ui;

/**
 *
 * @author Hector Lucero
 */
public class Comment {
 
    private int commentId;
    private int postId;
    private String text;
    private String author;

    public Comment(int commentId, int postId, String text, String author) {
        this.commentId = commentId;
        this.postId = postId;
        this.text = text;
        this.author = author;
    }

  
    public int getCommentId() {
        return commentId;
    }

    public int getPostId() {
        return postId;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }


    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayComment() {
        System.out.println("Comment ID: " + commentId);
        System.out.println("Post ID: " + postId);
        System.out.println("Text: " + text);
        System.out.println("Author: " + author);
        System.out.println();
    }
}


