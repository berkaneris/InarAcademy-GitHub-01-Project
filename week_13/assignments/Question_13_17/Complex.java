package week_13.assignments.Question_13_17;

public class Complex implements Cloneable {
    private double a;
    private double b;



    public Complex() {
        this(0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex secondComplex) {
        double a = this.a + secondComplex.a;
        double b = this.b + secondComplex.b;
        return new Complex(a, b);
    }

    public Complex subtract(Complex secondComplex) {
        double a = this.a - secondComplex.a;
        double b = this.b - secondComplex.b;
        return new Complex(a, b);
    }
    public Complex multiply(Complex secondComplex){
        double a = (this.a * secondComplex.a) - (this.b * secondComplex.b);
        double b = (this.b * secondComplex.a) + (this.a * secondComplex.b);
        return new Complex(a,b);
    }
    public Complex divide(Complex secondComplex){
        double a = (this.a * secondComplex.a + this.b * secondComplex.b) / (Math.pow(secondComplex.a , 2) + Math.pow(secondComplex.b , 2));
        double b = (this.b * secondComplex.a - this.a * secondComplex.b) / (Math.pow(secondComplex.b , 2) + Math.pow(secondComplex.b , 2));
        return new Complex(a,b);
    }
    public double abs(){
        return Math.sqrt(Math.pow(this.a , 2) + Math.pow(this.b, 2));
    }
    @Override
    public String toString(){
        if(this.b == 0){
            return "(" + this.a + ")";
        }else{
            return  this.a + " + " + this.b + "i";
        }
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
