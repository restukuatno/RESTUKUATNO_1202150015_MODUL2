package com.example.android.restukuatno_1202150015_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by ASUS on 17/02/2018.
 * https://medium.com/@dimas_vm/tutorial-android-recyclerview-dan-cardview-9a62aaa6cc0c
 */

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.MenuViewHolder>{

    class MenuViewHolder extends RecyclerView.ViewHolder{
        private TextView NamaA,HargaA,IDa;
        private ImageView GambarA;

        public MenuViewHolder(View itemView) {
            super(itemView);
            IDa = (TextView)itemView.findViewById(R.id.IDmenu);
            NamaA = (TextView)itemView.findViewById(R.id.Namamenu);
            HargaA = (TextView)itemView.findViewById(R.id.Hargamenu);
            GambarA = (ImageView)itemView.findViewById(R.id.Gambarmenu);
        }
    }

    private ArrayList<MenuModel> dataList;

    public MenuListAdapter(ArrayList<MenuModel> list) {
        this.dataList = list;
        Log.d("Jumlah Menu","Size: "+getItemCount());
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_menu_list_adapter, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MenuViewHolder holder, final int position) {
        holder.IDa.setText(""+position);
        holder.NamaA.setText(dataList.get(position).getNama());
        holder.HargaA.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(dataList.get(position).getHarga()));
        holder.GambarA.setImageResource(dataList.get(position).getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String idx = holder.IDa.getText().toString();
                Log.d("ItemMenuCLICKED","ID:"+idx);
                Toast.makeText(v.getContext(), "Memilih Menu '"+dataList.get(Integer.parseInt(idx)).getNama()+"'", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext().getApplicationContext(), DetailMenu.class);
                i.putExtra("MenuID",""+idx);
                v.getContext().startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

}
