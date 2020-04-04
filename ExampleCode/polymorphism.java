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
public class polymorphism{

  public static class Game{

      	//Constructor
      	public Game(){}

      	//Type Class Display
        public void type()
        {  System.out.println( "Indoor & outdoor" ); }
  }

   public static class Cricket extends Game{

		//Constructor
		public Cricket(){}

		//Type Class Display
 		public void type()
 		{  System.out.println( "outdoor game" ); }
}

public static void main(String[] args){
   Game gm = new Game();
   Cricket ck = new Cricket();
   gm.type();
   ck.type();
   gm=ck;                     //gm refers to Cricket object
   gm.type();               //calls Cricket's version of type
 }
}
