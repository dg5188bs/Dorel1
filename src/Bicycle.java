class Bicycle extends Light {
    private boolean isBasket;

    public Bicycle(int num, int old, int wheels, String steering, int infection, boolean engine, boolean isBasket) {
        super(num, old, wheels, steering, infection, engine);
        this.isBasket = isBasket;
    }

    public boolean isBasket() {
        return isBasket;
    }

    public void setBasket(boolean basket) {
        isBasket = basket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "isBasket=" + isBasket +
                '}';
    }
}
