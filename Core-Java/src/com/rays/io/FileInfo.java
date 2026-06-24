package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
    public static void main(String[] args) { 

        File f = new File("F:\\io\\hello.txt");

        if (f.exists()) {
            System.out.println(f.isFile());
            System.out.println(f.isDirectory());
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.length());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            Date d = new Date(f.lastModified());
            System.out.println(d);
        }
    }
}
