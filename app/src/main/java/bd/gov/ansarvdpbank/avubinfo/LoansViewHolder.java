package bd.gov.ansarvdpbank.avubinfo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import de.hdodenhof.circleimageview.CircleImageView;

public class LoansViewHolder extends RecyclerView.ViewHolder {

    CircleImageView productImage;
    TextView productName;
    TextView productStatus;
    //ImageView nextArrowImage;
    View loanView;




    public LoansViewHolder(@NonNull View itemView) {
        super(itemView);

        productImage = itemView.findViewById(R.id.product_img_url);
        productName = itemView.findViewById(R.id.productName);
        productStatus = itemView.findViewById(R.id.productStatus);
        //nextArrowImage = itemView.findViewById(R.id.nextArrowImage);
        loanView = itemView.findViewById(R.id.loanView);


    }
}

