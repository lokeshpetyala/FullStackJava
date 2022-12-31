package exercise;

public class RemoveWhiteSpaces {
    public static void main(String []args){
        String str = "FullStack Java Training";
        System.out.println("Actual String without whitespaces: "+str);
        int count=0;
        for(int i=0;i<str.length();i++)
        if(str.charAt(i)==' '){
            count++;
        }
        System.out.println("Total Whitespaces are: " +count);
    }
}
