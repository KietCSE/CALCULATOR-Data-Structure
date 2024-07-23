package NODE;

public abstract class NodeTree {
    public NodeTree left; 
    public NodeTree right;
    public NodeTree() {
        this.left = null; 
        this. right = null; 
    }

    public abstract TYPE getType();
    public double Value() {return 0.0;}
    public char Key() {return ' ';}
    public void setKey(char c) {}; 
}
