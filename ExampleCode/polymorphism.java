/************************************************
1. *Copyright. For internal Use only
*
*FILE: polymorphism.java
*PROJECT:Problem Solving 3
*Module:1
*
*Description:
*This is just for example to understand the polymorphism
*
*Note:
*
*Compiler dependencies or special instruction:
*This project is run using Textpad and compile using java
*
*Revision History
*Date: 2nd April 2019   By: Muhammad Syafiq Bin Abdul Manan   Description:This is the intial push

*************************************************/
class Game{
 public void type()
 {  System.out.println( "Indoor & outdoor" ); }
}

class Cricket extends Game{
 public void type()
 {  System.out.println( "outdoor game" ); }


public class polymorphism{

 public static void main(String[] args) {
   Game gm = new Game();
   Cricket ck = new Cricket();
   gm.type();
   ck.type();
   gm=ck;                     //gm refers to Cricket object
   gm.type();               //calls Cricket's version of type
 }
}

}