public class Main {
    public static void main(String[] args) {
        Hogwarts tom = new Hufflepuff("tom", 10,20,30, 40, 50);
        Hogwarts jon = new Hufflepuff("jon", 13,5,3, 25, 50);
        Hogwarts igor = new Gryffindor("igor", 50,40,30, 55, 45);
        Hogwarts dima = new Gryffindor("dima", 45,67,80, 15, 25);
        Hogwarts elena = new Ravenclaw("elena", 15,40,70, 30, 45);
        Hogwarts olga = new Ravenclaw("olga", 16,54,90, 25, 90);
        Hogwarts superman = new Slytherin("superman", 100,100,100, 100,
                100,100,100);
        Hogwarts loser = new Slytherin("loser", 1,1,1, 1, 1,
                1,1);
        HeroesCompare.hogwartsCompare(tom, jon);
        tom.facultyCompare(jon);
        System.out.println(tom);
        System.out.println(jon);
        HeroesCompare.hogwartsCompare(igor,superman);
    }
}