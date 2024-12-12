/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author esma
 */
public class LinkedList {
    
class Node 
    {
      int data;
      Node next;
      
      Node (int data)
      {
          this.data = data;
          this.next = null;
          
      }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
      
        
    }
    
    
    Node head;
    
    // Method to append a new node at the end of the list
    public void append (int data)
    {
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        
        Node current = head;
        while(current.next != null)/*Döngü, listenin son düğümünü bulmak için kullanılır. Son düğümü bulduktan sonra, yeni düğümü eklemeniz gereken yer orasıdır.*/
        {
            current = current.next;
            
        }
        current.next = new Node (data);
        
        
    }
    
    
    public static Node concatenate(Node L ,Node M)
    {
        
        if( L == null)
        {
          return M;
          
        }
        
        Node current = L;
        while(current.next != null)
        {
            current = current.next;
            
        }
        //Lİnk the last node of L to the head of the M
        current.next = M; 
        
        // Return the head of the concatenated list (which is the head of L)
        return L;
        
        
    }
    
        public void display ()
        {
            Node current = head;
            while (current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    
    
    
    
    
    
    
    
    
    
    
    
}
