package ua.testing.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import ua.testing.main.Model;
import ua.testing.main.View;

public class ModelTest {

  Model model = new Model();

  @Test
  public void get_Random_Number() {
    for (int i = 0; i <= 100000; i++) {
      int rand = model.get_Random_Number();
      if (rand > 99 && rand < 1) {
        Assert.fail();
      }
    }
  }

  @Test
  public void checkNumber1() {
    model.setRandNum(55);
    String text = View.MESSAGE_NUM_BIGGER;
    assertEquals(text, model.checkNumber(67));
  }

  @Test
  public void checkNumber2() {
    model.setRandNum(56);
    String expected = View.MESSAGE_NUM_LESS;
    String actual = model.checkNumber(23);
    assertEquals(expected, actual);
  }

  @Test
  public void checkNumber3() {
    model.setRandNum(99);
    String expected = View.MESSAGE_FINALLY;
    String actual = model.checkNumber(99);
    assertEquals(expected, actual);
  }

  @Test
  public void add_Number_In_List() {
    ArrayList<Integer> list = new ArrayList<>();
    int num = 5;
    list.add(5);
    assertEquals(list,model.add_Number_In_List(5));
  }
}