public class Ravenclaw extends Hogwarts {
    private int intelligence;   // ум
    private int wisdom;         // мудрость
    private int creativity;     // творчество

    public Ravenclaw(String fullName, int powerMagic, int transgression, int intelligence, int wisdom, int creativity) {
        super(fullName, powerMagic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString()
                + " intelligence=" + intelligence
                + " wisdom=" + wisdom
                + " creativity=" + creativity;
    }

    @Override
    public void facultyCompare(Hogwarts student) {
        Ravenclaw heroes = null;
        if (student instanceof Ravenclaw) {
            heroes = (Ravenclaw) student;
        } else {
            throw new RuntimeException("Не тот герой");
        }
        int totalHeroes1 = intelligence + wisdom + creativity;
        int totalHeroes2 = heroes.intelligence + heroes.wisdom + heroes.creativity;
        if (totalHeroes1 > totalHeroes2) {
            System.out.println(String.format("%s лучший Когтевранец, чем %s",
                    this.getFullName(), heroes.getFullName()));
        } else if (totalHeroes2 > totalHeroes1) {
            System.out.println(String.format("%s лучший Когтевранец, чем %s",
                    heroes.getFullName(), this.getFullName()));
        } else {
            System.out.println(String.format("%s и  %s равны",
                    this.getFullName(), heroes.getFullName()));
        }
    }
}
