package maze;

import java.util.Scanner;


class linkedList
{
     Node start;
     Node end ;
     int size ;
 
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return start == null;
    }
    public int getSize()
    {
        return size;
    }    
    public void insertAtStart(int val)
    {
        Node n = new Node(val, null);    
        size++ ;    
        if(start == null) 
        {
            start = n;
            end = start;
        }
        else 
        {
            n.setLink(start);
            start = n;
        }
    }
    public void insertAtEnd(int val)
    {
        Node n = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = n;
            end = start;
        }
        else 
        {
            end.setLink(n);
            end = n;
        }
    }
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null);                
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink() ;
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++ ;
    }
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            start = start.getLink();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node s = start;
            Node t = start;
            while (s != end)
            {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }    
    public void display()
    {
        if (size == 0) 
        {
            System.out.print("no value");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ " ");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ " ");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}
class Node
{
    int data;
    Node link;
 
    public Node()
    {
        link = null;
        data = 0;
    }    
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    public void setLink(Node n)
    {
        link = n;
    }    
    public void setData(int d)
    {
        data = d;
    }    
    public Node getLink()
    {
        return link;
    }    
    public int getData()
    {
        return data;
    }
}
 
