//Michelle Joseph
//10.5 part 1

package chpt10;

public class StackOfIntegers {
	
	private int[] elements;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 16;
	
	
	//default constructor 
	public StackOfIntegers() {
		this(DEFAULT_CAPACITY);
	}
	
	//constructor with capacity 
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getValue(int value) {
		return elements[value];
	}
	
	public int peek() {
		return elements[size-1];
	}
	
	//'pop' or remove element from the top of the stack
	public int pop() {
		return elements[--size];
	}
	
	//'push' value onto the top of the stack 
	public int push(int value) {
		if(size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		return elements[size++] = value;
	}
	
	//display the values in the integer stack
	public static void display(StackOfIntegers integers) {
		for(int i = 0; i < integers.size; i++) {
			System.out.print(integers.getValue(i) + " ");
		}
	}
	
	}



