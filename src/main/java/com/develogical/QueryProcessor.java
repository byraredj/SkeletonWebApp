package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }
    if(query.toLowerCase().contains("uncle bob")) {
      return "Clean Code";
    }
    if(query.toLowerCase().contains("name")) {
      return "firsttimers";
    }
    if(query.toLowerCase().contains("plus")) {
      return getSumOf(query);
    }

    if(query.toLowerCase().contains("largest")) {
      return getLargest(query);
    }

    if(query.toLowerCase().contains("multiplied")) {
      return getMultipliedValue(query);
    }

    if(query.toLowerCase().contains("square and a cube")) {
      return getSquareAndCubeNumber(query);
    }

    if(query.toLowerCase().contains("minus")) {
      return getDiff(query);
    }

    return "";
  }

  private String getSquareAndCubeNumber(String query) {
    final String[] strArray = query.split(":");
    final String numberArrayStr = strArray[1].replace("?","").replace(" ", "");
    final String[] numberArray = numberArrayStr.split(",");
    for (int i = 0; i < numberArray.length ; i++) {
      double value = Double.parseDouble(numberArray[i]);
      double sqrt = Math.sqrt(value);
      double cubeRt = Math.cbrt(value);
      if(sqrt %1 == 0 && cubeRt % 1 == 0) {
        return Double.toString(value);
      }
    }
  return null;
  }

  private String getMultipliedValue(String query) {
    final String[] strArray = query.split(" ");
    final Integer number1 = Integer.parseInt(strArray[2]);
    final String str = strArray[5].replace("?","");
    final Integer number2 = Integer.parseInt(str);
    final int value = number1 * number2;
    return Integer.toString(value);
  }

  private String getLargest(String query) {
    final String[] strArray = query.split(":");
    final String numberArrayStr = strArray[1].replace("?","").replace(" ", "");
    final String[] numberArray = numberArrayStr.split(",");
    int largest = 0;
    for (int i = 0; i < numberArray.length ; i++) {
      int value = Integer.parseInt(numberArray[i]);
      if(value > largest) {
        largest = value;
      }
    }

    return Integer.toString(largest);
  }

  private static String getSumOf(String query) {
    final String[] strArray = query.split(" ");
    final Integer number1 = Integer.parseInt(strArray[2]);
    final String str = strArray[4].replace("?","");
    final Integer number2 = Integer.parseInt(str);
    final int sum = number1 + number2;
    return Integer.toString(sum);
  }

  private static String getDiff(String query) {
    final String[] strArray = query.split(" ");
    final Integer number1 = Integer.parseInt(strArray[2]);
    final String str = strArray[4].replace("?","");
    final Integer number2 = Integer.parseInt(str);
    final int diff = number1 - number2;
    return Integer.toString(diff);
  }

  private static String getPrimes(String query) {
    return null;
  }

  private boolean isPrime(int num)
  {
    if(num<=1)
    {
      return false;
    }
    for(int i=2;i<=num/2;i++)
    {
      if((num%i)==0)
        return  false;
    }
    return true;
  }
}
