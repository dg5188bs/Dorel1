 class Cart extends Light{
    private double chargingTime;

     public Cart(int num, int old, int wheels, String steering, int infection, boolean engine, double chargingTime) {
         super(num, old, wheels, steering, infection, engine);
         this.chargingTime = chargingTime;
     }

     public double getChargingTime() {
         return chargingTime;
     }

     public void setChargingTime(double chargingTime) {
         this.chargingTime = chargingTime;
     }

     @Override
     public String toString() {
         return "Cart{" +
                 "chargingTime=" + chargingTime +
                 '}';
     }
 }
