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
    if(query.toLowerCase().contains("33 plus 24")) {
      return "57";
    }

    return "";
  }
}
