package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemBinding;

import java.util.ArrayList;

public class Prodacut_Adaptre extends  RecyclerView.Adapter<Prodacut_Adaptre.Prdetr_ViewHoler>{
    ArrayList <Prdetr> prdetrs =new ArrayList<>();

    public Prodacut_Adaptre(ArrayList<Prdetr> prdetrs) {
        this.prdetrs = prdetrs;
    }

    @NonNull
    @Override
    public Prdetr_ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding=ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new Prdetr_ViewHoler(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Prdetr_ViewHoler holder, int position) {
    holder.tv_price.setText((int) prdetrs.get(position).getPrict());
    holder.tv_catgldjbn.setText(prdetrs.get(position).getCatcgort());
    holder.tv_name.setText(prdetrs.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return prdetrs.size();
    }

    class Prdetr_ViewHoler extends RecyclerView .ViewHolder {
TextView tv_name,tv_catgldjbn,tv_price;
        public Prdetr_ViewHoler(ItemBinding binding ) {
            super(binding.getRoot());
            tv_name=binding.Name;
            tv_catgldjbn=binding.catcgort;
            tv_price=binding.Prict;
        }
    }
}
