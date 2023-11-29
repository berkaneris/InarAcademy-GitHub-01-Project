package week_13.assignments.Question_13_11;

public class TestOctagon {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);

        System.out.println("Area : " + octagon.getArea() +
                "\nPerimeter : " + octagon.getPerimeter());
        try {
            System.out.println("Cloning the Octagon...");
            Octagon newOctagon = (Octagon) octagon.clone();
            if(octagon.compareTo(newOctagon) == 0) {
                System.out.println("Octagon is equal to its clone.");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("This is an error");
        }
    }
}
