import java.util.*;
class Program1{
          public static void main(String[]args){
	  List obj=new ArrayList();
	  obj.add(10);
	  obj.add(20);
	  obj.add(30);
	//  obj.add("Shashi");
	  System.out.println(obj);

	  System.out.println(obj.size());  //return size of the list

	  System.out.println(obj.isEmpty()); //check whether list is empty or not and return boolean value

	  System.out.println(obj.contains(20));//check that passed object is containing or not by list and return boolean value
          
	  Object arr[]=obj.toArray();
	  //System.out.println(arr);
	  for(Object data:arr){
	   System.out.println(data+" ");
	  }
	  
	  
	  System.out.println(obj.add(30));//Parameter: This method accepts a single parameter ele which represents the element to be inserted at the end of this list.
					  // Return Value: The function returns a boolean value True if the element is
					  // successfully inserted in the List otherwise it returns False./
          System.out.println(obj);


     //   boolean bl2=obj.remove(20);  //error
     //     boolean bl= obj.remove("Shashi");
//	  System.out.println(bl);//Parameters:
				 //o - element to be removed from this collection, if present
				 //Returns:
				//true if an element was removed as a result of this call
// System.out.println(bl2);
	  System.out.println(obj);



          List ll=new ArrayList();
	  ll.add(10);
	  ll.add(20);
	  ll.add(30);
	  System.out.println(ll);//Returns true if this collection contains all of the elements in the specified collection.
	  System.out.println(obj.containsAll(ll));


          
       //	  System.out.println(obj.addAll(ll));
       //	  System.out.println(obj);//add collection at the end 

	 //  System.out.println(obj.addAll(obj));
	 //   System.out.println(obj);//add collection at the end


        //  obj.addAll( 2  ,ll);//add the elements or collection at the specified index
	//  System.out.println(obj);

          System.out.println("************");

          obj.removeAll(ll);
	  System.out.println(obj.removeAll(ll));
	  System.out.println(obj);

            




/*

	   public abstract int size();
	   public abstract boolean isEmpty();
	   public abstract boolean contains(java.lang.Object);
	   public abstract java.util.Iterator<E> iterator();
	   public abstract java.lang.Object[] toArray();
	   public abstract <T> T[] toArray(T[]);
	   public abstract boolean add(E);
	   public abstract boolean remove(java.lang.Object);
	   public abstract boolean containsAll(java.util.Collection<?>);
	   public abstract boolean addAll(java.util.Collection<? extends E>);
	   public abstract boolean addAll(int, java.util.Collection<? extends E>);
	   public abstract boolean removeAll(javuuutil.Collection<?>);
	   public abstract boolean retainAll(java.util.Collection<?>);
	   public void replaceAll(java.util.function.UnaryOperator<E>);
	   public void sort(java.util.Comparator<? super E>);
	   public abstract void clear();
	   public abstract boolean equals(java.lang.Object);
	   public abstract int hashCode();
	   public abstract E get(int);
	   public abstract E set(int, E);
	   public abstract void add(int, E);
	   public abstract E remove(int);
	   public abstract int indexOf(java.lang.Object);
	   public abstract int lastIndexOf(java.lang.Object);
	   public abstract java.util.ListIterator<E> listIterator();
	   public abstract java.util.ListIterator<E> listIterator(int);
	   public abstract java.util.List<E> subList(int, int);
	   public java.util.Spliterator<E> spliterator();
 	   }*/
}}
