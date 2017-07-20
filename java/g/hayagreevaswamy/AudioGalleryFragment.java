package g.hayagreevaswamy;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AudioGalleryFragment extends Fragment {
    ListView listView;
    List<String> list;
    ListAdapter adapter;
    MediaPlayer mediaPlayer;


    public AudioGalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_audio_gallery, container, false);
        super.onSaveInstanceState(savedInstanceState);
        getActivity().setTitle("Audio Gallery");
        listView = (ListView) view.findViewById(R.id.listView);
        list = new ArrayList<>();
        Field[] fields = R.raw.class.getFields();
        for (int i = 0; i < fields.length; i++) {
            list.add(fields[i].getName());
        }

        adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){




            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                int resID = getResources().getIdentifier(list.get(i), "raw", getContext().getPackageName());
                mediaPlayer = MediaPlayer.create(getActivity(), resID);
                mediaPlayer.start();
            }

        });
        Button b=(Button)view.findViewById(R.id.audio_b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                } else {
                    mediaPlayer.start();
                }
            }
        });
        Button button=(Button)view.findViewById(R.id.audio_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
            }
        });
        return view;

    }
}

