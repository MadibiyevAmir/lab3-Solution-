class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room originalRoom = new Room("Library", "Filled with old books");
        Room clonedRoom = originalRoom.cloneEntity();
        
        NPC originalNPC = new NPC("Mage", "Master of fire magic");
        NPC clonedNPC = originalNPC.cloneEntity();
        
        System.out.println("Original Room: " + originalRoom);
        System.out.println("Cloned Room: " + clonedRoom);
        System.out.println("Original NPC: " + originalNPC);
        System.out.println("Cloned NPC: " + clonedNPC);
    }
}
