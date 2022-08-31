public interface HeroesCompare {
    static void hogwartsCompare(Hogwarts heroes1, Hogwarts heroes2) {
        int totalHeroes1 = heroes1.getPowerMagic() + heroes1.getTransgression();
        int totalHeroes2 = heroes2.getPowerMagic() + heroes2.getTransgression();
        if (totalHeroes1 > totalHeroes2) {
            System.out.println(String.format("%s обладает большей мощностью магии, чем %s",
                    heroes1.getFullName(), heroes2.getFullName()));
        } else if (totalHeroes2 > totalHeroes1) {
            System.out.println(String.format("%s обладает большей мощностью магии, чем %s",
                    heroes2.getFullName(), heroes1.getFullName()));
        } else {
            System.out.println(String.format("%s обладает равной  мощностью магии как и %s",
                    heroes1.getFullName(), heroes2.getFullName()));
        }
    }
    void facultyCompare(Hogwarts heroes);
}
