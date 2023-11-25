package week_10.assigments;

public class MyString2 {
    private String str;
    public MyString2(String s){
        str = s;
    }
    public String getStr(){
        return str;
    }
    public int compare(String s){
        for(int i = 0; i < str.length() && i < s.length(); i++){
            if(str.charAt(i) != s.charAt(i)){
                return str.charAt(i) - s.charAt(i);
            }
        }
        return str.length() - s.length();
    }
    public MyString2 substring(int begin){
        String subString = "";
        for(int i = begin; i < str.length(); i++){
            subString += str.charAt(i);
        }
        return new MyString2(subString);
    }
    public MyString2 toUpperCase(){
        String upperCase = "";
        for(int i = 0; i < str.length(); i++){
            upperCase += Character.toUpperCase(str.charAt(i));
        }
        return new MyString2(upperCase);
    }
    public char[] toChars(){
        char[] chars = new char[str.length()];
        for(int i = 0; i < chars.length; i++){
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static MyString2 valueOf(boolean b){
        return new MyString2(b + "");
    }
    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < str.length(); i++){
            output += str.charAt(i);
        }
        return output;
    }

}
