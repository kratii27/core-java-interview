package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserSerialization {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        User user = new User("krati27", "123");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("F:\\io\\serial.txt"));
        out.writeObject(user);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\io\\serial.txt"));

        user = (User) in.readObject();
        System.out.println(user);

    }

}
