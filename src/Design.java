 class Design extends Regular {
    protected String color;

     public Design(int num, int old, int wheels, String steering, int infection, int numOfPassengers, String color) {
         super(num, old, wheels, steering, infection, numOfPassengers);
         this.color = color;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     @Override
     public String toString() {
         return "Design{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "numOfPassengers=" + numOfPassengers +
                 "color='" + color + '\'' +
                 '}';
     }
 }
