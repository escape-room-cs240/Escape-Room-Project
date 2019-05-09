/*To-Do:
   -Image variable
      -Return image method
      -Set image method
*/
public class Item{
   private String name; //returns what the object is called
   private String description; //returns a brief description of what the object is
   private Item combinesWith; 
   private boolean destroyed; //returns whether the item is destroyed 
   
   //constructor when given only a name 
   public Item(String name){
      this.name = name;
      this.description = null;
   }
   
   //constructor for the object that contains their name and description
   public Item(String name, String description){
      this.name = name;
      this.description = description;
   }
   
   //allows option to set description for a specific object 
   public void setDescription(String description){
      this.description = description;
   }
   
   //returns the description for the object
   public String getDescription(){
      if(description != null){
         return description;
      }else if(destroyed){
            return "It's broken. Not much you can do with it now."
      }else{
         if(isVowel(name.charAt(0))){
            return "It's an " + name + ". What is there to say?";
         }else{
            return "It's a " + name + ". What is there to say?";
         }
      }
   }
   
   //Ties this object with another one
   public void combine(Item other){
      this.combinesWith = other; 
   }
   
   public boolean destroyed(){
      return destroyed;
   }
   
   private boolean isVowel(char letter){
      return(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
   }
}