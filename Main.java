import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.*;
public class  Main<E> {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
       LinkedList<Integer> aList = new LinkedList<>();
        aList.add(2);
        aList.add(5);
        aList.add(7);
        aList.add(6);
        aList.add(7);

        System.out.println("Before removeAll: " + aList);
        removeAll(aList, 7);
        System.out.println("After removeAll: " + aList);

        // insertDouble
        LinkedList<Integer> bList = new LinkedList<>();
        bList.add(3);
        bList.add(10);
        bList.add(8);
        bList.add(5);

        System.out.println("Before insertDouble: " + bList);
        insertDouble(bList);
        System.out.println("After insertDouble: " + bList);  
        
     
        
         LinkedList<Integer> L = new LinkedList<>();
        LinkedList<Integer> P = new LinkedList<>();


        L.add(10);
        L.add(8);
        L.add(5);
        L.add(12);
        L.add(67);
        L.add(25);
        L.add(22);


        P.add(0); // First element
        P.add(2); // Third element
        P.add(3); // Fourth element
        P.add(5); // Sixth element

        System.out.print("Elements at specified positions:");
        printPositions(L, P);
        
        
        
        
        
    
    }





public int indexOf( LinkedPositionalList<Integer> alist,int target ) {
        Position<Integer> pos = alist.first();//starting position
    int index = 0;//first position index starts with 0
    while(pos != null) {
        if(pos.getElement()== target){
            return index;
        }

        pos= alist.after(pos);// next position
        index++;
    }


return -1;//if nothing found return -1

  }
  




    
 public static void removeAll(LinkedList<Integer> aList, int num) {
       
        ListIterator<Integer> iterator = aList.listIterator();

        // Iterate through the list and remove elements equal to num
        while (iterator.hasNext()) {
            if (iterator.next() == num) {
                iterator.remove();
            }
        }
    }  
 
 
  public static void insertDouble(LinkedList<Integer> aList) {
        // Create a ListIterator for the LinkedList
        ListIterator<Integer> iterator = aList.listIterator();


        while (iterator.hasNext()) {  // iterate through the list
            int current = iterator.next();
            iterator.previous(); // move back to the current element
            iterator.add(current * 2); // add the double of the current element before it
            iterator.next(); // skip over the newly added element
        }
    }
  
  
  
  public static void printPositions(LinkedList<Integer> L, LinkedList<Integer> P) {
        Iterator<Integer> posIterator = P.iterator();

        // Iterate through positions in P
        while (posIterator.hasNext()) {
            int position = posIterator.next();
            int currentIndex = 0;


            Iterator<Integer> listIterator = L.iterator();//use an iterator to traverse L to the position we want
            while (listIterator.hasNext()) {
                int currentElement = listIterator.next();
                if (currentIndex == position) {
                    System.out.print(currentElement+" ");
                    break;
                }
                currentIndex++;
            }
        }
  
  
 

  }




 



  
}
        
    
    
