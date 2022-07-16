package bandar.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization : save state of object
public class mainSerialization {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Game game = new Game();
		game.level=6;
		
		
		File file = new File("src/source/Serializtion.text");
		FileOutputStream outputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(game);
		
		
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Game game2 = (Game) objectInputStream.readObject();
		
		System.out.println("the Value of game object from file : " + game2.level);
	}
	
}

class Game implements Serializable{
	int level ;
}

