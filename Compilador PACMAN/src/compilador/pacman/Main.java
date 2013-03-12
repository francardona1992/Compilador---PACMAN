package compilador.pacman;

import java.io.*;
import java_cup.runtime.Symbol;

public class Main{
    public static void main(String args[]){
        try{
            LexerPacMan scanner = new LexerPacMan(new FileReader("Untitled.txt"));
            parser p = new parser(scanner);
            p.parse();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}