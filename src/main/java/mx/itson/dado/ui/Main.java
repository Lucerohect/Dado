/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.dado.ui;

/**
 *
 * @author Hector Lucero
 */
public class Main {

    public static void main(String[] args) {
        
        Post post1 = new Post(1, "Eclipse", "Este fin de semana hubo un eclipse", "Lucero");
        Comment comment1 = new Comment(101, 1, "No lo alcance a ver", "Hector");

        System.out.println("Post 1:");
        post1.displayPost();

        System.out.println("Comment 1:");
        comment1.displayComment();
    }
}

