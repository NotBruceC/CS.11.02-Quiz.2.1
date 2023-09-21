// Signed by Bruce Chan - A.I. (academic integrity) 21/9/2023

public class Main {
    public static void main(String[] args) {
        int resultOne = add(1,2);
        System.out.println(resultOne);
        String resultTwo = greeting("ham");
        System.out.println(resultTwo);
        int resultThree = add(3,1,2,3);
        System.out.println(resultThree);
        String resultFour = printMe("hi");
        }
    public static int add(int numOne,int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, " + name +"!";
    }
    public static int add(int numOne,int numTwo,int numThree,int numFour){
        return numOne*3 + numTwo*3;
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
}
