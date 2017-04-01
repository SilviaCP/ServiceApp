package com.example.usuarioupt.serviceapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment_main
                , container
                , false);

        Button lanzar = (Button)frag.findViewById(R.id.btn_lanzar);
        Button detener = (Button)frag.findViewById(R.id.btn_detenar);

        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startService(new Intent(getActivity().getBaseContext()
                            , ServicioMusica.class));
            }
        });

        detener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().stopService(new Intent(getActivity().getBaseContext()
                            ,ServicioMusica.class));
            }
        });

        return frag;
    }
}
