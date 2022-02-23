//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming2Runner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
		String cnt = file.nextLine();
		int count = Integer.parseInt(cnt);
		for(int i=0; i<count; i++)
		{
			String num = file.nextLine();
			out.println(num);
		}


		MatrixSumming2 m = new MatrixSumming2();
		out.println(m.sum(4,3));
		out.println(m.sum(0,0));
		out.println(m.sum(2,2));
		out.println(m.sum(4,4));
		out.println(m.sum(2,4));
		out.println(m.sum(1,3));





		// reference slideshow 13 
		// for help on file input
	}
}



