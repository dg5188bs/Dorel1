 class Tractor extends Heavy {
    protected String TypesOfTrailers;

     public Tractor(int num, int old, int wheels, String steering, int infection, int numOfTrailers, String typesOfTrailers) {
         super(num, old, wheels, steering, infection, numOfTrailers);
         TypesOfTrailers = typesOfTrailers;
     }

     public String getTypesOfTrailers() {
         return TypesOfTrailers;
     }

     public void setTypesOfTrailers(String typesOfTrailers) {
         this.TypesOfTrailers = typesOfTrailers;
     }

     @Override
     public String toString() {
         return "Tractor{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "numOfTrailers=" + numOfTrailers +
                 "TypesOfTrailers='" + TypesOfTrailers + '\'' +
                 '}';
     }
 }
