public class escapeMain{

    public static void main(String[] args) {
        Room dungeon = new Room("This is a dark room");
        Room dungeon2 = new Room("This is another dark room");
        dungeon.next = dungeon2;
        dungeon2.prev = dungeon;
        System.out.println(dungeon.getDescription());
        System.out.println(dungeon.next.getDescription());
    }
}
