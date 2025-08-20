import java.util.Scanner;
public class datatype{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the multi string value: ");
        String gh=s.nextLine();
        System.out.print("Enter the integer value: ");
        int a=s.nextInt();
         System.out.print("Enter the float value: ");
        float b=s.nextFloat();
         System.out.print("Enter the double value: ");
        double c=s.nextDouble();
         System.out.print("Enter the char value: ");
        char d=s.next().charAt(0);
         System.out.print("Enter the boolean value: ");
        boolean e=s.nextBoolean();
         System.out.print("Enter the short value: ");
        short f=s.nextShort();
        System.out.print("Enter the long value: ");
        long g=s.nextLong();
         System.out.print("Enter the byte value: ");
        byte h = s.nextByte();
        System.out.print("Enter the String one value: ");
        String i=s.next();
        s.nextLine();
        System.out.print("Enter the multi string value: ");
        String j=s.nextLine();
    }
}
