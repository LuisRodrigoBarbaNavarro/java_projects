package admin;

// Java program to read content from one file
// and write it into another file
  
// Importing input output classes
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
  
// Class
class Project {
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // The file reading process may sometimes give
        // IOException
  
        // Try block to check for exceptions
        try {
  
            // Creating a FileReader object and
            // file to be read is passed as in parameters
            // from the local directory of computer
            FileReader fileReader = new FileReader("input.txt");
  
            // FileReader will open that file from that
            // directory, if there is no file found it will
            // through an IOException
  
            // Creating a FileWriter object
            FileWriter fileWriter = new FileWriter("output.txt");
  
            // It will create a new file with name
            // "gfgOutput.text", if it is already available,
            // then it will open that instead
  
            // Declearing a blank string in which
            // whole content of file is to be stored
            String outpuString = "";
  
            int index;
  
            // read() method will read the file character by
            // character and print it until it end the end
            // of the file
  
            // Condition check
            // Reading the file using read() method which
            // returns -1 at EOF while reading
            while ((index = fileReader.read()) != -1) {
  
                // Storing every character in the string
                outpuString += "0" + Integer.toBinaryString((char) index) + " ";
            }
  
            // Print and display the string that
            // contains file data
            System.out.println(outpuString);
  
            // Writing above string data to
            // FileWriter object
            fileWriter.write(outpuString);
  
            // Closing the file using close() method
            // of Reader class which closes the stream &
            // release resources that were busy in stream
            fileReader.close();
            fileWriter.close();
  
            // Display message
            System.out.println(
                "Lectura y escritura de archivos completadas");
        }
  
        // Catch block to handle the exception
        catch (IOException e) {
  
            // If there is no file in specified path or
            // any other error occured during runtime
            // then it will print IOException
  
            // Display message
            System.out.println(
                "Hay algunas excepciones con refente a las entradas y salidas del fichero.");
        }
    }
}