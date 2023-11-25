package week_12.assignments;

import java.io.File;

public class Question_12_27 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage java Question_12_27 *");
            System.exit(1);
        }

        File file = new File("C:\\Users\\asus\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_27.java");
        File[] files = new File[0];
        if(args[0].equals("*")){
            File directory = file.getParentFile();
            files = directory.listFiles();
        }
        for (int i = 0; i < files.length; i++){
            if(files[i].isDirectory() && (files[i].getName().matches("Question\\d_\\d+"))){
                String fileName = files[i].getName();
                String[] parts = fileName.split("_");

                if (parts.length == 2 ) {
                    String k = parts[0].substring("Question".length());
                    String newFileName = "Question" + padWithZeros(k) + "_" + parts[1];
                    String newPath = files[i].getParentFile() + "\\" + newFileName;
                    files[i].renameTo(new File(newPath));
                }
            }
        }
    }
    public static String padWithZeros(String str) {
        return str.length() == 1 ? "0" + str : str;
    }
}
