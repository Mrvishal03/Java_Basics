package May10_Collection;

 class node
 {
       int data;
       node next;
      
     node insertEnd(node head ,int d)
       {
           node newnode = new node();
           newnode.data = d;
           newnode.next=null;
           if (head==null)
           {
            head = newnode;
            return head; 
           }
          
          
           
       
        node temp = head;
        while(temp.next!= null)
        {
            temp =temp.next;
        }
        temp.next = newnode;
        return head;

    
    }
    void display(node head)
    {
     node temp = head;
     while (temp!=null) {
        System.out.print(temp.data);
        temp = temp.next;
        
     }
    }


      
 

public class LinkedList_Intro {
    public static void main(String[] args) {
      
        node head = null;
       
        node obj = new node();
       head = obj.insertEnd(head,11);
       head = obj.insertEnd(head,22);
       obj.display(head);


    }
}
 }