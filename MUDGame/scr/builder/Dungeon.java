class Dungeon {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }
    
    @Override
    public String toString() {
        return "Dungeon: " + name + "\nRooms: " + rooms + "\nNPCs: " + npcs;
    }
}
