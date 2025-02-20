import stanford.karel.SuperKarel;
import java.util.*;
import java.lang.*;
import java.awt.*;
import stanford.karel.*;
public class Homework extends SuperKarel {
    /*You fill the code here */
    /*public static int movesNumber = 0;
    public void run() {
        setBeepersInBag(1000);
        movesNumber = 0;
        paintCorner(Color.GREEN);
        int[] storage = calculateXAndY();
        int x = storage[0];
        int y = storage[1];
        if (x == 2 & y == 2){
            putBeeper();
            moveToOrigin();
            putBeeper();
            paintCorner(Color.white);
            System.out.println("Number of Moves: " + movesNumber);
            return;
        }
        if (x >= 3 && y >= 3){
            divide2D(x);
            turnLeft();
            moveLine();
            turnLeft();
            divide2D(y);
            moveToOrigin();
        }
        else if (x >= 3)
            divide1D(x);
        else if (y >= 3){
            turnLeft();
            divide1D(y);
        }
        else System.out.println("'Wrong', can't be Divided");
        moveToOrigin();
        paintCorner(Color.white);
        System.out.println(movesNumber);
    }
    private int[] getDivideInfo(int dimension , int numOfPieces){
        int numOfExtraBeeper = 0;
        int numberOfUnitsInEachArea = 1;
        int numberAvailableUnits = dimension- numOfPieces + 1;
        while (true){
            if (numberAvailableUnits % numOfPieces == 0){
                numberOfUnitsInEachArea = numberAvailableUnits / numOfPieces;
                break;
            }
            numberAvailableUnits--;
            numOfExtraBeeper++;
        }
        int[] array = {numberOfUnitsInEachArea, numOfExtraBeeper, numOfPieces};
        return array;
    }
    private void divideAline(int numOfUnitsInEachArea, int numOfExtraBeeper, int numOfPieces, int length){
        while(numOfExtraBeeper > 0){
            putBeeper();
            putAnotherBeeper();
            move();
            numOfExtraBeeper--;
        }
        int counter  = 0;
        while(true){
            if (frontIsBlocked())
                break;
            if (counter == numOfUnitsInEachArea){
                counter = 0;
                putBeeper();
                putAnotherBeeper();
                moveIfClear();
                length--;
            }
            moveIfClear();
            length--;
            counter++;
        }
    }
    private void putAnotherBeeper(){
        if (leftIsClear()){
            turnLeft();
            move();
            putBeeper();
            turnAround();
            move();
            turnLeft();
        }
        else if (rightIsClear()){
            turnRight();
            move();
            putBeeper();
            turnAround();
            move();
            turnRight();
        }
    }
    private void divide1D(int x){
        int[] array ;
        if ((x-3) / 4 >= 1){
            array = getDivideInfo(x, 4);
            divideAline(array[0], array[1], array[2], x);
        }
        else if ((x-2) / 3 >= 1){
            array = getDivideInfo(x, 3);
            divideAline(array[0], array[1], array[2], x);
        }
        else if ((x-1) / 2 >= 1){
            array = getDivideInfo(x, 2);
            divideAline(array[0], array[1], array[2], x );
        }
    }
    private void divide2D(int x){
        if (x%2==0){
            for (int i =1; i < x/2 ; i++)
                move();
            if (leftIsClear()&& rightIsBlocked()){
                turnLeft();
                moveLineAndPutBeeper();
                turnRight();
                move();
                turnRight();
            }
            else {
                turnRight();
                moveLineAndPutBeeper();
                turnLeft();
                move();
                turnLeft();
            }
        }
        else{
            for (int i =1; i < x/2+1 ; i++)
                move();
            if (leftIsClear())
                turnLeft();
            else turnRight();
        }
        moveLineAndPutBeeper();
    }
    private int moveLine(){
        int lineLength=1;
        while(frontIsClear()){
            move();
            lineLength++;
        }
        return lineLength;
    }
    private void moveLineAndPutBeeper(){
        if (noBeepersPresent())
            putBeeper();
        while(frontIsClear()){
            move();
            if (noBeepersPresent())
                putBeeper();
        }
    }
    @Override
    public void move(){
        super.move();
        movesNumber++;
    }
    private void moveToOrigin(){
        facingRight();
        turnRight();
        while(!cornerColorIs(Color.GREEN)){
            if (frontIsClear())
                moveLine();
            else if (leftIsClear())turnLeft();
            else turnRight();
        }
        facingRight();
    }
    private void facingRight(){
        while(true){
            if (facingEast())
                return;
            else turnRight();
        }
    }
    private void moveIfClear(){
        if (frontIsClear())
            move();
    }
    public int[] calculateXAndY() {
        int[] XAndY = new int[2];
        int counter;
        for(int i = 0; i < 2; i++){
            counter = 1;
            while(frontIsClear()){
                move();
                counter++;
            }
            turnLeft();
            XAndY[i] = counter;
        }
        return XAndY;
    }
*/
}
