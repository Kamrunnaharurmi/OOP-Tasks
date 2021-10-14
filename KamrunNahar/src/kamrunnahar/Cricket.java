
package kamrunnahar;
/*Name: Kamrun Nahar
Id:2012020309 
section:G
Email:cse_2012020309@lus.ac.bd
Date:15-9-21*/

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    
public Cricket(String matchType,int over,Player player)
{
    this.matchType = matchType;
    this.over=over;
    this.player = player;
}
void display(){
    
    System.out.println("Match Type : "+matchType);   
    System.out.println("Over : "+over); 
    System.out.println("Name of player : "+player.playerName); 
    System.out.println("Jersey Number : "+player.jerseyNumber); 
  
}
}
