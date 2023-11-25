package week_10.assigments;

public class Question_10_26 {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3 && args.length != 1) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        if (args.length == 3) {
           print(args);
        }else{
            String [] operands = args[0].split(" ");
            String [] newOperands = new String[3];
            int count = 0;
            for(int i = 0; i < operands.length; i++){
                if(!operands[i].equals("")){
                    newOperands[count++] = operands[i];
                }
                if(count == 3){
                    break;
                }
            }

            print(newOperands);

        }
    }
    public static void print(String [] args){
        // The result of the operation
        int result = 0;

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}
