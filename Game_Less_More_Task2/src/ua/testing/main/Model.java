package ua.testing.main;

import java.util.ArrayList;
import java.util.List;

public class Model {

  private int diap1 = 1;
  private int diap2 = 99;
  private int randNum;
  private List<Integer> list = new ArrayList<>();
  private int input_Num;

  public int get_Random_Number() {
    randNum = (int) (Math.random() * 99) + 1;
    return randNum;
  }

  public List<Integer> getList() {
    return list;
  }

  public String checkNumber(int inputNum) {
    String text = "";
    if (inputNum > randNum) {
      diap2 = inputNum - 1;
      text = View.MESSAGE_NUM_BIGGER;
    }
    if (inputNum < randNum) {
      diap1 = inputNum + 1;
      text = View.MESSAGE_NUM_LESS;
    }
    if (inputNum == randNum) {
      text = View.MESSAGE_FINALLY;
    }
    return text;
  }

  public List add_Number_In_List(int number) {
    list.add(number);
    return list;
  }

  public void setRandNum(int randNum) {
    this.randNum = randNum;
  }

  public int getDiap1() {
    return diap1;
  }

  public int getDiap2() {
    return diap2;
  }

  public int getInput_Num() {
    return input_Num;
  }

  public void setInput_Num(int input_Num) {
    this.input_Num = input_Num;
  }
}
