package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsAboutUncleBob() throws Exception {
    assertThat(queryProcessor.process("Uncle Bob"), containsString("Clean Code"));
  }  @Test
  public void tellTheName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("firsttimers"));
  }
@Test
  public void sumOf33And24() throws Exception {
    assertThat(queryProcessor.process("What is 33 plus 24?"), containsString("57"));
  }@Test
  public void sumOf70And48() throws Exception {
    assertThat(queryProcessor.process("What is 70 plus 48?"), containsString("118"));
  }
  @Test
  public void largestOf3Numbers() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 96, 28, 68?"), containsString("96"));
  }

  @Test
  public void largestOf3Numbers1() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 75, 94, 15?"), containsString("94"));
  }

  @Test
  public void multiplicationOfTwoNumbers() throws Exception {
    assertThat(queryProcessor.process("What is 20 multiplied by 87?"), containsString("1740"));
  }

  @Test
  public void multiplicationOfTwoNumbers1() throws Exception {
    assertThat(queryProcessor.process("What is 59 multiplied by 84?"), containsString("4956"));
  }

}
