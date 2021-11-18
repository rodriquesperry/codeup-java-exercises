package fileIOLecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {

    public static void main(String[] args) throws IOException {
        String directory = "./src/data";
        String filename = "groceryList.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename); //building the whole shebang! A path combining : the directory's path + hte desired filename at the end :D

        System.out.println("dataFile = " + dataFile);
        //Use separate IF statements rather than IF/ELSE
        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory); //Plural method works!! Differences is that the Plural version creates the needed parent directories if they are not created ~ while singular version creates one given directory.
            Files.createDirectory(dataDirectory);
        }

        if (Files.notExists(dataFile)) {
            Files.createFile(dataFile);
        }

        // An example of how to write into a .txt file

        //Create a data file with directory and file
        Path groceryTxtPath = Paths.get(directory, filename); //we got the whole shebang again ~ directory and file combined into one PATH

        System.out.println("groceryTxtPath = " + groceryTxtPath);
        System.out.println("Files.exists(groceryTxtPath) = " + Files.exists(groceryTxtPath));

        //Create a list of array items
        //List is a polyMorph of ArrayList - Look at Collections diagram
        List<String> groceryList = Arrays.asList("dog food", "coffee creamer", "foot bread", "cashew milk");//Arrays helper class is called here - we use ASLIST to make a list datatype of what we passed into our arrays helper class
        System.out.println("groceryList = " + groceryList);

        //Writes directly to the groceryList.txt file ~ Overwrites with changes made to the ArrayList<>
        Files.write(groceryTxtPath, groceryList);

        //Reading from the file
        List<String> printList = Files.readAllLines(groceryTxtPath);
        System.out.println("printList = " + printList);


        //We can write our own print method now
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }


        Files.write(
                (dataFile),
                Arrays.asList("eggs", "milkbones", "jiffy"),
                StandardOpenOption.APPEND
        );

        System.out.println();

        //We need to go check and get the updated .txt file
        groceryList = Files.readAllLines(groceryTxtPath);

        //Print method from above
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        //dive into the text document and get the current number of items [the lines] and look for ONE to update

        //Get the current groceryList from our files
        groceryList = Files.readAllLines(groceryTxtPath);

        //Make a bucket [new list]
        List<String> newList = new ArrayList<>();

        for (String line : groceryList) {
            if (line.equalsIgnoreCase("foot bread")) {
                newList.add("potato bread");
                continue;
            }
            newList.add(line);
        }

        System.out.println("newList = " + newList);

        //Write to the .txt file
        Files.write(groceryTxtPath, newList);


    }


}
