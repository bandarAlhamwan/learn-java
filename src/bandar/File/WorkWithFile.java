package bandar.File;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WorkWithFile {

	public static void main(String[] args) throws IOException {
		
		// Create File
		String fileName = "src/CreateFile.txt";
		File file = new File(fileName);
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println(file.getName() + " Created ");
			} catch (IOException e) {
				System.out.println("Error Createing file: " + e);
			}
		}
		
		
		// Write in File 
		try {
			// FileWriter fileWriter = new FileWriter(fileName,true) // here add content to content
			FileWriter fileWriter = new FileWriter(fileName);	// here rewrite on content
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("id,name,email");
			printWriter.println("1,Bandar,Bandar@gmail.com");
			printWriter.println("2,Saud,Saud@gmail.com");
			for(int i = 0; i <= 100; i++) {
				printWriter.println("3,Reema,Reema@gmail.com");
				//System.out.println(i);
			}
			
			printWriter.flush();
			printWriter.close();
			System.out.println("Content added to the file");
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		// Read File And parsing to user object
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			
			String contents = "";
			System.out.println("Header = " + reader.readLine()); // this is to read first line header
			
			List<User> users = new ArrayList<>();
			while (( contents = reader.readLine()) != null) {
				//System.out.println(contents);
				String[] split = contents.split(",");
				int id = Integer.parseInt(split[0]); 
				String name = split[1];
				String email = split[2];
				User user = new User(id, name, email);
				users.add(user);
				
			}
			reader.close();
			System.out.println("Looping throw users list");
			users.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} 
		
		
		// to open file
		Desktop desktop = Desktop.getDesktop();
		desktop.open(file);
	}
}
