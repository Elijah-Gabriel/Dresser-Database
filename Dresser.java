public class Dresser()
{
  private Clothing[][] clothes;
  public static final int DEFAULT_DRAWERS = 5;
  public static final int DEFAULT_SPACE =10;
  int undergarments = 0;
  int socks = 0;
  int tops = 0;
  int bottoms = 0;
  int capes = 0;
  
  public Dresser()
{
    clothes = new clothing[DEFAULT_DRAWERS][DEFAULT_SIZE];
}
public void addClothes(Clothing aClothes)
{
  if(aClothes==null)
  {
    return;
  }
  String type = aClothes.getType()
    if(type.equalsIgnoreCase("undergarments")
      {
    if(undergarments<11)
      {
      clothes[0][undergarments] = aClothes;
      undergarments++;
       }
  }
       if(type.equalsIgnoreCase("socks"||type.equalsIgnoreCase("stocking"))
            {
         if(socks<11)
         {
           clothes[0][socks] = aClothes;
           socks++;
         }
       }
     if(type.equalsIgnoreCase("top"))
         {
       if(tops<11)
         {
           clothes[0][tops] = aClothes;
           tops++
         }
  }
    if(type.equalsIgnoreCase("bottoms")
         {
    if(bottoms<11)
     {
      clothes[0][bottoms] = aClothes;
      bottoms++;
      }
  }
    if(type.equalsIgnoreCase("cape")
    {
    if(cape<11)
    {
      clothes[0][capes] = aClothes;
     capes++;
    }
  }