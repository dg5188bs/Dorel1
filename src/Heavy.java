  abstract class Heavy extends Vehicles{
    protected int numOfTrailers;

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

     public double exhaust(){
         return (exhaust())+(500*numOfTrailers);
     }

     @Override
     public String toString() {
         return"Heavy{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "numOfTrailers=" + numOfTrailers +
                 '}';
     }


 }
