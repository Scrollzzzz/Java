package com.company.task15;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void first(String path) throws IOException{
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();

        File file = new File(path);
        //file.createNewFile();

        try {
            FileWriter fw = new FileWriter(file, false);
            fw.write(text);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String second(String path) throws IOException {
        File file = new File(path);

        String currLine;
        StringBuilder fileData = new StringBuilder();

        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(file));
            while ((currLine = buffReader.readLine()) != null) {
                fileData.append(currLine);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return fileData.toString();
    }

    public static void third(String path) throws IOException{
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();
        try {
            FileWriter fstream1 = new FileWriter(path);
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();

            FileOutputStream output = new FileOutputStream(file);
            byte[] buf = txt.getBytes();
            output.write(buf, 0, buf.length);
            output.close();
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void fourth(String path) {
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();

        try {
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);

            out.println(txt);
            out.close();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException{
        String path = "src/com/company/task15/test.txt";
        first(path);
        System.out.println(second(path));
        third(path);
        System.out.println(second(path));
        fourth(path);
        System.out.println(second(path));
    }
}