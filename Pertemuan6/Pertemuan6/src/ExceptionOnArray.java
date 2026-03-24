/**
 * File       : ExceptionOnArray.java
 * Deskripsi  : Program penggunaan eksepsi menggunakan class library Java
 */

public class ExceptionOnArray {
    public static void main(String[] args) {

        // Instansiasi array Integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Ini akan menyebabkan exception
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}