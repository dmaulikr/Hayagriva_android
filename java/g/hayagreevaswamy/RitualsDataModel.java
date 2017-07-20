package g.hayagreevaswamy;


public class RitualsDataModel {


    String name;
    String time;

    int id_;
    int image;

    public RitualsDataModel(String name, String time, int id_, int image) {
        this.name = name;
        this.time = time;
        this.id_ = id_;
        this.image=image;
    }


    public String getName() {
        return name;
    }


    public String getTime() {
        return time;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }  }
