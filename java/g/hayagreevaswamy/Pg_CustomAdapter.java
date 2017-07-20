package g.hayagreevaswamy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class Pg_CustomAdapter extends BaseAdapter {
     Context Context;
    int logos[];
    LayoutInflater inflter;

    public Pg_CustomAdapter(Context applicationContext, int[] logos) {
        this.Context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(applicationContext));
    }

    private List<ImageView> images;

    public Pg_CustomAdapter(List<ImageView> images) {
        this.images = images;
    }
    @Override
    public int getCount() {
        return logos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = inflter.inflate(R.layout.pg_gridview, null); // inflate the layout
        ImageView icon = (ImageView) v.findViewById(R.id.icon); // get the reference of ImageView
        icon.setImageResource(logos[i]); // set logo images
        return v;

    }
}





