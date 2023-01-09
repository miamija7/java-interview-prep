import java.util.ArrayList;

public class RomanToInt {
   public static int convert(String s) {
      char[] inputs = s.toCharArray();
      int[] inputsValues = new int[inputs.length];
      char[] romans = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
      int[] integers = {1, 5, 10, 50, 100, 500, 1000};
      int total = 0;

      for(int i = 0; i < inputs.length; i++){
         for(int j = 0; j < romans.length; j++){
            if(inputs[i] == romans[j]) { inputsValues[i] = integers[j]; }
         }
      }

      for(int i = 0; i < inputsValues.length; i++){
         int lvalue = inputsValues[i];
         int rvalue = (i != inputsValues.length - 1) ? inputsValues[i+1] : 0;
         if(rvalue == 0 || lvalue >= rvalue){
            total += lvalue;
         } else {
            total -= lvalue;
         }
      }
      return total;
   }
}
