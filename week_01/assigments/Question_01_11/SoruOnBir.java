package week_01.assigments.Question_01_11;

public class SoruOnBir {
    public static void main (String[] args) {
        System.out.println("Population projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population projection formula:");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaths per year)");
        System.out.println("                   + (new immigrants per year))");
        System.out.println("Year 1 projection:");
        System.out.println(312032486+(((365*24*60*60)/7.0)-((365*24*60*60)/13.0)+((365*24*60*60)/45.0)));
        System.out.println("Year 2 projection:");
        System.out.println(312032486+2.0*(((365*24*60*60)/7.0)-((365*24*60*60)/13.0)+((365*24*60*60)/45.0)));
        System.out.println("Year 3 projection:");
        System.out.println(312032486+3.0*(((365*24*60*60)/7.0)-((365*24*60*60)/13.0)+((365*24*60*60)/45.0)));
        System.out.println("Year 4 projection:");
        System.out.println(312032486+4.0*(((365*24*60*60)/7.0)-((365*24*60*60)/13.0)+((365*24*60*60)/45.0)));
        System.out.println("Year 5 projection:");
        System.out.println(312032486+5.0*(((365*24*60*60)/7.0)-((365*24*60*60)/13.0)+((365*24*60*60)/45.0)));
    }
}
