 abstract class Vehicles {
    protected int num;
     protected int old;
     protected int wheels;
     protected String steering;
     protected int infection;

    public Vehicles(int num,int old,int wheels,String steering,int infection){
        this.num = num;
        this.old = old;
        this.wheels = wheels;
        this.steering = steering;
        this.infection = infection;
    }
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
     public void setOld(int old){
         this.old = old;
     }
     public int getOld(){
         return old;
     }
     public void setWheels(int wheels){
         this.wheels = wheels;
     }

     public int getWheels(){
         return wheels;
     }
     public void setSteering(String steering){
         this.steering = steering;
     }

     public String getSteering() {
         return steering;
     }

     public void setInfection(int infection){
         this.infection = infection;
     }
     public int getInfection(){
         return infection;
     }

     @Override
     public String toString() {
         return "Vehicles{" +
                 "num=" + num +
                 ", old=" + old +
                 ", wheels=" + wheels +
                 ", steering='" + steering + '\'' +
                 ", infection=" + infection +
                 '}';
     }

     public double exhaust(){
        return (infection*60);
     }
 }
