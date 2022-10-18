 abstract class Regular extends Vehicles{
     protected int numOfPassengers;

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

     public double exhaust(){
         return exhaust()+numOfPassengers*100;
     }

     public void noise(){
         System.out.println(numOfPassengers*10+"Decibel");
     }

     public void hitchhikers(int RegularPassengers){
         System.out.println("there are"+(numOfPassengers-RegularPassengers)+"hitchhikers");
     }

     @Override
     public String toString() {
         return "Regular{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "numOfPassengers=" + numOfPassengers +
                 '}';
     }
 }
