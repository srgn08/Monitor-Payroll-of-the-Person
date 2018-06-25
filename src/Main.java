import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String []array = new String[10];
		String [][]array2=null;
		String[]array3=new String[10];
		String array4[][]=null;
		/**
		 * args[1] is monitoring.txt
		 */
		Read r=new Read(array,args[1]);
		/**
		 * Tokenize class is split String data
		 */
		Tokenize t=new Tokenize();
		array2=t.tokenizer(array,"\t");
		/**
		 * args[0] is personnel.txt
		 */
		Read r2=new Read(array3,args[0]);
		Tokenize t2=new Tokenize();
		array4=t2.tokenizer(array3,"\t");
		int i=0,j=0,k=0;
		Manager m=null;
		Officer o=null;
		Security s=null;
		Worker w=null;
		Chief c = null;
		PartTime pt=null;
		BufferedWriter bw = null;
		BufferedWriter bw2 = null;
		BufferedWriter bw3 = null;
		BufferedWriter bw4 = null;
		BufferedWriter bw5 = null;
		BufferedWriter bw6 = null;
		
		/**
		 * array4 is keep personnel.txt and this loop are controls personnel name and create constructor
		 */
		while(array4[i][0]!=null){
			if(array4[i][2].equals("MANAGER")){
				
				m=new Manager(array4[i][0], array4[i][1],array4[i][2],Integer.parseInt(array4[i][3]));
			}
			else if(array4[i][2].equals("OFFICER"))
			{
				o=new Officer(array4[i][0], array4[i][1],array4[i][2],Integer.parseInt(array4[i][3]));
			}
			else if(array4[i][2].equals("SECURITY"))
			{
				 s=new Security(array4[i][0], array4[i][1],array4[i][2],Integer.parseInt(array4[i][3]));
			}
			else if(array4[i][2].equals("WORKER"))
			{
				w=new Worker(array4[i][0], array4[i][1],array4[i][2],Integer.parseInt(array4[i][3]));
			}
			else if(array4[i][2].equals("CHIEF"))
			{
				c=new Chief(array4[i][0], array4[i][1],array4[i][2],Integer.parseInt(array4[i][3]));
			}
			else if(array4[i][2].equals("PARTTIME_EMPLOYEE"))
			{
				pt=new PartTime(array4[i][0], array4[i][1],array4[i][2],Integer.parseInt(array4[i][3]));
			}
			i++;
				
		}
		
		/**
		 * array2 keep monitoring.txt and this loop control registration number and calculate hour work
		 */
			while(array2[j][0]!=null){
				if(array2[j][0].equals(m.getRegistration_number())){
					m.control(Integer.parseInt(array2[j][1]));
					m.control(Integer.parseInt(array2[j][2]));
					m.control(Integer.parseInt(array2[j][3]));
					m.control(Integer.parseInt(array2[j][4]));	
				}
				else if(array2[j][0].equals(o.getRegistration_number())){
					o.control(Integer.parseInt(array2[j][1]));
					o.control(Integer.parseInt(array2[j][2]));
					o.control(Integer.parseInt(array2[j][3]));
					o.control(Integer.parseInt(array2[j][4]));	
				}
				else if(array2[j][0].equals(s.getRegistration_number())){
					s.control(Integer.parseInt(array2[j][1]));
					s.control(Integer.parseInt(array2[j][2]));
					s.control(Integer.parseInt(array2[j][3]));
					s.control(Integer.parseInt(array2[j][4]));	
				}
				else if(array2[j][0].equals(w.getRegistration_number())){
					w.control(Integer.parseInt(array2[j][1]));
					w.control(Integer.parseInt(array2[j][2]));
					w.control(Integer.parseInt(array2[j][3]));
					w.control(Integer.parseInt(array2[j][4]));	
				}
				else if(array2[j][0].equals(c.getRegistration_number())){
					c.control(Integer.parseInt(array2[j][1]));
					c.control(Integer.parseInt(array2[j][2]));
					c.control(Integer.parseInt(array2[j][3]));
					c.control(Integer.parseInt(array2[j][4]));	
				}
				else if(array2[j][0].equals(pt.getRegistration_number())){
					pt.control(Integer.parseInt(array2[j][1]));
					pt.control(Integer.parseInt(array2[j][2]));
					pt.control(Integer.parseInt(array2[j][3]));
					pt.control(Integer.parseInt(array2[j][4]));	
				}	
				j++;	
			}
			
			/**
			 * this loop make writing file
			 */
			while(array4[k][0]!=null){
				if(array4[k][2].equals("MANAGER")){
					 File file = new File(m.getRegistration_number()+".txt");
					 FileWriter fw = new FileWriter(file);
					 bw = new BufferedWriter(fw);
					 m.split();
					 bw.write(m.toString());
					 bw.close();
				}
				else if(array4[k][2].equals("OFFICER"))
				{
					 File file2 = new File(o.getRegistration_number()+".txt");
					 FileWriter fw = new FileWriter(file2);
					 bw2 = new BufferedWriter(fw);
					 o.split();
					 bw2.write(o.toString());
					 bw2.close();
					
				}
				else if(array4[k][2].equals("SECURITY"))
				{
					 File file3= new File(s.getRegistration_number()+".txt");
					 FileWriter fw = new FileWriter(file3);
					 bw3 = new BufferedWriter(fw);
					 s.split();
					 bw3.write(s.toString());
					 bw3.close();
				}
				else if(array4[k][2].equals("WORKER"))
				{
					 File file4 = new File(w.getRegistration_number()+".txt");
					 FileWriter fw = new FileWriter(file4);
					 bw4 = new BufferedWriter(fw);
					 w.split();
					 bw4.write(w.toString());
					 bw4.close();
				}
				else if(array4[k][2].equals("CHIEF"))
				{
					 File file5 = new File(c.getRegistration_number()+".txt");
					 FileWriter fw = new FileWriter(file5);
					 bw5 = new BufferedWriter(fw);
					 c.split();
					 bw5.write(c.toString());
					 bw5.close();
				}
				else if(array4[k][2].equals("PARTTIME_EMPLOYEE"))
				{
					 File file6 = new File(pt.getRegistration_number()+".txt");
					 FileWriter fw = new FileWriter(file6);
					 bw6 = new BufferedWriter(fw);
					 pt.split();
					 bw6.write(pt.toString());
					 bw6.close();
				}
				k++;
					
			}
			
			
			
			
			
			
			
			
			
			
			
	}
		
}
