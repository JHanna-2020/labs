//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
        ArrayList<Integer> sums = new ArrayList<Integer>();


        for(int i = 0;i<m.length;i++){
            int sumRow =0;
            for(int j=0;j<m[i].length;j++){
                sumRow+=m[i][j];

            }
            sums.add(sumRow);

        }
        return sums;
}}
