 class Turck extends Heavy {
    private double MaxWeight;

     public Turck(int num, int old, int wheels, String steering, int infection, int numOfTrailers, double maxWeight) {
         super(num, old, wheels, steering, infection, numOfTrailers);
         MaxWeight = maxWeight;
     }

     public double getMaxWeight() {
         return MaxWeight;
     }

     public void setMaxWeight(double maxWeight) {
         MaxWeight = maxWeight;
     }

     @Override
     public String toString() {
         return "Turck{" +
                 "MaxWeight=" + MaxWeight +
                 '}';
     }
 }
