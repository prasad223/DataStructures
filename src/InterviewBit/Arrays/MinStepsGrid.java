package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * Created by prasad on 5/20/16.
 */
public class MinStepsGrid {

    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int distance = 0;
        int x1 = X.get(0) ,x2,y1 = Y.get(0),y2;
        for(int i = 1; i < X.size()-1;i++){
            x2 = X.get(i);
            y2 = Y.get(i);
            distance += Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
            x1 = x2;
            y1 = y2;
        }
        return distance;
    }

    public static void main(String[] args) {
        MinStepsGrid minStepsGrid = new MinStepsGrid();
        ArrayList<Integer> X = new ArrayList<Integer>(){{ add(0);}};
    }
}
