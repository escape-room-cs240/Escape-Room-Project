/*To-Do
   -Store all previous room descriptions in a linked-list format
   -Image variable, implimentation similar to the description
      -return method
      -set method
   -Keep a set of items contained in each room
      -remove method for when user takes an item
      -add method to place items in room 
*/
public class Room{
   
   private String desc;//Reference to the description of the room
   public Room prev;//Reference to the previous room
   public Room next;//Reference to the next room
   
   //Constructor for an instance of the Room class
   public Room(String desc, Room prev, Room next){
      this.desc = desc;
      this.prev = prev;
      this.next = next;
   }
   
   //Changes the description of a given room 
   public void setDescription(String desc){
      this.desc = desc;
   }
   
   //Returns the current description of a room
   public String getDescription(){
      return desc;
   }
}