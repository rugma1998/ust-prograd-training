public class ShadesOfGrey {
  static String[] shadesOfGrey(int num) {
    if(num <= 0) num = 0;
    if(num > 254) num = 254;
    String[] output = new String[num];
    for(int i=0; i < num; i++){
      output[i] = String.format("#%1$02x%1$02x%1$02x", i + 1 );
    }
    return output;
  }
}