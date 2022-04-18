package Task7;

public class Main {

    public static void main(String[] args) {

        var bowl = new Bowl();
        bowl.putFood(180);
        Cat[] cats = Cat.initialize(8);
        for (Cat cat: cats
             ) { cat.isFullness();
            System.out.println(cat);
        }
        //for (Cat cat: cats
        //   ) {cat.eat(bowl);
        //System.out.println(cat);
        //}
        while(!bowl.isEmpty()) {
            cats[(int) (Math.random() * cats.length)].eat(bowl);
        }

        for (Cat cat: cats
        ) { cat.isFullness();
        }





	// write your code here
    }
}
