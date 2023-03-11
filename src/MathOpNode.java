/**
 * ICSI 311
 * Assignment 3
 * Ryan McSweeney
 * RM483514
 * 2/26/23
 */

public class MathOpNode extends Node{
    //right node of the math op node
    private Node rightNode;
    //left node of the math op node
    private Node leftNode;

    //operator for the math op node
    private operationType operator;

    /**
     * constructor for a new math op node
     * @param type operator type of the node
     * @param left left node of the math op node
     * @param right right node of the math op node
     */
    public MathOpNode(operationType type, Node left, Node right){
        this.operator = type;
        this.rightNode = right;
        this.leftNode = left;
    }

    /**
     * enumerator for the possible operation types for the node
     */
    public enum operationType{
        PLUS, MINUS, MULTIPLY, DIVIDE, MOD
    }

    /**
     * to string for the math op node
     * @return a formatted string for the math op node
     */
    public String toString() {
        return "MathOpNode(" + this.operator + ", " + this.leftNode + ", " + this.rightNode + ")";
    }
}
