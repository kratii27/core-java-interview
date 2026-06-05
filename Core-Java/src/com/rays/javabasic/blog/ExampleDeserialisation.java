package com.rays.javabasic.blog;

import java.io.*;

public class ExampleDeserialisation implements Serializable {
    public void display() {
        System.out.println("Object created using deserialization");
    }

    public static void main(String[] args) {
        try {


            // Serialization
            ExampleDeserialisation original = new ExampleDeserialisation();
            FileOutputStream fos = new FileOutputStream("example.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();



            // Deserialization
            FileInputStream fis = new FileInputStream("example.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ExampleDeserialisation deserialized = (ExampleDeserialisation) ois.readObject();
            ois.close();

            deserialized.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}