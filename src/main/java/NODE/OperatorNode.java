package NODE;

public class OperatorNode extends NodeTree{
    private char key; 
    public TYPE type;

    public OperatorNode(char v) {
        this.key = v; 
        this.type = TYPE.OPERATOR;
    }

    @Override
    public char Key() { return this.key; }

    @Override
    public TYPE getType() {return this.type;}

    @Override
    public void setKey(char c) {this.key = c;}
}

