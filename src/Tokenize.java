import java.util.StringTokenizer;
public class Tokenize {
	/**
	 * split data
	 * @param array1
	 * @param split
	 * @return
	 */
	public String[][] tokenizer(String []array1,String split)
	{ 
		int j=0,k=0,i=0;
		String [][] tokenizer_array=new String[18752][6];
		
		while(array1[k]!=null){
	 StringTokenizer st = new StringTokenizer(array1[k],split);
	 while (st.hasMoreTokens()) {
	     tokenizer_array[i][j++]=st.nextToken();
	 }
	 k++;
	 j=0;
	 i++; 
		}	
		return tokenizer_array;
		 
	}
}

