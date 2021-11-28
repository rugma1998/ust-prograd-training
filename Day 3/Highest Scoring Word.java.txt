public class Kata {

  public static String high(String s) {
    String alphabet="abcdefghijklmnopqrstuvwxyz";
    int highscore=0;
    int index=0;
    String[] words=s.split(" ");
    for(int i=0;i<words.length;i++)
      {
      int score=0;
      for(int j=0;j<words[i].length();j++)
        {
        score+=1+alphabet.indexOf(words[i].charAt(j));
      }
      if(score>highscore)
        {
        highscore=score;
        index=i;
      }
    }
    return words[index];
  }

}