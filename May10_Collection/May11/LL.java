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
        System.out.println("Insert at begining:");
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
        System.out.println("Insert after given location:");

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
        System.out.println("Insert before specific location");

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
        System.out.println("Delete last node");
        Link prev = null;
        Link temp = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;

    }

}
public class LL {
    public static void main(String[] args) {
        additionalFunction obj = new additionalFunction();
        Link head = null;
        head = obj.insertEnd(head, 11);
        head = obj.insertEnd(head, 22);
        head = obj.insertEnd(head, 33);
        obj.display(head);
        head = obj.insertBeg(head, 88);
        obj.display(head);
        head = obj.insertAfterGivenLocation(head, 22, 66);
        obj.display(head);
        head = obj.insertBeforeGivenLocation(head, 22, 66);
        obj.display(head);
        head = obj.DeleteEnd(head);
        obj.display(head);

    }
}
