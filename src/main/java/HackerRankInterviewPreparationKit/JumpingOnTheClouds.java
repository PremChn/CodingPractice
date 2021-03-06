package HackerRankInterviewPreparationKit;

/*Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others
are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2.
She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting position to
the last cloud. It is always possible to win the game.

For each game, Emma will get an array of clouds numbered '0' if they are safe or '1' if they must be avoided.
For example, c=[0,1,0,0,0,1,0] indexed from 0.....6.
The number on each cloud is its index in the list so she must avoid the clouds at indexes  1 and 5.
She could follow the following two paths: 0 --> 2 -->  4 --> 6 or 0 --> 2 --> 3 --> 4 -->6.
The first path takes 3 jumps while the second takes 4.*/

import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Print total number of clouds:");
        int n = in.nextInt();
        int cloud[] = new int[n];
        System.out.println("Enter values for clouds:");
        for(int i = 0; i < n; i++){
            cloud[i] = in.nextInt();
        }
        System.out.println(jumpingOnClouds(cloud));
    }
    public static int jumpingOnClouds(int[] arr){
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == 0 && arr[j + 1] != 1){

            }
        }

        return 0;

    }
}
