package org.example.basicstrong.oop.DesignPatterns;


interface Burger {
    public void makeBurger();
}

class PlainBurger implements Burger {

    public void makeBurger() {
        System.out.println("Plain  Burger is ready.");
    }
}

abstract class BurgerDecorator extends PlainBurger {
    protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    public void makeBurger() {
        burger.makeBurger();
    }
}

class CheeseBurgerDecorator extends BurgerDecorator {

    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", cheese added.");
    }
}

class BarbecueBurgerDecorator extends BurgerDecorator {

    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }

    public void makeBurger() {
        burger.makeBurger();
        System.out.println(", vegetables and cheese added.");
    }
}
    public  class DecoratorDesignPattern {

        public static void main(String[] args) {

            Burger burger = new PlainBurger();
            burger.makeBurger();

            BurgerDecorator bd = new CheeseBurgerDecorator(burger);
            bd.makeBurger();
            BurgerDecorator bd1 = new BarbecueBurgerDecorator(burger);
            bd1.makeBurger();
        }
    }


