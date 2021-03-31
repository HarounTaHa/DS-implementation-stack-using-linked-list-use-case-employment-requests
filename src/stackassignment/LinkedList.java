/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackassignment;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ِABO-DALAL
 * @param <E>
 */
public class LinkedList<E> {
    
    private Node<E> head = null;
    private Node<E> tail= null ;
    private int size = 0 ;

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

 
   
    
    public LinkedList() {
    }
        public int size(){
            return size;
        }
    
    public boolean isEmpty(){
        return size==0;
    }  
     
    public E getFirst(){
        if(isEmpty()){
        return null;
    }
        return head.getElement();
    }
    
    public E getLast(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    
    public E get(int index){
            if(isEmpty()){
                return null;
            }
            if (index<size){
                Node<E> element=head;
                int counter=0;
                while(counter != index){
                   element=element.getNext();     
                    counter++;
                }
               return element.getElement();   
            }else{
             return null;   
            }
    }
    
    public void addFirst(E e){
        head=new Node<>(e,head);
        if(size==0){
            tail=head;
        }
        size++;
    }
    public void addLast(E e){
       Node<E> newest = new Node<>(e,null);
        
        if(isEmpty()){
            head=newest;
            
        }else{
            tail.setNext(newest);
        }
    tail=newest; 
    size++;
    
    }
    
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size==0){
            tail=null;
        }
        return answer;
      
        
    }
    
        public E removeLast(){
        if(isEmpty()){
            return null;
        }
        if(size==1 && head!=null){
            E element = head.getElement();
            head=null;
            tail=head;
            return element;              
        }
        E element = tail.getElement(); 
        Node<E> temp=head;
        while(temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        tail=temp;
        temp.next=null;
        size--;
        return element;
    }
        
        
///////////////////////////  HOME WORk  //////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
//        add method remove();
        public boolean remove(int index){
              if(isEmpty()){
            return false;
         }
            if(size<index){
              return false;
            }
         
            if (index<size){
                
             
                Node<E> element=head;
                int counter=0;
                while(counter != index){
                   element=element.getNext();     
                    counter++;
                }
               Node<E> next = element.next;
               element.element=null;
               head=next;
               size--;
              return true;
            }else{
             return false;   
            }
        }
        
//****************************************************************************
        //        add method indexOF();
          public int indexOf(E index){
              Node<E> element=head;
              int counterIndex=0;
              if(index!=null){ 
              for (element=head; counterIndex < size; element=element.next) {
                  if(element.getElement().equals(index)){
                      return counterIndex;  
                  }
                    counterIndex++;
              }
              }else{
                   for (element=head; counterIndex < size; element=element.next) {
                  if(element.getElement()==null){
                      return counterIndex;  
                  }
                    counterIndex++;
              }
      }
     
          return -1;
          }
          
         public List<E> retriveItems(){
              Node<E> element=head;
              List<E> items=new ArrayList<>();
              int i=0;
              for (element=head; i < size; element=element.next) {
                  E e = element.getElement(); 
                  items.add(e);
                  i++;
              }
              return items;
          }
    
    public static class Node<E> {
            private E element;
            private Node<E> next;
        public Node(E e , Node<E> n) {
       element =e;
       next=n;
        
        }
        
        public E getElement(){
            return element;
        }
        
        public Node<E> getNext(){
            return next;
        }
        
        public void setNext(Node<E> n){
            next=n;
        }
        
        
    }
    
}
