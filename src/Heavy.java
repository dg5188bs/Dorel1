 class Heavy extends Vehicles{
    private int numOfTrailers;

     public Heavy(int num, int old, int wheels, String steering, int infection, int numOfTrailers) {
         super(num, old, wheels, steering, infection);
         this.numOfTrailers = numOfTrailers;
     }

     public int getNumOfTrailers() {
         return numOfTrailers;
     }

     public void setNumOfTrailers(int numOfTrailers) {
         this.numOfTrailers = numOfTrailers;
     }

     @Override
     public String toString() {
         return "Heavy{" +
                 "numOfTrailers=" + numOfTrailers +
                 '}';
     }
 }
