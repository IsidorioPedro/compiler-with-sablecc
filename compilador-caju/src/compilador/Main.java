package compilador;
import compilador.parser.*;
import compilador.lexer.*;
import compilador.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "test/teste.cj";
  
   Parser p =
    new Parser(
    new Lexer(
    new PushbackReader(  
    new FileReader(arquivo), 1024))); 
   
   Start tree = p.parse();

   tree.apply(new ASTPrinter());
   
   //aplicação da análise semântica em minha AST
   tree.apply(new Semantico());
   
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}