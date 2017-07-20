package g.hayagreevaswamy;

/**
 * Created by Hewlett packard on 05-06-2017.
 */

public class NBdatamodel
{

    int images;
    int places;


    public NBdatamodel(int place, int image)
    {
        this.images=image;
        this.places=place;
    }

    public int getName() {
        return places;
    }

    public int getImage() {
        return images;
    }
}
