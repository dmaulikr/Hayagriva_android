package g.hayagreevaswamy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoGalleryFragment extends Fragment {
    GridView Grid;
    int logos[] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,
            R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8,R.drawable.image9,R.drawable.image10};

    public PhotoGalleryFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v= inflater.inflate(R.layout.fragment_photo_gallery, container, false);
        Grid = (GridView) v.findViewById(R.id.GridView); // init GridView
        Pg_CustomAdapter customAdapter = new Pg_CustomAdapter(getContext(), logos);
        Grid.setAdapter(customAdapter);
        Grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), Pg_GridviewActivity.class);
                intent.putExtra("image",position);//*logos[position]*/,position); // put image data in Intent
                startActivity(intent); // start Intent

            }
        });
        return v;
    }

}
