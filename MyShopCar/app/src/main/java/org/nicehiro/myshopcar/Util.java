package org.nicehiro.myshopcar;

import java.util.Random;

/**
 * Created by hiro on 16-11-17.
 */

public class Util {

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0; i<length; i++) {
            int number = random.nextInt(62);
            stringBuffer = stringBuffer.append(str.charAt(number));
        }

        return stringBuffer.toString();
    }

    public static String getRandomNumber(int length) {
        String str = "0123456789";
        char[] numbers = new char[length];

        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * 10);
            numbers[i] = str.charAt(rand);
        }

        return new String(numbers);
    }
}
