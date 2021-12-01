public class DRoot {
  public static int digital_root(int n) {
    while(n>9){
      int temp=n;
      int sum=0;
      while(temp>=0){
        sum=sum+(temp%10);
        temp=temp/10;
        }
      n=sum;
    }
  return n;
  }
}