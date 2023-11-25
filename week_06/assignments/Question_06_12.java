package week_06.assigments;

public class Question_06_12 {
    public static void main(String[] args) {
    printChars('1','Z',10);
    }
    public static void printChars(char ch1, char ch2, int
            numberPerLine){
        if (ch1 > ch2){
            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;
        }
        int count = 1;
        System.out.println("Characters per 1 to Z");
        while (ch1 <= ch2){
            if (count % numberPerLine == 0){
                System.out.println(ch1);
            }else{
                System.out.print(ch1 + " ");
            }
            count++;
            ch1++;
        }
    }
}
