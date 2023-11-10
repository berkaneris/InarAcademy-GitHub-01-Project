package week_10.assigments;

public class MyStringBuilder1 {

    private StringBuilder str;
    public MyStringBuilder1(String s){
        str = new StringBuilder(s);
    }
    public StringBuilder getStr(){
        return str;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s){
      String newStr = str.toString() + s.getStr().toString();
      return new MyStringBuilder1(newStr);

    }
    public MyStringBuilder1 append(int i){
        String newStr = str.toString() + i;
        return new MyStringBuilder1(newStr);
    }
    public int length(){
        return str.length();
    }
    public char charAt(int index){
        return str.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        return new MyStringBuilder1(str.toString().toLowerCase());
    }
    public MyStringBuilder1 substring(int begin, int end){
        String subString = "";
        for(int i = begin; i <= end; i++){
            subString += str.charAt(i);
        }
        return new MyStringBuilder1(subString);
    }
    @Override
    public String toString(){
        return str.toString();
    }
}
