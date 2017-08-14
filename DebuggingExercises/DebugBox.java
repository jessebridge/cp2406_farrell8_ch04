public class DebugBox
{
   private int width;
   private int length;
   private int height;
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public DebugBox(int width2, int length2, int height2)
   {
      width = width2;
      length = length2;
      height = height2;
   }
   public void showData()
   {
      System.out.println("Width: "  + width + "  Length: " +
              length + "  Height: " + height);
   }
   public double getVolume()
   {
      double vol = length * width * height;
      return vol;
   }
}