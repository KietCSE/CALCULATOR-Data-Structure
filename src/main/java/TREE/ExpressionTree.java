package TREE;
import NODE.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExpressionTree {
    private NodeTree root; 
    float result; 
    List<NodeTree> list; 

    public ExpressionTree() {
        this.root = null; 
        this.result = 0f;
        this.list = new ArrayList<>();
    }

    /*.......PRIVATE FUNCTION ........ */
    // O(n)
    private void SeperateString(String s) {
        double num = 0;
        int countFloat = 0;
        for (int i = 0; i < s.length(); i++) {
            // if char is operator 
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || Help.isOperator(s.charAt(i))) {
                // seperate operand
                if (num != 0) {
                    list.add(new OperandNode(num));
                    num = 0;
                    countFloat = 0;
                }
                list.add(new OperatorNode(s.charAt(i)));
            }
            // if char is '.' symbol
            else if (s.charAt(i) == '.'){
                countFloat++;
            }
            // is char is sqrt symbol
            else if (s.charAt(i) == 's') {
                i += 5; 
                list.add(new OperatorNode('s'));
                double n = 0;
                int count = 0; 

                // grab num inside sqrt()
                while (s.charAt(i) != ')') {
                    if (s.charAt(i) == '.') {
                        count++; i++;
                        continue;
                    }
                    if (count != 0) {
                        n = (double)(n + (s.charAt(i) - '0')/Math.pow(10, count));
                    }
                    else n = n*10 + (s.charAt(i) - '0');
                    if (count != 0) count++;
                    i++;
                }

                list.add(new OperandNode(n));
            }
            // if char is a number 
            else {
                if (countFloat != 0) {
                    num = (double)(num + (s.charAt(i) - '0')/Math.pow(10, countFloat));
                }
                else num = num*10 + (s.charAt(i) - '0');
                if (countFloat != 0) countFloat++;
            }
        }   

        // deal with the remain number
        if (num != 0) {
            list.add(new OperandNode(num));
        }
    }

    // convert negative symbol to symbol #
    private void SolveNegativeNumber() {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getType() == TYPE.OPERATOR && list.get(i).Key() == '-') {
                if (i == 0 || list.get(i-1).Key() == '(' || Help.isOperator(list.get(i-1).Key())) {
                    list.get(i).setKey('#');
                }
            } 
        }
    }

    
    // Create substree with 3 or 2 nodes 
    private void CreateSubTree(Stack<NodeTree> stackOperator, Stack<NodeTree> stackOperand) {
        NodeTree operator = stackOperator.peek();
        stackOperator.pop();
        if (operator.Key() == '#' || operator.Key() == 's') {
            NodeTree sub = stackOperand.peek(); 
            stackOperand.pop();

            // first operand set to the left side
            operator.left = sub; 
            operator.right = null;
        }
        else {
            NodeTree sub1 = stackOperand.peek(); 
            stackOperand.pop();
            NodeTree sub2 = stackOperand.peek();
            stackOperand.pop();

            // first operand set to the left side
            operator.left = sub1; 
            operator.right = sub2; 
        }
        stackOperand.push(operator);
    }

    /* this function create a sub tree for a sequence of expression with same priority level */
    private void SolveSequenceExpression(int piority, Stack<NodeTree> stackOperator, Stack<NodeTree> stackOperand) {
        if (Help.PiorityOperator(stackOperator.peek().Key()) == piority) {
            int count = 0; 
            Stack<NodeTree> STKOperator = new Stack<>();
            Stack<NodeTree> STKOperand = new Stack<>();

            // grab node from stackoperator
            while (!stackOperator.empty() && Help.PiorityOperator(stackOperator.peek().Key()) == piority) {
                STKOperator.push(stackOperator.pop());
                count++;
            }

            // special situation for negative symbol, with one nevative symbol we only grab one operand accordingly
            if (STKOperator.peek().Key() == '#' || STKOperator.peek().Key() == 's') count = 0;

            for (int i = 1; i <= count+1; i++) {
                STKOperand.push(stackOperand.pop());
            }

            while (!STKOperator.empty()) {
                CreateSubTree(STKOperator, STKOperand);
            }

            // repush for stackoperand
            stackOperand.push(STKOperand.peek());
        }
    }

    /* this function create all expression tree */
    private void CreateTreeExpression(String s) {
        Stack<NodeTree> stackOperand = new Stack<>(); 
        Stack<NodeTree> stackOperator = new Stack<>();

        SeperateString(s);
        SolveNegativeNumber();

        for (NodeTree e : list) {
            // if it's a operator
            if (Help.isOperator(e.Key()) || e.Key() == 's') {
                while (!stackOperator.empty() && Help.PiorityOperator(e.Key()) < Help.PiorityOperator(stackOperator.peek().Key())) {
                    int piority = Help.PiorityOperator(stackOperator.peek().Key());
                    SolveSequenceExpression(piority, stackOperator, stackOperand);
                }
                stackOperator.push(e);
            } 
            // if it's a ( symbol
            else if (e.Key() == '(') {
                stackOperator.push(e);
            }
            // if it's a ) symbol
            else if (e.Key() == ')') {
                while (stackOperator.peek().Key() != '(') {
                    int piority = Help.PiorityOperator(stackOperator.peek().Key());
                    SolveSequenceExpression(piority, stackOperator, stackOperand);
                }
                // remove ( symbol 
                stackOperator.pop();
            }
            // if it's a operand
            else {
                stackOperand.push(e);
            }
        }

        // when finish the loop but the stack still have operator
        while (!stackOperator.empty()) {
            int piority = Help.PiorityOperator(stackOperator.peek().Key());
            SolveSequenceExpression(piority, stackOperator, stackOperand); 
        }
        
        // return root tree
        this.root = stackOperand.pop();
    }

    /* this function calcute the value of expression from tree */
    private double CalculateExprextionTreeRec(NodeTree root) {
        if (root.left == null && root.right == null) return root.Value();
        if (root.left == null || root.right == null) {
            // negative symbol 
            if (root.Key() == '#') {
                if (root.left == null && root.right != null) return 0 - root.right.Value();
                if (root.left != null && root.right == null) return 0 - root.left.Value();
            }
            // sqrt symbol
            else {
                if (root.left == null && root.right != null) return Math.sqrt(root.right.Value());
                if (root.left != null && root.right == null) return Math.sqrt(root.left.Value());
            }
        }

        double a = CalculateExprextionTreeRec(root.left);
        double b = CalculateExprextionTreeRec(root.right);
        
        if (root.Key() == '+') return a + b; 
        else if (root.Key() == '-') return a - b; 
        else if (root.Key() == 'x') return a * b; 
        else if (root.Key() == '/') return a / b; 
        return Math.pow(a, b);
    }

    /*..... PUBLIC FUNTION FOR USER .... */

    public double Calculate(String s) {
        if (s.isEmpty()) return 0;
        CreateTreeExpression(s);
        double result = CalculateExprextionTreeRec(this.root);
        return result;
    }


    // TEST FUNCTION
    public void Show() {
        for (NodeTree e : this.list) {
            if (e.getType() == TYPE.OPERAND) {
                System.out.print(e.Value());
            }
            else System.out.print(e.Key());
        }
    }

    private void print(NodeTree root, String s) {
        if (root == null) {
            System.out.println(s + "null");
            return;
        }
        if (root.getType() == TYPE.OPERAND) {
            System.out.println(s + root.Value());
        }
        else System.out.println(s + root.Key());
        s += "  ";
        print(root.left, s + "|");
        print(root.right, s + "|");
    }

    public void BuildTree() {
        print(this.root, "");
    }
}
