public class Clothing
{
  public String type = new String();
  public String color = new String();
  
  public Clothing()
  {
    this.type = "No type yet";
    this.color = "No color yet";
  }
    Clothing(String atype, String acolor)
   {
      this.settype(atype);
      this.setcolor(acolor);
   }
   public String gettype(String type)
   {
     return this.type;
   }
   public String getcolor(String color)
   {
     return this.color;
   }
   public void settype(String atype)
   {
     if(type.equalsIgnoreCase("Undergarment") || type.equalsIgnoreCase("Socks") || type.equalsIgnoreCase("Stockings") || type.equalsIgnoreCase("Top") || type.equalsIgnoreCase("Bottom") || type.equalsIgnoreCase("Cape"))
          {
     this.type = atype;
   }
        }
   public void setcolor(String acolor)
   {
     if(color.equalsIgnoreCase("Brown") || color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Pink") || color.equalsIgnoreCase("Orange") || color.equalsIgnoreCase("Green") || color.equalsIgnoreCase("Blue") || color.equalsIgnoreCase("Purple") || color.equalsIgnoreCase("Grey"))
        {
     this.color = acolor;
      }
        }
   public String toString()
 {
   return "Type:" +this.type+"Color: " +this.color;
 }
   public String equals(String type, String color)
   {
     if(Clothing01.gettype().equals(Clothing02.gettype()) && (Clothing01.getcolor().equals(Clothing02.getcolor())))
          {
            return ("They are equal");
     }
        }
}

    