public class Slytherin extends Hogwarts {
    private int cunning;            // хитрость
    private int determination;      // решительность
    private int ambition;           // амбициозность
    private int resourcefulness;    // находчивость
    private int authority;          // властность

    public Slytherin(String fullName, int powerMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(fullName, powerMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return super.toString()
                + " cunning=" + cunning
                + " determination=" + determination
                + " ambition=" + ambition
                + " resourcefulness=" + resourcefulness
                + " authority=" + authority;
    }

    @Override
    public void facultyCompare(Hogwarts student) {
        Slytherin heroes = null;
        if (student instanceof Slytherin) {
            heroes = (Slytherin) student;
        } else {
            throw  new RuntimeException("Не тот герой");
        }
        int totalHeroes1 = cunning + determination + ambition + resourcefulness + authority;
        int totalHeroes2 = heroes.cunning + heroes.determination + heroes.ambition
                + heroes.resourcefulness + heroes.authority;
        if (totalHeroes1 > totalHeroes2) {
            System.out.println(String.format("%s лучший Слизеринец, чем %s",
                    this.getFullName(), heroes.getFullName()));
        } else if (totalHeroes2 > totalHeroes1) {
            System.out.println(String.format("%s лучший Слизеринец, чем %s",
                    heroes.getFullName(), this.getFullName()));
        } else {
            System.out.println(String.format("%s и  %s равны",
                    this.getFullName(), heroes.getFullName()));
        }
    }
}
