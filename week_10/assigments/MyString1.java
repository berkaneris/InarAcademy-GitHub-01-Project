package week_10.assigments;

public class MyString1 {

    private char [] chars;
    public MyString1(char[] chars){
       this.chars = chars;
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }
    public MyString1 substring(int begin, int end){
        char [] subString = new char[end - begin + 1];
        for(int i = 0; i < subString.length; i++){
            subString[i] = chars[begin];
            begin++;
            if(begin > end){
                break;
            }
        }
        return new MyString1(subString);

    }
    public MyString1 toLowerCase(){
        for(int i = 0; i < chars.length; i++){
            chars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(chars);
    }
    public boolean equals(MyString1 s){
        if(this.length() != s.length()){
            return false;
        }
        for(int i = 0; i < this.length(); i++){
            if(this.charAt(i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static MyString1 valueOf(int i){
        String number = i + "";
        char [] num = new char[number.length()];

        for(int k = 0; k < num.length; k++){
            num[k] = number.charAt(k);
        }
        return new MyString1(num);
    }
    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < this.length(); i++){
           output += this.charAt(i);
        }
        return output;
    }

}
