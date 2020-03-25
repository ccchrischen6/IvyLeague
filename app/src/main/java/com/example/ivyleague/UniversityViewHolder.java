package com.example.ivyleague;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class UniversityViewHolder extends RecyclerView.ViewHolder {
    private CardView cardView;
    private TextView nameView;
    private TextView infoView;
    private ImageView iconView;
    private Context context;

    public UniversityViewHolder(View itemView, final Context context){
        super(itemView);
        this.context = context;
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        nameView = (TextView) itemView.findViewById(R.id.name);
        infoView = (TextView) itemView.findViewById(R.id.info);
        iconView = (ImageView) itemView.findViewById(R.id.icon);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, nameView.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public TextView getNameView() {
        return nameView;
    }

    public TextView getInfoView() {
        return infoView;
    }

    public ImageView getIconView() {
        return iconView;
    }
}
