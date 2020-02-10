package ua.testing.main;

import java.util.List;

public class View {

  public static final String MESSAGE_INPUT = "Please input your variant of number in ";
  public static final String MESSAGE_ERROR_INPUT = "Please input cyfra !!! ";
  public static final String MESSAGE_FINALLY = "You win !!! The number is";
  public static final String MESSAGE_NUM_BIGGER = "Your number bigger!!!";
  public static final String MESSAGE_NUM_LESS = "Your number less!!!";
  public static final String MESSAGE_TRY = "Try again";

  public void print_Message_Builder(String text1, String text2) {
    StringBuilder builder = new StringBuilder();
    StringBuilder result = builder.append(text1).append(" ").append(text2);
    System.out.println(result);
  }

  public void print_Message(String text) {
    System.out.println(text);
  }

  public void print_List(List<Integer> list) {
    System.out.print("Your previous attempts: ");
    for (Integer number : list) {
      System.out.print(number + " ");
    }
  }
}
