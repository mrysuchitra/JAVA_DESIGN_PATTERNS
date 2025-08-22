package sample2;

public class House {

    public static void main(String args[]){

        var basicRoom = new BasicRoom();
        basicRoom.printFurniture();

        System.out.println();

        var roomWithTable = new RoomWithTable(basicRoom);
        roomWithTable.printFurniture();

        System.out.println();

        var roomWithCouch = new RoomWithCouch(roomWithTable);
        roomWithCouch.printFurniture();

    }

}
