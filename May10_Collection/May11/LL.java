package May10_Collection.May11;

class Link {
    int data;
    Link next;

    Link(int x) {
        data = x;
    }
}

class additionalFunction {
    public Link insertEnd(Link head, int d) {
        Link newnode = new Link(d);
        if (head == null) {
            return newnode;
        }
        Link temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    public Link insertBeg(Link head, int item) {
      
        Link newnode = new Link(item);
        newnode.next = head;
        head = newnode;
        return head;

    }

    public void display(Link head) {
        Link temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }

    public Link insertAfterGivenLocation(Link head, int item, int data) {
      

        Link newnode = new Link(data);
        Link temp = head;
        while (temp != null) {

            if (temp.data == item) {
                newnode.next = temp.next;
                temp.next = newnode;
                break;

            }
            temp = temp.next;
        }
        return head;
    }

    public Link insertBeforeGivenLocation(Link head, int item, int data) {
        

        Link newnode = new Link(data);
        Link temp = head;
        Link prev = null;
        while (temp != null) {

            if (temp.data == item) {
                newnode.next = prev.next;
                prev.next = newnode;
                break;

            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    public Link DeleteEnd(Link head) {
        
        Link prev = null;
        Link temp = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;

    }

    public Link DeleteBegning(Link head)
    {
       head = head.next;
       return head;

    }

    public Link DeleteSpecificElement(Link head ,int item)
    {
       Link temp=head;
       Link prev=null;
       while(temp!=null)
       {
          if (item ==temp.data) {
            prev.next=temp.next;
             break;
          }
        prev = temp;
        temp = temp.next;
       }
       return head;
    }

   public Link SwappingTwoNodes (Link head ,int item1,int item2)
   {

    Link temp1 = head;
    Link temp2 = head;
    while (temp1!=null) {
        if (item1==temp1.data) {
            break;
        }
        temp1 = temp1.next;
    }
    while (temp2!=null) {
        if (item2==temp2.data) {
            break;
        }
        temp2 = temp2.next;
    }
    if (temp1!=null && temp2!=null) {
        int t = temp1.data;
        temp1.data = temp2.data;
        temp2.data = t;

    }
    return head;
   }

   public Link iterateReverse( Link head){
    Link curr = head;
    Link prev= null;
    while (curr!= null ) {
        Link temp = curr.next;
        curr.next = prev;
         prev = curr;
         curr = temp;   
    }
    return prev;
   }



}
public class LL {
    public static void main(String[] args) {
        additionalFunction obj = new additionalFunction();
        Link head = null;
        head = obj.insertEnd(head, 11);
        head = obj.insertEnd(head, 22);
        head = obj.insertEnd(head, 33);
        head = obj.insertEnd(head, 44);
        head = obj.insertEnd(head, 55);
        obj.display(head);

        System.out.println("Insert at begining:");
        head = obj.insertBeg(head, 88);
        obj.display(head);

        System.out.println("Insert after given location:");
        head = obj.insertAfterGivenLocation(head, 22, 66);
        obj.display(head);

        System.out.println("Insert before specific location");
        head = obj.insertBeforeGivenLocation(head, 22, 66);
        obj.display(head);

        System.out.println("Delete last node");
        head = obj.DeleteEnd(head);
        obj.display(head);

        System.out.println("Delete 1st node");
        head=obj.DeleteBegning(head);
        obj.display(head);

        System.out.println("Delete Specific Location");
        head=obj.DeleteSpecificElement(head, 22);
        obj.display(head);

        System.out.println("Swapping Two Nodes ");
        head = obj.SwappingTwoNodes(head, 11, 44);
        obj.display(head);
          
        System.out.println("Reverse Printing");
        head=obj.iterateReverse(head);
        obj.display(head);

    }
}
