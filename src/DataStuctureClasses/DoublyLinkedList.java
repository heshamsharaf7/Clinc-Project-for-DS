/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStuctureClasses;

/**
 *
 * @author ameen
 */
public class DoublyLinkedList<E> {
      private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<E>(null, null, null);
        trailer = new Node<E>(null, header, null);
        header.setNext(trailer);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }

    private void addBetween(E element, Node<E> p, Node<E> s) {
        Node<E> newest = new Node<E>(element, p, s);
        p.setNext(newest);
        s.setPrev(newest);
        size++;

    }

    public void addFirst(E element) {
        addBetween(element, header, header.getNext());
    }

    public void addLast(E element) {
        addBetween(element, trailer.getPrev(), trailer);
    }

    private E remove(Node<E> x) {
        if (isEmpty()) return null;
        Node<E> p = x.getPrev();
        Node<E> s = x.getNext();
        p.setNext(s);
        s.setPrev(p);
        size--;
        return x.getElement();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }
public void print()
{
    for(Node i=header.getNext();i!=trailer;i=i.next)
    {
        System.out.println(i.getElement()+"");
    }
}

public void delete(Node x)
{
    if(x.prev!=null)
    {
        x.prev.next=x.next;
    }
    else
    {
        header=x.next;
    }
    if(x.next!=null)
    {
        x.next.prev=x.prev;
    }
}
public void search ( E x)
{
    int i=1;
    boolean flag=false;
    Node current=header.getNext();
    if(header.getNext()==null)
    {
        System.out.println("list is empty");
        return;
    }
    while (current!=null)
    {
        if(current.getElement()==x)
        {
          flag=true;
            break;
        }
        current=current.next;
        i++;
    }
    if(flag)
    {
        System.out.println("Node is present in the list at the postion:"+i);
    }else
        System.out.println("Node is not in the list");

}


    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
    
}
