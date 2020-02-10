package ua.kpi.iasa;

import java.util.Scanner;
import java.util.Vector;

import static ua.kpi.iasa.GlobalConst.MAX;

public class Model {
    private Scanner scanner;
    private int unknownValue;

    private Vector<Integer> vector;


    public Model(){
        unknownValue= (int) (Math.random()* MAX);
        vector=new Vector<>();
    }
    public String checkValue(int usersValue)
    {   addValue(usersValue);
        if (unknownValue==usersValue)

            return "TRUE";
        if (unknownValue>usersValue) {
            GlobalConst.MIN = usersValue;
            return "MORE";
        }
        if (unknownValue<usersValue) {
            GlobalConst.MAX=usersValue;
            return "LESS";
        }
        return null;
    }
    public Vector getStatVector()
    {
        return vector;
    }
    public void addValue(int value)
    {
        vector.add(Integer.valueOf(value));
    }


}
