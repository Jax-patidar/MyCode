package MyCode;

public class SingleTone {
    public static SingleTone singleTone = null;
    private SingleTone() {

    }
    public SingleTone getSingleToneObj()
    {
        if (singleTone != null)
        {
            synchronized(SingleTone.class)
            {
                if (singleTone != null) {
                    singleTone = new SingleTone();
                }

            }
        }
        return singleTone;
    }
    //We can write here any functionality of
}
