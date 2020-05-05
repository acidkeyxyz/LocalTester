package com.fb.ex1;

public class Tree {
	public static void main(String[] args) {
		Node <Integer>node2 = 
				new Node<Integer>(2,
						new Node<Integer>(4,
								new Node<Integer>(8),new Node<Integer>(9)),
						new Node<Integer>(5,
								new Node<Integer>(10),new Node<Integer>(11)));
		Node <Integer>node3 = new Node<Integer>(3,new Node<Integer>(6),new Node<Integer>(7));
		
		;
		Node <Integer>root =  new Node<Integer>(1,node2,node3);
		print(root,0);
	}

	private static void print(Node<Integer> node,int level) {
		if(node ==null) {
			System.out.print("\n level["+(level++)+"]:null");
			return;
		}else {
			System.out.print("\n level["+(level++)+"]:"+node.getT()+",");		
		}
//		if(node.getRight()!=null ) {
			print(node.getRight(),level);
//		}if( node.getLeft() != null) {
			print(node.getLeft(),level);
//		}
	}
}
