public class PracticeExercise_2_1
{
    public static void main(String[] args)
    {
        String str1 = "Mississippi";

        String str2 = str1.replace("ss", "s");
        String str3 = str2.replace("i", "ii");

        System.out.println("Original string: " + str1 + "\nLength: " + str1.length() + "\n");
        System.out.println("Mississippi where 'ss' is replaced with 's': " + str2 + "\nLength: " + str2.length() + "\n");
        System.out.println(str3 + "where 'i' is replaced with 'ii': " + str3 + "\nLength: " + str3.length() + "\n");


    }
}
