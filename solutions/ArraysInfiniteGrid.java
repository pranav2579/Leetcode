package CodingPractice.InterviewBit;

import java.util.ArrayList;

public class ArraysInfiniteGrid {

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        double initialX = A.get(0);
        double initialY = B.get(0);
        int steps = 0;
        for (int i = 1; i < A.size(); i++) {
            double x = A.get(i);
            double y = B.get(i);
            double diffx = Math.abs(x-initialX);
            double diffy = Math.abs(y-initialY);
            while ( diffx > 0 && diffy > 0 ){
                steps++;
                diffx--;
                diffy--;
            }
            while(diffx > 0){
                steps++;
                diffx--;
            }

            while(diffy > 0){
                steps++;
                diffy--;
            }
            initialX = x;
            initialY = y;
        }
        return steps;
    }

}
