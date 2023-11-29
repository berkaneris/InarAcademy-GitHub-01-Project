package week_13.assignments.Question_13_15;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Rational2 extends Number implements Comparable<Rational2>{
    // Data fields for numerator and denominator
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    /**
     * Construct a rational with default properties
     */
    public Rational2() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    /**
     * Construct a rational with specified numerator and denominator
     */
    public Rational2(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = BigInteger.valueOf(denominator.compareTo(BigInteger.ZERO)).multiply(numerator.divide(gcd));
        this.denominator =(denominator.abs()).divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; (n1.compareTo(k) != -1) && (n2.compareTo(k) != -1); k = k.add(BigInteger.ONE)) {
            if (n1.mod(k).equals(BigInteger.ZERO) && n2.mod(k).equals(BigInteger.ZERO))
                gcd = k;

        }

        return gcd;
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    /**
     * Add a rational number to this rational
     */
    public Rational2 add(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
                denominator.multiply( secondRational.getNumerator()));
        BigInteger d = denominator.multiply( secondRational.getDenominator());
        return new Rational2(n, d);
    }

    /**
     * Subtract a rational number from this rational
     */
    public Rational2 subtract(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(
                 denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    /**
     * Multiply a rational number by this rational
     */
    public Rational2 multiply(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    /**
     * Divide a rational number by this rational
     */
    public Rational2 divide(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);
        return new Rational2(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        return ((this.subtract((Rational2) (other))).getNumerator().equals(BigInteger.ZERO));

    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        BigDecimal nume = new BigDecimal(numerator);
        BigDecimal deno = new BigDecimal(denominator);

        return (new BigDecimal(numerator).multiply(new BigDecimal(BigInteger.ONE)).divide(new BigDecimal(denominator))).doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational2 o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
            return -1;
        else
            return 0;
    }
}
