/*
*
* Class View
*
* V1.0
*
* Anton Korol 05.02.2020
* All copyright reserved.
*/



package ua.kpi.iasa;



import java.util.Vector;

public class View {

    public static final String WIN_MESSAGE="You won!";
    public static final String WRONG_INPUT="Wrong input!";
    public static final String MORE_MESSAGE="More";
    public static final String LESS_MESSAGE="Less";
    public static final String GREETING="Guess number:";
    public static final String STAT="Statistic:";
    public static final String MAKE_INPUT="Make input:";
    public void printlnMessage(String message)
    {
        System.out.println(message);
    }
    public void printMessage(String message)
    {
        System.out.print(message);
    }
    public void printStat(Vector<Integer> stat)
    {   if (!stat.isEmpty()) {
            System.out.print(STAT);
            for (Integer el : stat) {
                System.out.print(el + " ");
            }
        }
        System.out.println();
    }

    public void printBounds()
    {
        System.out.println("("+ GlobalConst.MIN+";"+GlobalConst.MAX+")");
    }
}
