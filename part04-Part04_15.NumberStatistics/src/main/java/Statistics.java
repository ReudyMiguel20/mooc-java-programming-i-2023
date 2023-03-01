public class Statistics {
   private int count;
   private int sum;
   
   public Statistics(){
       this.count = count;
       this.count = sum;
   }
   
   public void addNumber(int number){
      this.count += 1;
      this.sum += number;
   }
   
   public int getCount(){
       return this.count;
   }
   
   public int sum(){
       return this.sum;
   }
   
   public double average(){
       if (this.count == 0) {
           return 0;
       }
       double average = 1.0 * this.sum / this.count;
       return average;
   }
}
