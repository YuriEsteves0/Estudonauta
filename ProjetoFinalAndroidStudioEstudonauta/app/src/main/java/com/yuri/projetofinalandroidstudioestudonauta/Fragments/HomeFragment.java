package com.yuri.projetofinalandroidstudioestudonauta.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.yuri.projetofinalandroidstudioestudonauta.Helpers.FirebaseHelper;
import com.yuri.projetofinalandroidstudioestudonauta.R;
import com.yuri.projetofinalandroidstudioestudonauta.adapter.FestaAdapter;
import com.yuri.projetofinalandroidstudioestudonauta.model.FestaModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private DatabaseReference reference = FirebaseHelper.getReference();
    private List<FestaModel> festaModelList = new ArrayList<>();
    private RecyclerView RV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        FestaModel festaModel = new FestaModel();
        festaModel.setNomeFesta("Joãozinho");
        festaModel.setRuaFesta("Coronel França leite");
        festaModel.setDataFesta("12-08-2024");
        festaModel.setCapacidade(13);
        festaModel.setClassificacao(16);
        festaModel.setPreco(12.50);

        FestaModel festaModel1 = new FestaModel("Pedrinho", "Machado de Assis", "15-03-2024", 29, 18, 15.00);

        festaModelList.add(festaModel1);
        festaModelList.add(festaModel);

        pegarViewsPeloId(view);
        configAdapter();

        return view;
    }

    public void pegarViewsPeloId(View view  ){
        RV = view.findViewById(R.id.RV);
    }

    public void configAdapter(){
        FestaAdapter adapter = new FestaAdapter(getContext(), festaModelList);

        RV.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        RV.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}