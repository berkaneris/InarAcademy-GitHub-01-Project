package week_04.assigments;

public class Question_04_06 {
    public static void main(String[] args) {

        final int RADIUS = 40;
        double radian1 = Math.random() * 2 * Math.PI;
        double x1 = RADIUS * Math.cos(radian1);
        double y1 = RADIUS * Math.sin(radian1);
        double radian2 = Math.random() * 2 * Math.PI;
        double x2 = RADIUS * Math.cos(radian2);
        double y2 = RADIUS * Math.sin(radian2);
        double radian3 = Math.random() * 2 * Math.PI;
        double x3 = RADIUS * Math.cos(radian3);
        double y3 = RADIUS * Math.sin(radian3);

        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double angleOfSide1 = Math.toDegrees(Math.acos((Math.pow(side1, 2) - Math.pow(side2, 2) - Math.pow(side3, 2))
                / (-2 * side2 * side3)));
        double angleOfSide2 = Math.toDegrees(Math.acos((Math.pow(side2, 2) - Math.pow(side1, 2) - Math.pow(side3, 2))
                / (-2 * side1 * side3)));
        double angleOfSide3 = Math.toDegrees(Math.acos((Math.pow(side3, 2) - Math.pow(side2, 2) - Math.pow(side1, 2))
                / (-2 * side1 * side2)));

        System.out.println("The three angles are " +
                Math.round(angleOfSide1 * 100) / 100.0 + " " +
                Math.round(angleOfSide2 * 100) / 100.0 + " " +
                Math.round(angleOfSide3 * 100) / 100.0);
    }
}
