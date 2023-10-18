/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dado.ui;

/**
 *
 * @author Hector Lucero
 */
public class Post {
 
 
    private int postId;
    private String title;
    private String content;
    private String author;
    private int likes;
    private int dislikes;

    public Post(int postId, String title, String content, String author) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.likes = 55; 
        this.dislikes = 34; 
    }

   
    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

  
    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void incrementLikes() {
        likes++;
    }

    public void incrementDislikes() {
        dislikes++;
    }

    public void displayPost() {
        System.out.println("Post ID: " + postId);
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
        System.out.println("Likes: " + likes);
        System.out.println("Dislikes: " + dislikes);
        System.out.println();
    }
 }



