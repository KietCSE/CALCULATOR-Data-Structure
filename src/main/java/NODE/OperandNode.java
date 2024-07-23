package NODE;

public class OperandNode extends NodeTree{
    private double value;
    private TYPE type; 

    public OperandNode(double value) {
        this.value = value; 
        this.type = TYPE.OPERAND;
    }

    @Override
    public double Value() { return this.value; }

    @Override
    public TYPE getType() { return this.type; }
}
