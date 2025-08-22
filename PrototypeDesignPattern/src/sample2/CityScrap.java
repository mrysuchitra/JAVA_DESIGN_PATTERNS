package sample2;

public class CityScrap {
    public static void main(String[] args) {

        BuildingType type1 = new BuildingType("Skyscraper");
        Building building1 = new Building(200, type1);
        Building building2 = building1.clone();
        Building building3 = building1.clone();

        BuildingType type2 = new BuildingType("Residential");
        Building building4 = new Building(100, type2);
        Building building5 = building4.clone();
        Building building6 = building4.clone();
        type2.setTypeName("Apartment");

        System.out.println("Building Summary");
        printBuilding(building1, building2, building3, building4, building5, building6);

    }

    private static void printBuilding(Building... building) {
        for (Building b : building) {
            System.out.println(b);
        }
    }
}
