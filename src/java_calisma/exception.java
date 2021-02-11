package java_calisma;


import java.io.IOException;

class X{
    public void printFileContent () throws IOException {
        throw new IOException();
    }
}
public class exception {

    public static void main(String[] args) throws IOException {
        X xobj=new X();
        xobj.printFileContent();
    }

}
