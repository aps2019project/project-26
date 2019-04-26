import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Account {
    private ArrayList<Player> playerInfo = new ArrayList<Player>();
    private ArrayList<String> signedPlayer = new ArrayList<String>();
    File file = new File("accountFile.txt");

    public void createAccount(){

    }
    public void getUser(String username){
        int newUser = 1;
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String inpUser = scanner.nextLine();
                if(inpUser == username){
                    System.out.println("This username is used before");
                    return;
                }

            }

        }catch (FileNotFoundException e){

        }
    }
}
