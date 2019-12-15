package com.example.justtip;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
/**
 * A simple {@link Fragment} subclass.
 */

public class HomeFragment extends Fragment {
    private RelativeLayout menu1;
    private RelativeLayout menu2;
    private RelativeLayout menu3;
    private RelativeLayout menu4;
    private RelativeLayout menu5;
    private RelativeLayout menu6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

                menu1 = (RelativeLayout) rootView.findViewById(R.id.menu1);
                menu2 = (RelativeLayout) rootView.findViewById(R.id.menu2);
                menu3 = (RelativeLayout) rootView.findViewById(R.id.menu3);
                menu4 = (RelativeLayout) rootView.findViewById(R.id.menu4);
                menu5 = (RelativeLayout) rootView.findViewById(R.id.menu5);
                menu6 = (RelativeLayout) rootView.findViewById(R.id.menu6);

                menu1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Jasa Titip Barang Ready", Toast.LENGTH_SHORT).show();

                        Intent goPindah = new Intent(getActivity(), JustTipBarang.class);
                        startActivity(goPindah);
                    }
                });
                menu2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Jasa Titip Kirim Ready", Toast.LENGTH_SHORT).show();

                        Intent goPindah = new Intent(getActivity(), MapsActivity.class);
                        startActivity(goPindah);
                    }
                });
                menu3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Chat Ready", Toast.LENGTH_SHORT).show();

                        Intent goPindah = new Intent(getActivity(), Chatting.class);
                        startActivity(goPindah);
                    }
                });
                menu4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Jasa Titip Belanja Ready", Toast.LENGTH_SHORT).show();

                        Intent goPindah = new Intent(getActivity(), JustTipBelanja.class);
                        startActivity(goPindah);
                    }
                });
                menu5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Notifikasi Ready", Toast.LENGTH_SHORT).show();

                        Intent goPindah = new Intent(getActivity(), Notifikasi.class);
                        startActivity(goPindah);
                    }
                });
                menu6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getActivity(), "Lainnya Ready", Toast.LENGTH_SHORT).show();

                        Intent goPindah = new Intent(getActivity(), Lainnya.class);
                        startActivity(goPindah);
                    }
                });

                return rootView;
            }
        }






