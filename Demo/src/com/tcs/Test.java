package com.tcs;

import java.util.Random;

public class Test {
public static void main(String[] args) {
	generatingRandomAlphabeticString();
	
	givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect();
}
public static void generatingRandomAlphabeticString() {
    int leftLimit = 48; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
 
    String generatedString = random.ints(leftLimit, rightLimit + 1).filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
      .limit(targetStringLength)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
 
    System.out.println(generatedString);
}
public static void givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect() {
	 
    int leftLimit = 48; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();
 
    System.out.println(generatedString);
}
}
