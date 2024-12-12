Download LinkedPositionalList.java, Position.java and PositionalList.java.

In ithe main() method of the driver class, 
--PART 1--
First create a LinkedPositionalList<Integer> called L. Populate this list with even integers 2,4,6, etc.
Then call a method indexOf(L, 8) which you will implement in driver class also. 
You should write the method with the following header:
int indexOf(LinkedPositionalList<Integer> aList, int target)
The method should return the index of the target item if found in aList, returns-1 if not found.

--PART 2--
 In a driver class, write a Java method, 
 removeAll(java.util.LinkedList<Integer>aList, int num)
that would remove all elements in aList that are equal to num. 
For example, if the aList contains {2,5,7,6,7} initially, it will contain {2,5,6} after removeAll(aList, 7) method
runs. You SHOULD first construct an Iterator (java.util.Iterator) for the linked list and after
you construct the Iterator, you SHOULD ONLY use the methods of the Iterator interface to
write your method. That is, you are NOT allowed to use any other LinkedList method such as
add, get, etc. Just update the given list. You are NOT allowed to make a new list.

--PART 3--
Write a driver class called PrintPositions. In its main() method, first create two
java.util.LinkedList<Integer> objects, called L, and P. Populate these lists with integers, L
need not be sorted but make sure P contains integers sorted in ascending (increasing) order
and then call a method printPositions(L, P) that you write. printPositions(L,P) should print the
elements in L that are in positions specified by P. For instance, if L contains
[10,8,5,12,67,25,22] and P contains [1,3,4,6], the first, third, fourth and sixth elements in L
are printed, that is 10, 5, 12 and 25 are printed. Write the Java method
printPositions(java.util.LinkedList L, java.util.LinkedList P). You are REQUIRED to use an
Iterator in your code. You may assume the largest integer in P <= L.size().


--PART 4--

Write a Java method, insertDouble(java.util.LinkedList<Integer> aList) that would
add the double of each element BEFORE each element. For instance, if L contains
[3,10,8,5] originally, after the insertDouble is called, L will contain [6,3,20,10,16,8,10,5]. You
are allowed to use ONLY the methods of the ListIterator in your code.
