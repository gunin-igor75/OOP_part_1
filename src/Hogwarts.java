public abstract class Hogwarts implements HeroesCompare {
    private String fullName;
    private int powerMagic;     // сила магии
    private int transgression;  // трансгрессия

    public Hogwarts(String fullName, int powerMagic, int transgression) {
        this.fullName = fullName;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return fullName + " powerMagic=" + powerMagic + " transgression=" + transgression;
    }
}
