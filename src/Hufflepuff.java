public class Hufflepuff extends Hogwarts implements HeroesCompare {
    private int hardWork;       // трудолюбие
    private int loyalty;        // верность
    private int honesty;        // честность

    public Hufflepuff(String fullName, int powerMagic, int transgression, int hardWork, int loyalty, int honesty) {
        super(fullName, powerMagic, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString()
                + " hardWork=" + hardWork
                + " loyalty=" + loyalty
                + " honesty=" + honesty;
    }

    @Override
    public void facultyCompare(Hogwarts student) {
        Hufflepuff heroes = null;
        if (student instanceof Hufflepuff) {
            heroes = (Hufflepuff) student;
        } else {
            throw  new RuntimeException("Не тот герой");
        }
        int totalHeroes1 = hardWork + loyalty + honesty;
        int totalHeroes2 = heroes.hardWork + heroes.loyalty + heroes.honesty;
        if (totalHeroes1 > totalHeroes2) {
            System.out.println(String.format("%s лучший Пуффендуец, чем %s",
                    this.getFullName(), heroes.getFullName()));
        } else if (totalHeroes2 > totalHeroes1) {
            System.out.println(String.format("%s лучший Пуффендуец, чем %s",
                    heroes.getFullName(), this.getFullName()));
        } else {
            System.out.println(String.format("%s и  %s равны",
                    this.getFullName(), heroes.getFullName()));
        }
    }
}

