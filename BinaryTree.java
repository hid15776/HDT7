import java.lang.*;

public class BinaryTree<E> {
	private E val; // value associated with node 
	private BinaryTree<E> parent; // parent of node 
	private BinaryTree<E> left, right; // children of nod
	
	public BinaryTree(){
		val = null; 
		parent = null; 
		left = right = this;

	}
	// post: constructor that generates an empty node
	
	public BinaryTree(E value){
		val = value; 
		right = left = new BinaryTree<E>(); 
		setLeft(left); 
		setRight(right);
		
	}
	// post: returns a tree referencing value and two empty subtrees
	
	public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right){
		val = value; 
		if (left == null) { 
			left = new BinaryTree<E>(); 
			} 
		setLeft(left); 
		if (right == null) { 
			right = new BinaryTree<E>(); 
			} 
		setRight(right);
	} 
	// post: returns a tree referencing value and two subtrees
	
	public BinaryTree<E> left() {
		// post: returns reference to (possibly empty) left subtree
		return left;
	}
	
	public BinaryTree<E> right() {
		// post: returns reference to (possibly empty) left subtree
		return right;
	}
	
	public BinaryTree<E> parent(){
	}
	// post: returns reference to parent node, or null
	
	public void setLeft(BinaryTree<E> newLeft){
		// post: sets left subtree to newLeft // re-parents newLeft if not null
		
		if (isEmpty()) 
			return; 
		if (left != null && left.parent() == this) left.setParent(null);
		left = newLeft; 
		left.setParent(this);
	} 
	
	public void setRight(BinaryTree<E> newRight){
		// post: sets Right subtree to newLeft // re-parents newRight if not null		
		if (isEmpty()) 
			return; 
		if (right != null && right.parent() == this) right.setParent(null);
		right = newRight; 
		right.setParent(this);
	} 
	
	protected void setParent(BinaryTree<E> newParent) {
	// post: re-parents this node to parent reference, or null
		if (!isEmpty()) { 
			parent = newParent; }
	}
	
	public Iterator<E> iterator() {
		// post: returns an in-order iterator of the elements
		
	}
	
	public boolean isLeftChild() {
		// post: returns true if this is a left child of parent
		if(this == parent.left()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isRightChild() {
		// post: returns true if this is a left child of parent
		if(this == parent.right()){
			return true;
		}else{
			return false;
		}
	}
	
	public E value(){
		// post: returns value associated with this node
		return val;
	} 
	
	public void setValue(E value) {
	// post: sets the value associated with this node
		val = value;
	}
	
	
	//PUSE ESTO AQUI
	public String toString() {
		return name + " has the key " + key;
	}
}
