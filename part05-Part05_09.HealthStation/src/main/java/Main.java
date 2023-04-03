
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrensHospital = new HealthStation();
        
        Person ethan = new Person("Ethan", 1, 110, 7);
        Person matt = new Person ("Matt", 33, 176, 85);
        
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(matt.getName() + " weight: " + childrensHospital.weigh(matt) + " kilos");
        
        System.out.println("weighings performed: " + childrensHospital.weighings());
        
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        
        System.out.println("weighings performed: " + childrensHospital.weighings());
        
        System.out.println("");
        
        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(matt.getName() + " weight: " + childrensHospital.weigh(matt) + " kilos");
    }
}
