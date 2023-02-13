 public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
    DoublyLinkedListNode temp=new DoublyLinkedListNode(data);
    if(llist==null)
        llist=temp;
    else if(llist.data>data)
    {
        temp.next=llist;
        llist.prev=temp;
        llist=temp;
    }
    else
    {
        DoublyLinkedListNode curr=llist;
        DoublyLinkedListNode before=llist;
        while(curr!=null && curr.data<data)
        {
            before=curr;
            curr=curr.next;
        }
        if(curr==null && before.data<data)
        {
            before.next=temp;
            temp.prev=before;
        }
        else
        {
            before.next=temp;
            temp.prev=before;
            temp.next=curr;
        }
    }
        return llist;
}
}
