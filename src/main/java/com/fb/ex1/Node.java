package com.fb.ex1;

public class Node<T> {
  T t;
  Node<T> right=null;
  Node<T> left=null;
/**
 * @return the t
 */
public T getT() {
	return t;
}
/**
 * @param t the t to set
 */
public void setT(T t) {
	this.t = t;
}
/**
 * @return the right
 */
public Node<T> getRight() {
	return right;
}
/**
 * @param right the right to set
 */
public void setRight(Node<T> right) {
	this.right = right;
}
/**
 * @return the left
 */
public Node<T> getLeft() {
	return left;
}
/**
 * @param left the left to set
 */
public void setLeft(Node<T> left) {
	this.left = left;
}
/**
 * @param t
 */
public Node(T t) {
	super();
	this.t = t;
}
/**
 * @param t
 * @param left
 * @param right
 */
public Node(T t, Node<T> left, Node<T> right) {
	super();
	this.t = t;
	this.left = left;
	this.right = right;
}
  
}
