/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stackassignment;

import java.util.List;

/**
 *
 * @author ِABO-DALAL
 */
public class StackEmploymentRequests<E> extends LinkedList<E> {
      private LinkedList<E> data;
      private int top;
    public StackEmploymentRequests() {
        this.data = new LinkedList<>();
        top=-1;
    }

     public void push(E e){
        data.addLast(e);
        top++;
    }
     public E pop(){
        return data.removeLast();
        
    }
     public E top(){
        return data.getLast();
    }
     public E indexOfStack(E e){
       int i=  data.indexOf(e);
       return data.get(i);
     }
     public int getSize(){
         return data.getSize();
     }
          public List<E> getretriveItems(){
         return data.retriveItems();
     }
}
