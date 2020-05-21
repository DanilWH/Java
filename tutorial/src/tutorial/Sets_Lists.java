package tutorial;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

import java.util.ArrayList;

class Sets_Lists {
    public static void main(String[] argc) {
    	// sets - collections of unordered elements that are unique.
    	// it doesn't care of how many similar elements there are and where they are so
    	// they don't have indexes.
    	
    	// Set<Integer> s = new HashSet<Integer>(); HashSet - unordered.
    	// Set<Integer> s = new TreeSet<Integer>(); TreeSet - ordered.
    	// Set<Integer> s = new LinkedHashSet<Integer>(); LinkedHashSet - similar to a basic set
    	//                                                                but it's just faster
    	//                                                                on certain operations.
    	Set<Integer> s = new HashSet<Integer>();
    	s.add(1);
    	s.add(3);
    	s.add(4);
    	s.add(56);
    	s.add(3);
    	s.add(5);
    	s.add(1);
    	s.add(5);
    	s.add(-8);
    	s.remove(3);
    	s.clear();
    	
    	System.out.println(s);
    	System.out.println(s.contains(4));
    	System.out.println(s.size());
    	System.out.println(s.isEmpty());
    	
    	// lists are like arrays except it's a bit slower and it can change sizes.
    	// In a word lists are dynamically sized arrays. So their elements have indexes.
    	// LinkedList<Integer> al = new LinkedList<Integer>(); LinkedList is faster at certain operations
    	// 													   than an ArrayList.
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	al.add(1);
    	al.add(2);
    	al.add(3);
    	al.add(4);
    	al.add(5);
    	al.add(6);
    	al.add(7);
    	al.set(1, 5);// set(index, element) replace the element at position 1 by the value 5;
    	
    	System.out.println(al);
    	System.out.println(al.get(3)); // get an element by its index.
    	System.out.println(al.subList(1, 5));
    	System.out.println(al.size());
    }
}