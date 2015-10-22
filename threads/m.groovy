import java.util.List;


class TestSleep {
   static void main(String[] args) {          
      println 'Step 1'
      sleep(3000)
      println 'Step 2'
      sleep(3000)
      println 'Step 3'

      List<String> l = Arrays.asList("asda", "aasas", "bbb")
       for (String s : l) {
           println("Input: " + s)
       }
   }
}
