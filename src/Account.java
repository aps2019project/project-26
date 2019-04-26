import java.io.FileNotFoundException;
import java.util.ArrayList;
import  java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Account {
    private ArrayList<Player> playerInfo = new ArrayList<Player>();
    File file = new File("accountFile.txt");

    public void createAccount(String username){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password;
        password = scanner.nextLine();
        if(password.equals(null)){
            System.out.println("No password was entered !!!!");
            createAccount(username);
        }
        Player player = new Player();
        player.settingPassword(username, password);
        playerInfo.add(player);

    }
    public void login(String username){
        System.out.println("Please enter your password:");
        Scanner scanner = new Scanner(System.in);
        String password;
        password = scanner.nextLine();
    }
    public void logout(){

    }
    public void saveGame(){

    }
    public void getUser(String username){
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String inpUser = scanner.nextLine();
                if(inpUser == username){
                    System.out.println("This username is used before");
                    return;
                }

            }
            createAccount(username);

        }catch (FileNotFoundException e){

        }
    }
}
