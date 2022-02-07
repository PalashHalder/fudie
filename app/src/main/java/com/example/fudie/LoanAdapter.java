package com.example.fudie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LoanAdapter extends RecyclerView.Adapter<LoanAdapter.ViewHolder> {

    List<LoanProducts> loanProducts;

    public LoanAdapter(List<LoanProducts> loanProducts) {
        this.loanProducts = loanProducts;
    }

    @NonNull
    @Override
    public LoanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_design_loan_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LoanAdapter.ViewHolder holder, int position) {

        LoanProducts loanProduct = loanProducts.get(position) ; // need to check

        holder.loanproductTV.setText(loanProduct.getLoanproduct());
        holder.serialTV.setText(loanProduct.getSerial());
        holder.lserviceTV.setText(loanProduct.getLservice());
        holder.imageView.setImageResource(loanProduct.getImage());

    }

    @Override
    public int getItemCount() {
        return loanProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView loanproductTV, serialTV, lserviceTV;

            public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            loanproductTV = itemView.findViewById(R.id.loanproductTV);
            serialTV = itemView.findViewById(R.id.serialTV);
            lserviceTV = itemView.findViewById(R.id.lserviceTV);



        }
    }
}
