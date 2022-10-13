public class IntsCalculator implements Ints {

    private final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        var result = target.newFormula().
                addOperand(arg0).
                addOperand(arg1).
                calculate(Calculator.Operation.SUM).
                result.intValue();
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        var result = target.newFormula().
                addOperand(arg0).
                addOperand(arg1).
                calculate(Calculator.Operation.MULT).
                result.intValue();
        return result;
    }

    @Override
    public int pow(int a, int b) {
        var result = target.newFormula().
                addOperand(a).
                addOperand(b).
                calculate(Calculator.Operation.POW).
                result.intValue();
        return result;
    }
}
