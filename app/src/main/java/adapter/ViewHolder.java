package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.herosapi.R;

class ViewHolderv extends RecyclerView.ViewHolder{

    ImageView imgPhoto;
    TextView tvName, tvDesc;
    public ViewHolderv(@NonNull View itemView) {
        super(itemView);
        imgPhoto =itemView.findViewById(R.id.imgPhoto);
        tvName =itemView.findViewById(R.id.tvName);
        tvDesc =itemView.findViewById(R.id.tvDesc);
    }
}
