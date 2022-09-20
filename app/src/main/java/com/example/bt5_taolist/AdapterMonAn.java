package com.example.bt5_taolist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMonAn extends BaseAdapter {

    private Context context;
    private int Layout;
    private List<MonAn> MonAnList;

    public AdapterMonAn(Context context, int layout, List<MonAn> MonAnList) {
        this.context = context;
        Layout = layout;
        this.MonAnList = MonAnList;
    }

    @Override
    public int getCount() {
        return MonAnList.size();//trả về tất cả các đòn điện thoại
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //trả về mỗi dòng trên item

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //view chứa các layout
        view = inflater.inflate(Layout,null);

        //ánh xạ view
        TextView txtTen = (TextView) view.findViewById(R.id.name);
        TextView txtMota = (TextView) view.findViewById(R.id.mota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageHinh);

        //gán giá trị
        MonAn monAn = MonAnList.get(i);

        txtTen.setText(monAn.getTenmon());
        txtMota.setText(monAn.getMota());
        imgHinh.setImageResource(monAn.getHinh());

        return view;
    }


}