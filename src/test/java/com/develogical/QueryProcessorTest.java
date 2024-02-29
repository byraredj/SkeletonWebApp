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
  }

}
