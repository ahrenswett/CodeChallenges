// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static HashMap<Integer,HashSet<Integer>> aladdinsPositions = new HashMap<>();
    static String[] test = {
        "..X...",
        "......",
        "....X.",
        "......",
        "..X.X.",
        "...O.." 
    };
    static String[] test2 = {
        "......",
        ".X....",
        "....X.",
        ".X.X..",
        "..O..."
    };

    public static void main(String[] args) {
        solution(test2);
    }

    public static int solution(String[] B) {
        // write your code in Java SE 11

        // find Jafar and store position in 2d array
        //is jafar on the edge?
        //is aladdin on edge jaffar land out of bounds?

        // 0 | 1 | 2 | 3 | 4 | 5 | 
        // --|---|---|---|---|---|
        // 2 | - | 4 | 1 | 2 | - | 
        // - | - | - | 3 | - | - |

        int jafarX = -1;
        int jafarY = -1;
// go through the arrays adding aladdins postitions to the map and storing Jafars current position   
        for(int y = 0; y < B.length; y++ ){
            String xCoordStr = B[y];
            aladdinsPositions.put(y, new HashSet<Integer>());
            
            for (int x = 0; x < xCoordStr.length(); x++ ){
                
                if( xCoordStr.charAt(x) == 'X'){
                    System.out.println("aladdin pawn found at " + x + "," + y + " " + (aladdinsPositions.get(y).add(x)));
                }
                
                // this is not right syntax
                if( xCoordStr.charAt(x) == 'O') {
                    System.out.println("Jafar found at " + (jafarX = x)  + "," + (jafarY = y));
                }
            }
        }
        System.out.println(numberOfPawnsTakenIs(jafarX,jafarY, B));
        return numberOfPawnsTakenIs(jafarX,jafarY, B);
    }

    static int numberOfPawnsTakenIs(int jafarX,int jafarY, String[] arr){
        int leftCount = 0;
        int rightCount = 0;
        // if there is a possible jump check it 
        if( (jafarY - 2 >= 0) && (aladdinsPositions.get(jafarY-1)!=null)){
            // check left
            if((jafarX -2 >= 0) && (!aladdinsPositions.get(jafarY-2).contains(jafarX-2)) ){
                // check if there is a pawn in the adjacent spot the landing position is empty
                if( aladdinsPositions.get(jafarY-1).contains(jafarX-1)){
                    // increment counter and check for jumps again
                    leftCount++;
                    leftCount+= numberOfPawnsTakenIs(jafarX-2, jafarY-2, arr);
                    // System.out.printf("leftCount = %d%n",leftCount);
                }
            }
            if( (jafarX +2 <= arr[jafarY].length()) && (!aladdinsPositions.get(jafarY-2).contains(jafarX+2)) ){
                // check if there is a pawn in the adjacent spot and the landing position is empty
                if( aladdinsPositions.get(jafarY-1).contains(jafarX+1)){
                    // increment counter and check for jumps again
                    rightCount++;
                    rightCount+= numberOfPawnsTakenIs(jafarX+2, jafarY-2, arr);
                }
            }

        }
        System.out.printf("%nleftCount = %d%nrightCount = %d%n%n", leftCount,rightCount);
        if (rightCount > leftCount) return rightCount;
        return leftCount;
    }
}

        
        // Going to have to do this recursively
        
        // check if Jafar is goin out of bounds on y coord and that the row able to be jumped has something to jump.
    //     while(jafarY - 2 >= 0 && !aladdinsPositions.get(jafarY-1).isEmpty() ){

    //         // check if jafar is goin out of bounds on x coord left           
    //         if(jafarX -2 >= 0){
    //             // check if there is a pawn in the adjacent spot 
    //             if(aladdinsPositions.get(jafarY-1).contains(jafarX-1)){
    //                 // check if the position is empty
    //                 if(!aladdinsPositions.get(jafarY-2).contains(jafarX-2)){
    //                     jafarX = jafarX-2;
    //                     jafarY = jafarY-2;
    //                     numberOfPawnsTaken++;
    //                 }
    //             }
    //         }

    //         // check if jafar is goin out of bounds on x coord right
    //         if(jafarX +2 <= B[jafarY].length()){
    //             // check if there is a pawn in the adjacent spot 
    //             if(aladdinsPositions.get(jafarY-1).contains(jafarX-1)){
    //                 // check if the position is empty
    //                 if(!aladdinsPositions.get(jafarY-2).contains(jafarX+2)){
    //                     jafarX = jafarX-2;
    //                     jafarY = jafarY-2;
    //                     numberOfPawnsTaken++;
    //                 }
    //             }
    //         }            
    //     }
    // }

    

  