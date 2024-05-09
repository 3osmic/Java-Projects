package csc251.lab11.start;

class MyLinkedListExtra<E> extends MyLinkedList<E> {
	  /** Create an empty list */
	  public MyLinkedListExtra() {
	  }

	  /** Create a list from an array of objects */
	  public MyLinkedListExtra(E[] objects) {
	    super(objects);
	  }

	  @Override /** Return true if this list contains the element e */
	  public boolean contains(Object o) {
		  Node<E> current = head;
	        while (current != null) {
	            if (current.element.equals(o)) {
	                return true;
	            }
	            current = current.next;
	        }
	        return false;
	  }

	  @Override /** Return the element from this list at the specified index */
	  public E get(int index) {
		  if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        Node<E> current = head;
	        for (int i = 0; i < index; i++) {
	            current = current.next;
	        }
	        return current.element;
	  }

	  @Override /** Returns the index of the first matching element in this list.
	   *  Returns -1 if no match. */
	  public int indexOf(Object o) {
		  Node<E> current = head;
	        for (int i = 0; i < size; i++) {
	            if (current.element.equals(o)) {
	                return i;
	            }
	            current = current.next;
	        }
	        return -1;
	  }

	  @Override /** Returns the index of the last matching element in this list
	   *  Returns -1 if no match. */
	  public int lastIndexOf(Object o) {
		  Node<E> current = head;
	        int lastIndex = -1;
	        for (int i = 0; i < size; i++) {
	            if (current.element.equals(o)) {
	                lastIndex = i;
	            }
	            current = current.next;
	        }
	        return lastIndex;
	  }

	  @Override /** Replace the element at the specified position in this list
	   *  with the specified element. */
	  public E set(int index, E e) {
		  if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        Node<E> current = head;
	        for (int i = 0; i < index; i++) {
	            current = current.next;
	        }
	        E oldValue = current.element;
	        current.element = e;
	        return oldValue;
	  }
	}
