package sample;

/**
 * Created by Carlos on 3/15/17.
 */
public class Predator {
    private int num_of_Preds;

    Predator()
    {
        num_of_Preds = 0;
    }

    Predator(int num)
    {
        num_of_Preds = num;
    }

    public void setNum_of_Preds(int num)
    {
        num_of_Preds = num;
    }

    public int getNum_of_Preds()
    {
        return num_of_Preds;
    }
}
