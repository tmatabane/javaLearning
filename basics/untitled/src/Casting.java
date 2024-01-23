public class Casting {
    public static void main(String[] args){
       int maxIntValue = Integer.MAX_VALUE;
       long longValue = (long)(maxIntValue) + 1;

       System.out.println("Max int value: "+maxIntValue);
       System.out.println(maxIntValue+" + 1 = "+longValue +" (long)");

       byte byteMaxValue = Byte.MAX_VALUE;
       int intValue = (int)(byteMaxValue) + 1;

       System.out.println("Max byte value: "+byteMaxValue);
       System.out.println(byteMaxValue + " + 1 = "+intValue + " (int)");
    }
}
