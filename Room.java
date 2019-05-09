public class Room{
   
   private string desc;   
   public Room prev;
   public Room next;
   
   public Room(String desc, Room prev, Room next){
      this.desc = desc;
      this.prev = prev;
      this.next = next;
   }
   
   public Room(String desc, Room next){
      this.desc = desc;
      this.prev = null;
      this.next = next;
   }
   
   public String setDescription(String desc){
      this.desc = desc;
   }
   
   public String getDescription(){
      return desc;
   }
}