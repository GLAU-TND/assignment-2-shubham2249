/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        System.out.println("enter the number of elements to enter in the tree");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter the value to be entered: ");
            int value = sc.nextInt();
            obj.insert(value);
        }
        obj.preorder(obj.root);
        obj.printSuccessor();
        obj.display();
    }
}
