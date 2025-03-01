class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins")
                .addRoom(new Room("Entrance Hall", "Dark and cold"))
                .addRoom(new Room("Throne Room", "Golden decorations everywhere"))
                .addNPC(new NPC("Guardian", "Protects the ruins"))
                .build();
        
        System.out.println(dungeon);
    }
}

