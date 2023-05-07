package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Utils.*;
import static hexlet.code.Utils.getExpression;

public class Templates {
    //for EvenGames and further
    public static int num1 = randonIntNum();
    public static int num2 = randonIntNum();
    public static int num3 = randonIntNum();
    public static String checker1 = isEven(num1);
    public static String checker2 = isEven(num2);
    public static String checker3 = isEven(num3);
    public static Scanner scanner = new Scanner(System.in);

    //for calc
    public static int[] nums1 = {randonIntNum(), randonIntNum()};
    public static int[] nums2 = {randonIntNum(), randonIntNum()};
    public static int[] nums3 = {randonIntNum(), randonIntNum()};
    public static String expression1 = expression();
    public static String expression2 = expression();
    public static String expression3 = expression();
    public static int getExpression1 = getExpression(nums1[0],nums1[1], expression1);
    public static int getExpression2 = getExpression(nums2[0],nums2[1], expression2);
    public static int getExpression3 = getExpression(nums3[0],nums3[1], expression3);

    //for GCD game
    public static int gcd1 = gcd(nums1[0], nums1[1]);
    public static int gcd2 = gcd(nums2[0], nums2[1]);
    public static int gcd3 = gcd(nums3[0], nums3[1]);

    //for progression

    public static int index1 = (int)(Math.random()*10);
    public static int index2 = (int)(Math.random()*10);
    public static int index3 = (int)(Math.random()*10);



}
