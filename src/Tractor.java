 class Tractor extends Heavy {
    private String TypesOfTrailers;

     public Tractor(int num, int old, int wheels, String steering, int infection, int numOfTrailers, String typesOfTrailers) {
         super(num, old, wheels, steering, infection, numOfTrailers);
         TypesOfTrailers = typesOfTrailers;
     }

     public String getTypesOfTrailers() {
         return TypesOfTrailers;
     }

     public void setTypesOfTrailers(String typesOfTrailers) {
         TypesOfTrailers = typesOfTrailers;
     }

     @Override
     public String toString() {
         return "Tractor{" +
                 "TypesOfTrailers='" + TypesOfTrailers + '\'' +
                 '}';
     }
 }
