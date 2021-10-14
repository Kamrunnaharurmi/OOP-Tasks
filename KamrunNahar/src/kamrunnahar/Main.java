
package kamrunnahar;

/*Name: Kamrun Nahar
Id:2012020309 
section:G
Email:cse_2012020309@lus.ac.bd
Date:15-9-21*/
public class Main {
    
    public static void main(String[] args) {
       Player pp = new Player("Shakib",75);
       Cricket cricket = new Cricket("International Match",20,pp);
       cricket.display() ;  
       Football football = new Football();
       
     
    }
}
