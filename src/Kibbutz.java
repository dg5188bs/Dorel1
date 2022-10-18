 class Kibbutz {
     Vehicles[] vc = new Vehicles[500];
     int count;

     public Kibbutz() {
         count=0;
     }
     public void add(Vehicles vehicles){
         vc[count] = vehicles;
         count++;
     }
     public Vehicles[] Over15AndWheel(){
         Vehicles[] vc2 = new Vehicles[500];
         int place = 0;
         for(int i=0;i<500;i++){
             if(vc[i].getNum()>15 && vc[i].getSteering().equals("wheel")){
                 vc2[place] = vc2[i];
                 place++;
             }
         }
         return vc2;
     }
     public int LightAndWheel(){
         int num = 0;
         for (int i=0;i<500;i++){
             if(vc[i] instanceof Regular || vc[i] instanceof Light ){
                 if(vc[i].getSteering().equals("wheel")){
                     num++;
                 }
             }
         }
         return num;
     }
 }
