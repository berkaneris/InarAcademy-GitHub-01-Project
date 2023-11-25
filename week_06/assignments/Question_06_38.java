package week_06.assigments;

public class Question_06_38 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 200;
         final int CHARS_PER_LINE = 10;
         int count = 0;
         for (int i = 0; i <NUMBER_OF_CHARS; i++){
             count++;
             if(i < 100 ){
                 if(count % CHARS_PER_LINE == 0){
                     System.out.println(getRandomUpperCaseLetter());
                 }else{
                     System.out.print(getRandomUpperCaseLetter() + " ");
                 }
             }else {
                 if(count % CHARS_PER_LINE == 0){
                     System.out.println(getRandomDigitCharacter());
                 }else{
                     System.out.print(getRandomDigitCharacter() + " ");
                 }
             }
         }
    }
    public static char getRandomCharacter(char ch1, char ch2) {
         return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
         }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A', 'Z');
    }
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }
}
