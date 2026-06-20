package com.ds.examples;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class BSTLevelOrderTraversal{

static class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

static void levelOrder(Node root){
      if(root!=null) {
            Queue<Node> nodes = new LinkedList<Node>();
            nodes.add(root);
            while (!nodes.isEmpty()) {
                Node node = nodes.remove();
                if(node!=null) {
                    System.out.print(node.data+" ");
                
                if (node.left != null)nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
                }
            }
        }
      
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            try(Scanner sc=new Scanner(System.in)) {
                int T=sc.nextInt();
                Node root=null;
                while(T-->0){
                    int data=sc.nextInt();
                    root=insert(root,data);
                }
                levelOrder(root);
            }
        }	
}
