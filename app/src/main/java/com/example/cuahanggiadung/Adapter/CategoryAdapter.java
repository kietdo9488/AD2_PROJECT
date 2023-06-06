package com.example.cuahanggiadung.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cuahanggiadung.Model.CategoryModel;
import com.example.cuahanggiadung.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Objects;

public class CategoryAdapter extends BaseAdapter {

    ArrayList<CategoryModel> arrCategoryModels;
    Context context;
    @Override
    public int getCount() {
        return arrCategoryModels.size();
    }

    @Override
    public Object getItem(int i) {
        return arrCategoryModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public class ViewHolder
    {
        TextView txtLoaiSanPham;
        ImageView imgLoaiSanPham;
    }

    public CategoryAdapter(ArrayList<CategoryModel> arrCategoryModels, Context context) {
        this.arrCategoryModels = arrCategoryModels;
        this.context = context;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (view == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.dong_listview_loaisp, null);
            viewHolder.txtLoaiSanPham = (TextView) view.findViewById(R.id.textViewLoaiSp);
            viewHolder.imgLoaiSanPham = (ImageView) view.findViewById(R.id.imageViewLoaiSp);
            view.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) view.getTag();

        }
        CategoryModel categoryModel = (CategoryModel) getItem(i);
        viewHolder.txtLoaiSanPham.setText(categoryModel.getCategory_name());
        Picasso.with(context).load(categoryModel.getCategory_image())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(viewHolder.imgLoaiSanPham);
        return view;
    }
}
