package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


//      Iterator can traverse only in forward direction
//      whereas ListIterator traverses both in forward and backward directions

//        using Iterator two functions(hasNest,next)
        Iterator itr=list.iterator();
        System.out.println("Using Iterator :");
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();

//        using ListIterator
        ListIterator li= list.listIterator();
        System.out.println("Using ListIterator");
        System.out.println("Forward Traversal");
        while(li.hasNext())
            System.out.print(li.next()+" ");
        System.out.println();

        System.out.println("Backward Traversal");
        while(li.hasPrevious())
            System.out.print(li.previous()+" ");
        System.out.println();



//        ListIterator can help to replace an element whereas Iterator cannot.
        li=list.listIterator();
        li.next();
        li.set(9);
        System.out.println(list);



//      Iterator can traverse any type of collection while listIterator can traverse only List



//      ListIterator has methods like nextIndex() and previousIndex()
//      to obtain indexes of elements at any time while traversing List.(Iterator don't have indexes)
        li.next();
        System.out.println("Next Index of ListIterator"+li.nextIndex());
        System.out.println("Previous Index of ListIterator"+li.previousIndex());



//      ListIterator can easily add elements to a collection at any time. but Iterator throws ConcurrentModificationException.
        li.add(7);      //added at 2nd index
        System.out.println(list);


    }
}
