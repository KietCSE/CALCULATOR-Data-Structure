package TREE;

public class Help {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == 'x' || c == '/' || c == '^' || c == '#'; 
    }

    public static int PiorityOperator(char c) {
        if (c == '(') return 0;
        if (c == '+' || c == '-') return 1;
        if (c == 'x' || c == '/') return 2;
        if (c == '^') return 3;
        if (c == '#' || c == 's') return 4;
        return -1;
    }
}
