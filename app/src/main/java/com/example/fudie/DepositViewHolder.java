package com.example.fudie;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DepositViewHolder extends RecyclerView.ViewHolder {

    CircleImageView profileImage;
    TextView depositName;
    TextView depositStatus;
    ImageView nextArrowImage;


    public DepositViewHolder(@NonNull View itemView) {
        super(itemView);

        profileImage =itemView.findViewById(R.id.profile_image);
        depositName =itemView.findViewById(R.id.profileName);
        depositStatus =itemView.findViewById(R.id.profileStatus);
        nextArrowImage =itemView.findViewById(R.id.nextArrowImage);


    }
}
