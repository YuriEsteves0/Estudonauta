package com.yuri.projetofinalandroidstudioestudonauta.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.yuri.projetofinalandroidstudioestudonauta.R;

public class PerfilFragment extends Fragment {

    private TextView sairTxt;
    private FirebaseAuth auth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        dados();
        botoes();

        return v;
    }

    public void botoes(){
        sairTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
                auth.signOut();
            }
        });
    }

    public void dados(){
        sairTxt = getActivity().findViewById(R.id.sairTxt);
    }

}