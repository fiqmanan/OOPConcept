/************************************************
1. *Copyright. For internal Use only
*
*FILE: InheritanceProject.java
*PROJECT:Problem Solving 3
*Module:1
*
*Description:
*This is inheritance that apply in PNS
*
*Note:
*
*Compiler dependencies or special instruction:
*This project is run and compile using java online compiler 
*
*Revision History
*Date: 2nd April 2019   By: Muhammad Hazim Bin Rohizat   Description:This is the intial push

*************************************************/
import java.util.Scanner;

class User  
{ 

    public String password; 
    public String userID;
    public String username;
          

    public User (String userID,  String username, String password) 
    { 
        this.password = password; 
        this.userID = userID;
        this.username = username;
    } 
    
    public String toString()  
    { 
        return("Username: " + username +
               "\nPassword: " + password + 
               "\nUserID: " + userID + "\n"); 
    }  
          
} 
  

class Patient extends User  
{ 
    public String address;
    public String email;
    public String ICno;
    public String P_Name;
    public String PatientID;
    public String phoneNo;
    
    
    public Patient( String userID,  String username, String password, String address, String email, String ICno, String P_Name, String PatientID, String phoneNo) 
    { 
    
        super(username, password, userID); 
        this.address = address;
        this.email = email;
        this.ICno = ICno;
        this.P_Name = P_Name;
        this.PatientID = PatientID;
        this.phoneNo = phoneNo;
        
    }
    
     public String toString() 
    { 
        return (super.toString()+ 
                "\n Address: " + address + 
                "\n Email: " + email + 
                "\n Identication No: " + ICno + 
                "\n Name: " + P_Name +
                "\n Patient ID: " + PatientID +
                "\n Phone No: " + ICno ); 
    } 
    
      
} 

class Staff extends User  
{ 
    public String Name;
    public String StaffID;
    public String phoneNo;
    
    public Staff(String userID, String username, String password, String Name, String StaffID, String phoneNo) 
    { 
    
        super(username, password, userID); 
        this.Name = Name;
        this.StaffID = StaffID;
        this.phoneNo = phoneNo;
        
    } 
    
    public String toString() 
    { 
        return (super.toString()+ 
                "\n Name: " + Name + 
                "\n ID: " + StaffID + 
                "\n Phone No: " + phoneNo ); 
    } 

      
} 
  
// driver class 
public class InheritanceProject  
{ 
    public static void main(String args[])  
    { 
         
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter user type");

    if(myObj.hasNextLine())
    {
        String userType = myObj.nextLine(); 
    
        if(userType == "patient")
        {
            System.out.println("Patient info\n");
            Patient pt = new Patient("PA001", "Ali97", "123456", "PT 765, Kampung Seri Indah", "ali97@gmail.com", "950706098585f","Muhammad Ali","ADF6879", "0134545675"  );
            System.out.println(pt.toString()); 
            
        }
        
        else
        {
            System.out.println("Staff info\n");
            Staff st = new Staff("ST001", "Siti1", "123456", "Nor Siti Umairah", "HGJ300", "0134545675"  );
            System.out.println(st.toString()); 
            
        }
              
    }

        
    } 
} 