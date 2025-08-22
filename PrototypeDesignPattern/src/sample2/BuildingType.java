package sample2;

public class BuildingType {

    private String typeName;

    public BuildingType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "BuildingType{" +
                "typeName='" + typeName + '\'' +
                '}';
    }
}
