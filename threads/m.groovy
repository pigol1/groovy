import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class TestSleep {
    
   public static void main(String[] args) {

      def m = [:];
      List<String> l = Arrays.asList("asda", "aasas", "bbb");
       for (String s : l) {
           m[s] = s.length();
           // /println("Input: " + s);
       }

       final Map<String, Integer> sMap = m;
       println(sMap);

       ExecutorService es = Executors.newSingleThreadScheduledExecutor();
       Future<Integer> f = es.schedule(new Callable<Integer>() {
           @Override
           Integer call() throws Exception {
               final int sum = 0;
               for (String  k: sMap.keySet()) {
                   sum += sMap[k];
               }
               println("Running in executor thread");
               return sum;
           }
       }, 3000, TimeUnit.MILLISECONDS);

       println("In the main thread");
       sleep(200);
       println("Awake: " + f.get());
       println("Shutdown!")
       es.shutdown();

       Task t = new Task("pigol", 4);
   }
}
