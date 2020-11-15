package lab_4;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/** 
 * �������� ������ ����� �� ��������� csv �����
 * https://github.com/Eniferbill/JavaLabs
 * @autor ��������� ������ ������������� 3 ���� 7 ������
 * @version 1.0
*/
public class OpenCSV 
{
	
	/** 
     * ����� ��������� ������ �� ����� � ������ allData � �� �����
     * @param file - ���� � ��������� �����
     */ 
	public static void readData(String file) 
	{ 
	  
		try 
		{ 
	        FileReader filereader = new FileReader(file); 
	        CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build(); 
	        List<String[]> allData = csvReader.readAll(); 
	        for (String[] row : allData) 
	        { 
	            for (String cell : row) System.out.print(cell + "\t"); 
	            System.out.println(); 
	        } 
	    } 
	    catch (Exception e) { 
	        e.printStackTrace(); 
	    }
		

	} 
	
	public static void main(String[] args) throws IOException, CsvValidationException 
	{
		String csvFilePath = "src/main/resources/foreign_names.csv";
		OpenCSV.readData(csvFilePath);
	}
}	