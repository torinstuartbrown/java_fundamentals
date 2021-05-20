package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
class Ex3 {
    public static void main(String[] args) throws IOException {
//        dataInputOutput();
//        objectInputOutput();

//        bufferedInputeSream();
//        pipedReader();
        bufferedCharWrite();
    }

    public static void dataInputOutput(){
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("/Users/torin/CN/labs/online-" +
                "java-fundamentals/src/labs_examples/input_output/files/DOS.dat"))){
            out.writeInt(1);
            out.writeUTF("Torin");
            out.writeUTF("Brown");
            out.writeBoolean(true);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        try (DataInputStream in = new DataInputStream(new FileInputStream("/Users/torin/CN/labs/online-java-" +
                "fundamentals/src/labs_examples/input_output/files/DOS.dat"))){
            int i = in.readInt();
            String firstName = in.readUTF();
            String lastName = in.readUTF();
            boolean isCoder = in.readBoolean();
            StringBuilder sb = new StringBuilder();
            sb.append(i).append(",").append(firstName).append(",").append(lastName).append(",").append(isCoder);
            System.out.println(sb.toString());
        } catch (IOException exc){
            System.out.println(exc.getMessage());
        }
    }

    public static void bufferedInputeSream(){
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/torin/CN/labs/online-" +
                "java-fundamentals/src/labs_examples/input_output/files/Buffedoutput.dos"))){
            int count = 0;
            for(int i = 0; i<1000; i++){
                count++;
                bos.write(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/torin/CN/labs/online-" +
                "java-fundamentals/src/labs_examples/input_output/files/Buffedoutput.dos"))){
            byte[] buffer = new byte[5];
            int bytesRead = 0;
            while((bytesRead = bis.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, bytesRead));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void objectInputOutput(){
        Material gravel = new Material(6, "rock", 4.99, 3, "grey crush rock");
        try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("/Users/torin/CN/labs/online-java-fundamentals/src/labs_examples/input_output/files/gravel.txt"))) {
            oout.writeObject(gravel);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("/Users/torin/CN/labs/online-java-fundamentals/src/labs_examples/input_output/files/gravel.txt"))){
            Material material = (Material) oin.readObject();
            System.out.println(material.toString());
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void pipedReader() throws IOException {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader();

        pr.connect(pw);

        char[] carray = {'J','A','V','A'};
        pw.write(carray, 0, 4);
        int a = carray.length;
        System.out.println("Use of write : " );
        while (a>0){
            System.out.print(" " + (char) pr.read());
        }
        pw.close();
        pr.close();
    }

    public static void bufferedCharWrite(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/torin/CN/labs/online-" +
                "java-fundamentals/src/labs_examples/input_output/files/Buffedwriter.txt"))){
            int count = 0;
            for(int i = 0; i<1000; i++){
                char c = (char)count;
                bw.newLine();
                bw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}