public class XO {
  public static boolean getXO (String str) {
    int l = str.length();
    char ch[] = new char[l];
    char a ='x';
    char b = 'o';
    for(int i = 0;i < l;i++)
    {
      ch[i] = str.charAt(i);
    }
      int count1 =0;
    int count2 = 0;
    for(int i = 0;i < l;i++)
    {
      if(ch[i] == a)
        count1++;
      else if(ch[i] == b)
        count2++;
    }
    if(count1 == count2)
      return true;
    else
      return false;
    
  }
}
