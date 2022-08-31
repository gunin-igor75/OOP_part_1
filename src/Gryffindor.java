public class Gryffindor extends Hogwarts implements HeroesCompare {
    private int nobility; // благородство
    private int honor;    // честь
    private int courage;  // храбрость

    public Gryffindor(String fullName, int powerMagic, int transgression, int nobility, int honor, int courage) {
        super(fullName, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString()
                + " nobility=" + nobility
                + " honor=" + honor
                + " courage=" + courage;
    }


    @Override
    public void facultyCompare(Hogwarts student) {
        Gryffindor heroes = null;
        if (student instanceof Gryffindor) {
            heroes = (Gryffindor) student;
        } else {
            throw new RuntimeException("Не тот герой");
        }
        int totalHeroes1 = nobility + honor + courage;
        int totalHeroes2 = heroes.nobility + heroes.honor + heroes.courage;
        if (totalHeroes1 > totalHeroes2) {
            System.out.println(String.format("%s лучший Гриффиндорец, чем %s",
                    this.getFullName(), heroes.getFullName()));
        } else if (totalHeroes2 > totalHeroes1) {
            System.out.println(String.format("%s лучший Гриффиндорец, чем %s",
                    heroes.getFullName(), this.getFullName()));
        } else {
            System.out.println(String.format("%s и  %s равны",
                    this.getFullName(), heroes.getFullName()));
        }
    }
}
