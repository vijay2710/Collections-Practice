
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Array{
	
	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();
		
		FileInputStream fin = new FileInputStream("WarandPeace.txt");
		Scanner br = new Scanner(fin);
		
		//create the array list
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		while(br.hasNext()){
			String nextWord = br.next();
			String[] wording = nextWord.split("[^A-Za-z'-]");
			for (String w:wording){
			if(words.contains(w)){
				int index = words.indexOf(w);
				count.set(index,count.get(index) + 1);
				
			}
			else{
				words.add(nextWord);
				count.add(1);
				
			}
		}
		}
		br.close();
		fin.close();
		
		
		// Write out the words
		PrintWriter pw = null;
		
		try {
		    pw = new PrintWriter("output.csv");
		} catch(FileNotFoundException e) {
		    System.out.println("Can't open a file for writing");
		}
		
		for(int i=0; i< words.size(); i++){
			pw.println(words.get(i) + ", " + count.get(i));			
		}
		
		pw.flush();
		pw.close();
		
		
		long endTime = System.currentTimeMillis();
        long finalTime = endTime - startTime;
        System.out.println("the time is" +finalTime);
	}
}


