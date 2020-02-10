package ua.kpi.iasa;

import java.util.Scanner;
import java.util.Vector;

public class Controller {

    private static final String  MORE_PATTERN="MORE";
    private static final String  LESS_PATTERN="LESS";
    private static final String  TRUE_PATTERN="TRUE";
    private static Scanner scanner=new Scanner(System.in);
    private Model model;
    private View view;
    private Vector<Integer> vector;
    public Controller(Model model,View view)
    {
        this.model=model;
        this.view=view;
        vector=new Vector<>();
    }

    public void userAction()
    {   String result;
        int userValue;
        view.printlnMessage(View.GREETING);
        view.printBounds();
        do{ view.printMessage(View.MAKE_INPUT);
            userValue=input();
            result=model.checkValue(userValue);
            view.printlnMessage("");
            switch (result)
            { case MORE_PATTERN:
                view.printlnMessage(View.MORE_MESSAGE);
                break;

                case LESS_PATTERN:
                    view.printlnMessage(View.LESS_MESSAGE);
                    break;

                case TRUE_PATTERN:
                    view.printlnMessage(View.WIN_MESSAGE);
                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + result);
            }
            getStat();
            view.printStat(vector);
            view.printBounds();
            view.printlnMessage("");


        }while (!result.equals(TRUE_PATTERN));






    }




    public int input()
    {try {
        int value = scanner.nextInt();
        if (value > GlobalConst.MIN && value < GlobalConst.MAX)
            return value;
    }
    catch (NumberFormatException e) {
        view.printlnMessage(View.WRONG_INPUT);
    }
        view.printlnMessage(View.WRONG_INPUT);
        return 0;
    }
    public void getStat()
    {
        vector=model.getStatVector();
    }
}
