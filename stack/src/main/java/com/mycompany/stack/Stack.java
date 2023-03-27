/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stack;

import java.util.EmptyStackException;

import org.w3c.dom.Node;

/**
 *
 * @author D00251715
 */
public class Stack {
    protected Node first;
    protected int size;
    
    public Stack() {
        first = null;
        size = 0;
    }
    
    public boolean push(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
        return true;
    }
    
    public int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return first.data;
    }
    
    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int original = first.data;
        first = first.next;
        size--;
        return original;
    }
    
    public boolean isEmpty() {
        return first == null;
    }

    public int count() {
        return size;
    }
    
    public void printCelebrate(){
        System.out.println("Celebrate good times come on!");
    }

    protected static class Node {

        protected int data;
        protected Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }
}