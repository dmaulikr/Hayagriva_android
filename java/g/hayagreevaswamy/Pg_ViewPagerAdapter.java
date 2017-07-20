package g.hayagreevaswamy;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Pg_ViewPagerAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    int[] flag;
    int p;
    LayoutInflater inflater;

    public Pg_ViewPagerAdapter(Context context,
                               int[] p, int i) {
        this.context = context;
        this.flag = p;
        this.p=i;
    }

    @Override
    public int getCount() {
        return flag.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imgflag;
        //position=p;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.pg_viewpager_item, container,
                false);
        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        imgflag.setImageResource(flag[position]);
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }
}
