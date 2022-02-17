//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m) {

        int currentBiggest = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j]>currentBiggest){
                    currentBiggest = m[i][j];
                }
            }
        }
        return currentBiggest;

    }
}
