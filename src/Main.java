class Main {
    public static void main(String[] args) {
       Vehicles[] vc = new Vehicles[3];
       Cart cart = new Cart(5,5,4,"g",5,false,4.4);
       vc[0] = cart;
        vc[1] = new Cart(5,5,4,"f,",4,true,5.5);
        vc[2] = new Cart(5,5,4,"f,",3,true,5.5);






    }
    public int infection (Vehicles[] vc){
        int sum =0;
        for(int i = 0;i<vc.length;i++){
           sum = sum+vc[i].getInfection();
        }
        return sum;
    }
    public void noise(Vehicles[] vc){
        for(int i = 0;i<vc.length;i++) {
            if(vc[i] instanceof Regular){
                ((Regular)vc[i]).noise();
            }
        }
    }
    public int NumOfPassengersWithoutTheDriver(Vehicles[] vc){
        int sum = 0;
        for(int i = 0;i<vc.length;i++) {
            if (vc[i] instanceof Regular){
                sum = ((sum)+((Regular)vc[i]).getNumOfPassengers())-1; //באופניים יש נוסע אחד והוא הנהג וביקשו מספר הנוסעים מלבד הנהג ולכן אין משמעות לאופניים
            }
        }
        return sum;
    }
    public int VehicleWithMaxChargingTime(Vehicles[] vc){
        Double max = 0.0;
        int place = 0;
        for(int i = 0;i<vc.length;i++) {
            if (vc[i] instanceof Cart) {
                if(((Cart) vc[i]).getChargingTime()>max){
                    max = ((Cart) vc[i]).getChargingTime();
                    place = i;
                }
            }
        }
        return vc[place].getNum();
    }
}
