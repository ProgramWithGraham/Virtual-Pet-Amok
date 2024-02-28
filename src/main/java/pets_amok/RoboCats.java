package pets_amok;

public class RoboCats extends VirtualPet implements Cat {
  
    
    int oilLevel = 80;
    int maintenance = 90;

    public RoboCats(String petName, String petDescription, int petHealth) {
        super(petName, petDescription, petHealth);
    }

    public int getOilLevel() {
        return this.oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getMaintenance() {
        return this.maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    @Override
    public void oilLevel() {
        oilLevel += 5;
    }

    @Override
    public void maintenance() {
        maintenance += 5;
    }

    @Override
    public void happiness() {
        oilLevel -= 2;
        maintenance -= 2;
    }
}
