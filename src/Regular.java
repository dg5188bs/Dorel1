 class Regular extends Vehicles{
     private int numOfPassengers;

     public Regular(int num, int old, int wheels, String steering, int infection, int numOfPassengers) {
         super(num, old, wheels, steering, infection);
         this.numOfPassengers = numOfPassengers;
     }

     public int getNumOfPassengers() {
         return numOfPassengers;
     }

     public void setNumOfPassengers(int numOfPassengers) {
         this.numOfPassengers = numOfPassengers;
     }

     @Override
     public String toString() {
         return "Regular{" +
                 "numOfPassengers=" + numOfPassengers +
                 '}';
     }
 }
