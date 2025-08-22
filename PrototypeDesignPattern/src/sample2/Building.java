package sample2;

public class Building extends Graphics{

    private BuildingType buildingType;

    public Building(int height, BuildingType buildingType) {
        super(height);
        this.buildingType = buildingType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public String toString() {
        return "Building{" +
                "height=" + getHeight() +
                ", buildingType=" + buildingType +
                '}';
    }


    @Override
    public Building clone() {
        return new Building(this.getHeight(), new BuildingType(this.buildingType.getTypeName()));
    }


}
