//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class MatrixSumming2
{
    private int[][] m = {{1,2,3,4,5},{6,7,8,9,0},{6,7,1,2,5},{6,7,8,9,0},{5,4,3,2,1}};   //load in the matrix values

    public int sum( int r, int c ) {
        int sum = 0;
        for (int row = r-1; row <= r+1; row++) {
            for (int col = c-1; col <= c+1; col++) {
                if(row>=0 && row<=m.length-1 && col>=0 && col<=m[row].length-1){
                    sum+=m[row][col];
                }
                else if(row ==0 && col==0){
                    sum+=m[row][col];
                    sum+=m[row][col+1];
                    sum+=m[row+1][col];

                }
            }

        }

        return sum;
    }

    public String toString()
    {
        return m.toString();
    }
}
