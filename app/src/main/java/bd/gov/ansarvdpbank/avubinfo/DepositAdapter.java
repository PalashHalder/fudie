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

public class DepositAdapter extends RecyclerView.Adapter<DepositViewHolder> {

    Context context;
    List<Deposit> depositList;

    public DepositAdapter(Context context, List<Deposit> depositList) {
        this.context = context;
        this.depositList = depositList;
    }

    public DepositAdapter() {
    }

    @NonNull
    @Override
    public DepositViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_deposit, parent, false);
        return new DepositViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DepositViewHolder holder, int position) {

        Deposit deposit = depositList.get(position);

        holder.depositName.setText(deposit.getProfile_name());
        holder.depositStatus.setText(deposit.getProfile_status());
        Glide.with(context).load(deposit.getProfile_img_url()).into(holder.profileImage);

        //onClickLister is activated on profileName instead of nextArrowImage
        holder.listView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,BangabondhuActivity.class);

                intent.putExtra("img",deposit.getProfile_img_url());
                intent.putExtra("name",deposit.getProfile_name());
                intent.putExtra("status",deposit.getProfile_status());
                intent.putExtra("pdfUrl",deposit.getPdf_url());


                context.startActivity(intent);

                // If you want to show toast when no pdf file is attached then activate the code below:

              //  Toast.makeText(context, "Name is :" + deposit.getProfile_name(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return depositList.size();
    }
}
