package Task7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    //Котик сможет поесть, даже если в миске не достаточно еды для полного насыщения,
    // просто снизится его аппетит.
    public void eat(Bowl bowl) {
        int eated = bowl.decreaseFood(appetite);
        if (eated == appetite) {
            this.isFullness = true; this.appetite = 0;
        } else {
            appetite -= eated;
        }
        System.out.printf("Cat %s has eaten %d food\n", name, eated);
    }

    public void isFullness() {
        if (isFullness) {
            System.out.printf("%s наелся.\n", this.name);
        } else {
            System.out.printf("%s голодный.\n", this.name);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
    public static Cat[] initialize (int count) {
        Cat[] cats = new Cat[count];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Котик" + (i + 1), (int) (Math.random() * Math.pow(cats.length, 2)) );
        }
        return cats;
    }
}
