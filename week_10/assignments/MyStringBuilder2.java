package week_10.assigments;

public class MyStringBuilder2 {
    private StringBuilder str;
    public MyStringBuilder2(){
        str = new StringBuilder();
    }
    public MyStringBuilder2(char[] chars){

        this(String.valueOf(chars));
    }
    public MyStringBuilder2(String s){
        str = new StringBuilder(s);
    }
    public StringBuilder getStr(){
        return str;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        String newStr = str.substring(0 , offset) + s.getStr().toString() + str.substring(offset);
        return new MyStringBuilder2(newStr);
    }
    public MyStringBuilder2 reverse(){
        StringBuilder newStr = new StringBuilder();
        for(int i = str.length() - 1; 0 <= i; i--){
            newStr.append(str.charAt(i));
        }
        return new MyStringBuilder2(newStr.toString());
    }
    public MyStringBuilder2 substring(int begin){
        return new MyStringBuilder2(str.substring(begin));
    }
    public MyStringBuilder2 toUpperCase(){
        return new MyStringBuilder2(str.toString().toUpperCase());
    }
    @Override
    public String toString(){
        return str.toString();
    }
}
