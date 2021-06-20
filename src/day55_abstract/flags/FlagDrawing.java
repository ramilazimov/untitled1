package day55_abstract.flags;

import java.awt.*;

public  class FlagDrawing  {
     public static void main(String[] args) {

     RussianFlag russianFlag = new RussianFlag();
     russianFlag.draw();

     Ukraine ukraine = new Ukraine();
     ukraine.draw();

     French french = new French();
     french.draw();
    }

}
