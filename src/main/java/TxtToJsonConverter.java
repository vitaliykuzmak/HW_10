import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.*;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TxtToJsonConverter {

    public void convertTxtToJson(String inputFilename, String outputFilename) {
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilename))) {
            String header = br.readLine();
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                users.add(new User(name, age));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter(outputFilename)) {
            gson.toJson(users, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
