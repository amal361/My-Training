package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excel ob= new Excel();
		/*String a=ob.readData(0,0);
        System.out.println("Value of a is "+a);
        
        String b=ob.readData(0,1);
        System.out.println("Value of b is "+b); */
		
		for(int i=0;i<ob.rowsize();i++) {
		  for(int j=0;j<2;j++) {
			String a=ob.readData(i,j);
	        System.out.println("Value of cell("+i+","+j+") is "+a);
		  }
}

	}

	}


