package labs_examples.input_output.examples.csv_parser;

import com.sun.org.apache.xpath.internal.functions.FuncRound;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class CSV_Parse {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList();

        String filePath = "src/labs_examples/input_output/files/students.csv";



        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                students.add(mapValuesToStudentObject(values));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Student student : students){
            System.out.println(student.toString());
        }

        double avg = averageGPA(students);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(avg));
    }

    private static double averageGPA(ArrayList<Student> students) {
        double avgGpa;
        double sum = 0;

        for (int i = 0; i < students.size(); i++){
            sum += students.get(i).getGpa();
        }

        avgGpa = sum / students.size();
        return avgGpa;
    }


    private static Student mapValuesToStudentObject(String[] values) {

        Student student = new Student();

        student.setId(Integer.parseInt(values[0]));
        student.setFirstName(values[1]);
        student.setLastName(values[2]);
        student.setGpa(Double.parseDouble(values[3]));

        return student;

    }

}

