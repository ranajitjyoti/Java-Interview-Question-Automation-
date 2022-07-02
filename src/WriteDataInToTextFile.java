import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\Raspuja 19,20,21\\javaprctc.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(" I want to learn java.");
		bw.write(" I want to learn Python.");
		
		bw.write(" I want to learn Ruby.");
		System.out.println("Finished");
		bw.close();
		
	}

}
