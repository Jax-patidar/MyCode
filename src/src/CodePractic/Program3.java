package CodePractic;

import java.util.Date;


interface Colour
{
    String getColour();
}

class Red implements Colour
{
    @Override
    public String getColour() {
        return "Red";
    }
}

class Black implements Colour
{
    @Override
    public String getColour() {
        return "Black";
    }
}


class ColourFactory
{
    Colour getColour(String colourType)
    {
        if(colourType.equals("Red"))
        {
            return new Red();
        }else if (colourType.equals("Black"))
        {
            return new Black();
        }
        return null;
    }
}




public final class Program3 {
    private final String name;
    private final Date dbo;
    public Program3(String name, Date dbo) {
        this.name = name;
        this.dbo = dbo;
    }
    public Date getDbo() {
        Date dboCopy =  new Date(dbo.getTime());

        return dboCopy;
    }

    public String getName() {
        return name;
    }


}
