package bd.gov.ansarvdpbank.avubinfo;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



import de.hdodenhof.circleimageview.CircleImageView;

public class DepositViewHolder extends RecyclerView.ViewHolder {

    public View listView;
    CircleImageView profileImage;
    TextView depositName;
    TextView depositStatus;
    //TextView profileName;  // Navigation is activated on profileName instead of nextArrowImage
    //ImageView nextArrowImage;



    public DepositViewHolder(@NonNull View itemView) {
        super(itemView);

        profileImage =itemView.findViewById(R.id.profile_image);
        depositName =itemView.findViewById(R.id.profileName);
        depositStatus =itemView.findViewById(R.id.profileStatus);
        //nextArrowImage =itemView.findViewById(R.id.nextArrowImage);
        //profileName = itemView.findViewById(R.id.profileName);
        listView = itemView.findViewById(R.id.listView);

    }
}
