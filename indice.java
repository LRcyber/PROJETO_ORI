
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class indice{

 public static void main(String[] args) throws ParseException {

    Scanner sc= new Scanner (System.in);
    List<File1> list = new ArrayList<>();
    String file1 ="C:\\Users\\User\\Desktop\\Projeto1.txt ";
    String index ="C:\\Users\\User\\Desktop\\Projeto\\index.txt ";
    
    FileReader fr = null;
    BufferedReader br = null;
        
    try {
    fr= new FileReader (file1);
    br= new BufferedReader(fr);
    String item = br.readLine();
    while (item != null){
       String [] fields = item.split(",");
        String palavra = fields [0];
        list.add(new File1(palavra));
        item = br.readLine();
       }    
    
try (BufferedWriter bw = new BufferedWriter(new FileWriter(index))){
    for (File1 itemlista:list){
        bw.write(itemlista.getPalavra());
        bw.newLine();
        //console.log();
       
    }
    
} catch (Exception e) {
    System.out.println(e. getMessage());   
}}
catch (IOException e) {
    System.out.println(e. getMessage());
}
finally{
    try{
br.close();
fr.close();
sc. close();
    }
    catch (IOException e) {
        System.out.println(e. getMessage());
    }

}
 }}