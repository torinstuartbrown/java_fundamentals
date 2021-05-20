package labs_examples.input_output.labs;

import labs_examples.input_output.examples.csv_parser.Student;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
public class Exercise_04 {

    public static void main(String[] args) throws IOException {

        ArrayList<Material> materials = new ArrayList<>();

        String filePath = "C:\\Users\\torin\\CN\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\files\\landscaping_materials.csv";
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if(count > 0){
                    materials.add(mapValuesToMaterialObject(values));
                } else {
                    for(String s : values){
                        System.out.println(s);
                    }
                }
                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();;
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Material material : materials) {
            System.out.println(material.toString());
        }
    }

    private static Material mapValuesToMaterialObject(String[] values) {
        Material material = new Material();
        material.setId(Integer.parseInt(values[0]));
        material.setType(values[1]);
        material.setCost(Double.parseDouble(values[2]));
        material.setWeight(Double.parseDouble(values[3]));
        material.setDescription(values[4]);
        return material;
    }
}