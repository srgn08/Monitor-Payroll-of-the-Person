import java.io.*;


public class Read {
	public Read(){
		
	}
	/**
	 * reading file
	 * @param array1
	 * @param file_name
	 */
	public Read(String[] array1, String file_name)
	{
	int i=0;
	try {
		File file = new File(file_name);
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			array1[i++]=line;			
		}
		fileReader.close();	
		
	} catch (IOException e) {
		e.printStackTrace();
	}		
	}		
}
	