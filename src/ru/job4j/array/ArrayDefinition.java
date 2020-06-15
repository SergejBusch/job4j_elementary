package ru.job4j.array;

public class ArrayDefinition {
    short[] shortArray = new short[10];
    String[] stringArray = new String[100500];
    float[] floatArray = new float[40];

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Johnny";
        names[1] = "Bonny";
        names[2] = "Tony";
        names[3] = "Penny";

        for (String string : names) {
            System.out.println(string);
        }
    }
}
