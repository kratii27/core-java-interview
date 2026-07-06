package com.rays.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class UrlWriter {
    public static void main(String[] args) throws IOException {
        
       URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

       String ques = "java";
       URLConnection con = url.openConnection();

       con.setDoOutput(true);
       OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream());
       out.write("q=" + ques);

       out.close();

       con.connect();

       InputStream iStr = con.getInputStream();
  
		Scanner in = new Scanner(iStr);

		System.out.print("URL contents ***");

		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}

		in.close();

    }

}
