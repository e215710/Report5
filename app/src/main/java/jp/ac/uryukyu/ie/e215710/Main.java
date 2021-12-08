package jp.ac.uryukyu.ie.e215710;

public class Main {
    public static void printLength(String str) {
        int i = str.length() ;
        System.out.println(i) ;
    }

    public static void main(String[]args) {
        try {
            String str = null ;
            printLength(str); 
        }
        catch(NullPointerException ex) {
            System.out.println("エラー：nullだよ" ) ;
            System.out.println(ex.getMessage()) ;
        }
    }
}