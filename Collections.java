import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//import java.util.Set;







class Collections{
    public static void main(String[] args) {
        
      // ListDemo ld=new ListDemo();
      //   ld.printList();
       //  ld.find(10);

       SetDemo sd = new  SetDemo();
       sd.printSet();
    
        
         
        
    }
}
/*
class ListDemo{
    List<Integer> numbers;
    public ListDemo(){
        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);

    }
    public void printList(){
        for(Integer i:numbers){
            System.out.println(i);
        }
    }
    public void find(Integer i){
        if(numbers.contains(i)){
            System.out.printf("found %d at lacation:%d %n",i,numbers.indexOf(i));

        }
        else{
            System.out.printf("%d not found",i);
        }
    }
    */







    class SetDemo{
        List<Integer> numbers;
        public SetDemo(){
            numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(3);
            numbers.add(4);
    
        }
        public void printSet(){
            for(Integer i:numbers){
                System.out.println(i);
            }
        }
    }

