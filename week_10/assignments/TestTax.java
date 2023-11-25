package week_10.assigments;

public class TestTax {
    public static void main(String[] args) {
// The information for 2001
        int[][] brackets2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

// The information for 2009
        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets2009 = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

// The table for 2001
        System.out.println("                        2001 Taxes ");
        System.out.println("Income     Status 0     Status 1     Status 2     Status 3");
        System.out.println("-------------------------------------------------------------");
        for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
            System.out.printf("%-11.0f", taxableIncome);
            Tax tax1 = new Tax(Tax.SINGLE_FILER, brackets2001, rates2001, taxableIncome);
            Tax tax2 = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, brackets2001, rates2001, taxableIncome);
            Tax tax3 = new Tax(Tax.MARRIED_SEPARATELY, brackets2001, rates2001, taxableIncome);
            Tax tax4 = new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2001, rates2001, taxableIncome);

            System.out.printf("%-13.2f%-13.2f%-13.2f%-8.2f\n", tax1.getTax(), tax2.getTax(), tax3.getTax(), tax4.getTax());
        }
        System.out.println();
// The table for 2009
        System.out.println("                        2009 Taxes");
        System.out.println("Income     Status 0     Status 1     Status 2     Status 3");
        System.out.println("-------------------------------------------------------------");
        for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
            System.out.printf("%-11.0f", taxableIncome);
            Tax tax1 = new Tax(Tax.SINGLE_FILER, brackets2009, rates2009, taxableIncome);
            Tax tax2 = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, brackets2009, rates2009, taxableIncome);
            Tax tax3 = new Tax(Tax.MARRIED_SEPARATELY, brackets2009, rates2009, taxableIncome);
            Tax tax4 = new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets2009, rates2009, taxableIncome);

            System.out.printf("%-13.2f%-13.2f%-13.2f%-8.2f\n", tax1.getTax(), tax2.getTax(), tax3.getTax(), tax4.getTax());
        }


    }
}
