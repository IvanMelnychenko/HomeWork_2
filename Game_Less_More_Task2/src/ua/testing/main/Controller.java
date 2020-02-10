package ua.testing.main;

import java.util.Scanner;

public class Controller {

  private Model model = new Model();
  private View view = new View();

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  public void randomNumber() {
    int num = model.get_Random_Number();
    System.out.println(num);
    getUser();
  }

  public void getUser() {
    Scanner sc = new Scanner(System.in);
    view.print_Message(
        View.MESSAGE_INPUT + " [" + String.valueOf(model.getDiap1()) + " , " + String.valueOf(model.getDiap2()) + "]");
    model.setInput_Num(checkNumber_Or_Other(sc));
    checkDiapasone(model.getInput_Num());
  }

  public int checkNumber_Or_Other(Scanner sc) {
    int num = 0;
    try {
      num = sc.nextInt();
    } catch (Exception e) {
      view.print_Message(View.MESSAGE_ERROR_INPUT);
    }
    return num;
  }

  public void checkDiapasone(int num) {
    if (num < model.getDiap1() || num > model.getDiap2()) {
      getUser();
    } else {
      String text = model.checkNumber(num);
      switch (text) {
        case View.MESSAGE_NUM_BIGGER:
          view.print_Message_Builder(View.MESSAGE_NUM_BIGGER, View.MESSAGE_TRY);
          model.add_Number_In_List(num);
          getUser();
          break;
        case View.MESSAGE_NUM_LESS:
          view.print_Message_Builder(View.MESSAGE_NUM_LESS, View.MESSAGE_TRY);
          model.add_Number_In_List(num);
          getUser();
          break;
        case View.MESSAGE_FINALLY:
          view.print_Message_Builder(View.MESSAGE_FINALLY, String.valueOf(model.getInput_Num()));
          model.add_Number_In_List(num);
          view.print_List(model.getList());
          break;
      }
    }
  }
}
