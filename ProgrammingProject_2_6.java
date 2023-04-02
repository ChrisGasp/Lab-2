import java.math.BigInteger;

public class ProgrammingProject_2_6 {

    public static void main(String[] args)
    {
        String str = "10";
        System.out.println("The number is " + str);
        int exp = 2;
        BigInteger BI = new BigInteger(str);
        for (int n = 0; n < 3; n++)
        {
            System.out.println(str +" to the power of "+exp+" equals: "+BI.pow(exp));
            exp *= 2;
        }
    }
}
