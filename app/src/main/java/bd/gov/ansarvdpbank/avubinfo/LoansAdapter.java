package bd.gov.ansarvdpbank.avubinfo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.util.List;

public class LoansAdapter extends RecyclerView.Adapter<LoansViewHolder> {

    Context context;
    List<Loans> loansList;

    public LoansAdapter(Context context, List<Loans> loansList) {
        this.context = context;
        this.loansList = loansList;
    }

    public LoansAdapter() {
    }

    @NonNull
    @Override
    public LoansViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_loans, parent,false);

        return new LoansViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LoansViewHolder holder, int position) {

        Loans loans = loansList.get(position);

        holder.productName.setText(loans.getProduct_name());
        holder.productStatus.setText(loans.getProduct_status());
        Glide.with(context).load(loans.getProduct_img_url()).into(holder.productImage);
        holder.nextArrowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, LoanDetailsActivity.class);

                intent.putExtra("img", loans.getProduct_img_url());
                intent.putExtra("name", loans.getProduct_name());
                intent.putExtra("status", loans.getProduct_status());
                intent.putExtra("pdf", loans.getProduct_pdf_url());

                context.startActivity(intent);


                Toast.makeText(context, "Name is" + loans.getProduct_name(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return loansList.size();
    }
}

