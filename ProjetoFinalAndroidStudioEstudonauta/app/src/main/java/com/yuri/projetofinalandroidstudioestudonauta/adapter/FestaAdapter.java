package com.yuri.projetofinalandroidstudioestudonauta.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yuri.projetofinalandroidstudioestudonauta.R;
import com.yuri.projetofinalandroidstudioestudonauta.model.FestaModel;

import java.util.List;

public class FestaAdapter extends RecyclerView.Adapter<FestaAdapter.MyViewHolder> {

    private Context context;
    private List<FestaModel> festaModelList;

    public FestaAdapter(Context context, List<FestaModel> festaModelList) {
        this.festaModelList = festaModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.festas_rv, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        FestaModel festaModel = festaModelList.get(position);
        holder.nomeFesta.setText("Festa do " + festaModel.getNomeFesta());
        holder.dataFesta.setText(festaModel.getDataFesta());
        holder.ruaFesta.setText(festaModel.getRuaFesta());
    }

    @Override
    public int getItemCount() {
        return festaModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView nomeFesta, ruaFesta, dataFesta;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeFesta = itemView.findViewById(R.id.nomeFesta);
            ruaFesta = itemView.findViewById(R.id.ruaFesta);
            dataFesta = itemView.findViewById(R.id.dataFesta);
        }
    }
}
