class Bicycle extends Light {
    protected boolean isBasket;

    public Bicycle(int num, int old, int wheels, String steering, int infection, boolean engine, boolean isBasket) {
        super(num, old, wheels, steering, infection, engine);
        this.isBasket = isBasket;
    }

    public boolean isBasket() {
        return isBasket;
    }

    public void setBasket(boolean basket) {
        this.isBasket = basket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "num=" + num +
                ", old=" + old +
                ", wheels=" + wheels +
                ", steering='" + steering + '\'' +
                ", infection=" + infection +
                "engine=" + engine +
                "isBasket=" + isBasket +
                '}';
    }
}
