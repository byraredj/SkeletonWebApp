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

    return "";
  }

  private static String getSumOf(String query) {
    final String[] strArray = query.split(" ");
    final Integer number1 = Integer.parseInt(strArray[2]);
    final String str = strArray[4].replace("?","");
    final Integer number2 = Integer.parseInt(str);
    final int sum = number1 + number2;
    return Integer.toString(sum);
  }
}
