package week_04.assigments;

public class Question_04_03 {
    public static void main(String[] args) {
        double distance1 = 364.06; // the distance from Atlanta to Charlotte
        double distance2 = 350.35; // the distance from Charlotte to Savannah
        double distance3 = 395.12; // the distance from Savannah to Orlando
        double distance4 = 646.20; // the distance from Orlando to Atlanta
        double distance5 = 358.44; // the distance from Atlanta to Savannah

        double side1 = (distance1 + distance2 + distance5) / 2;
        double area1 = Math.pow(side1 * (side1 - distance1) * (side1 - distance2) * (side1 - distance5), 0.5);

        double side2 = (distance3 + distance4 + distance5) / 2;
        double area2 = Math.pow(side2 * (side2 - distance3) * (side2 - distance4) * (side2 - distance5), 0.5);

        System.out.println("The estimated area enclosed by Atlanta, Georgia; \n" +
                "Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina is " + (area1 + area2) + " km^2");
    }
}
