package com.example.tasklistview.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.tasklistview.MainActivity;
import com.example.tasklistview.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HewanFagment extends Fragment  {

    String[] NamaHewan = {"ANJING", "BADAK", "HARIMAU", "SINGA"};
    int[] ImageHewan = {R.drawable.anjing, R.drawable.badak, R.drawable.harimau, R.drawable.singa};

    String IMAGE = "ImageHewan";
    String NAMA = "NamaHewan";

    ListView lvContact;

    FragmentManager fm;


    public HewanFagment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hewan_fagment, container, false);
        lvContact = v.findViewById(R.id.lv_contact);

        fm = getActivity().getSupportFragmentManager();
        List<HashMap<String, String>> listContact = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < 4; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put(IMAGE, Integer.toString(ImageHewan[i]));
            hm.put(NAMA, NamaHewan[i]);

            listContact.add(hm);
        }


        String[] from = {IMAGE, NAMA};
        int[] to = {R.id.img_gambar, R.id.tv_text};
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), listContact, R.layout.list_hewan, from, to);
        lvContact.setAdapter(simpleAdapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(getActivity(), "Ini adalah ANJING", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getActivity(), "ini Adalah BADAK", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getActivity(), "Ini Adalah HARIMAU", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getActivity(), "ini ADalah SINGA", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        return v;
    }

}

