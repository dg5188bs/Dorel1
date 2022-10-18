 class Cart extends Light{
    protected double chargingTime;

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

     public double exhaust(){
         return exhaust()+50;
     }

     public void hitchhikers(){
         System.out.println("only"+(wheels-1)+"hitchhikers can get on the vehicle");
     }

     @Override
     public String toString() {
         return "Cart{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "engine=" + engine +
                 "chargingTime=" + chargingTime +
                 '}';
     }
 }
