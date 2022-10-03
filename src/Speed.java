 class Speed extends Turck {
    protected int maxSpeed;

     public Speed(int num, int old, int wheels, String steering, int infection, int numOfTrailers, double maxWeight, int maxSpeed) {
         super(num, old, wheels, steering, infection, numOfTrailers, maxWeight);
         this.maxSpeed = maxSpeed;
     }

     public int getMaxSpeed() {
         return maxSpeed;
     }

     public void setMaxSpeed(int maxSpeed) {
         this.maxSpeed = maxSpeed;
     }

     @Override
     public String toString() {
         return "Speed{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "numOfTrailers=" + numOfTrailers +
                 "MaxWeight=" + MaxWeight +
                 "maxSpeed=" + maxSpeed +
                 '}';
     }
 }
