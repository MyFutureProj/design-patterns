package com.designpatterns.creational.builderpattern;

/**
 * @author Ravi Panchal
 */
public class Burger {

    private String size;

    private boolean cheese;

    private boolean periperi;

    private boolean meyo;

    private Burger(){

    }

    @Override
    public String toString() {
        return "Burger{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", periperi=" + periperi +
                ", meyo=" + meyo +
                '}';
    }

    public Burger(BurgerBuilder burgerBuilder){
        this.size = burgerBuilder.size;
        this.periperi = burgerBuilder.periperi;
        this.cheese = burgerBuilder.cheese;
        this.meyo = burgerBuilder.meyo;
    }

    public static class BurgerBuilder{

        private String size;

        private boolean cheese;

        private boolean periperi;

        private boolean meyo;

        public BurgerBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public BurgerBuilder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder setPeriperi(boolean periperi) {
            this.periperi = periperi;
            return this;
        }

        public BurgerBuilder setMeyo(boolean meyo) {
            this.meyo = meyo;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}
