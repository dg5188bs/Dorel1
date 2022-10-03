 class Light extends Vehicles{
    protected boolean engine;

     public Light(int num, int old, int wheels, String steering, int infection, boolean engine) {
         super(num, old, wheels, steering, infection);
         this.engine = engine;
     }

     public boolean isEngine() {
         return engine;
     }

     public void setEngine(boolean engine) {
         this.engine = engine;
     }

     @Override
     public String toString() {
         return "Light{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 "engine=" + engine +
                 '}';
     }
 }
