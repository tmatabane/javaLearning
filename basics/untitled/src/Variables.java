public class Variables {
    public static void main(String[] args){
        int myFirstNumber = 60;
        System.out.println("First number = "+myFirstNumber);

        int mySecondNumber = 44;
        System.out.println("Second number = "+mySecondNumber);

        int secondNumberPlusFirst = myFirstNumber + mySecondNumber;
        System.out.println(myFirstNumber + " + "+ mySecondNumber +" = "+secondNumberPlusFirst);

        int doubled = secondNumberPlusFirst * 2;
        System.out.println(secondNumberPlusFirst+"*2 = "+doubled);
    }
}
