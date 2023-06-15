package Animals;

public enum Animals {
    DOG(2),
    CAT(4),
    BIRD(1);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " - " + age + " years old";
    }
}

