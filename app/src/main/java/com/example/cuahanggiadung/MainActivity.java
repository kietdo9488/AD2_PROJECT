package com.example.cuahanggiadung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.example.cuahanggiadung.Adapter.CategoryAdapter;
import com.example.cuahanggiadung.Model.CategoryModel;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerView;
    NavigationView navigationView;
    ListView listViewManHinhChinh;
    DrawerLayout drawerLayout;
    ArrayList<CategoryModel> arrCategoryModels;
    CategoryAdapter categoryAdapter;

    int id = 0;
    String nameCategory = "";
    String imgCategory = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        ActionViewFlipper();
        ActionBar();
    }

    private void ActionViewFlipper()
    {
        ArrayList<String> mangQuangCao = new ArrayList<>();
        mangQuangCao.add("https://cdn.tgdd.vn/2021/11/CookDish/cac-loai-do-gia-dung-hien-dai-cho-can-bep-nha-ban-them-tien-avt-1200x676.jpg");
        mangQuangCao.add("https://giadungsato.com/Uploads/images/giadungsato(2).jpg");
        mangQuangCao.add("https://ominsu.com.vn/wp-content/uploads/2017/09/Anh-NOI-CHAO-.jpg");
        for (int i = 0; i< mangQuangCao.size(); i++)
        {
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangQuangCao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
    }

    private void ActionBar()
    {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }


    private void AnhXa()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbarmanhinhchinh);
        viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        navigationView = (NavigationView) findViewById(R.id.navigationview);
        listViewManHinhChinh = (ListView) findViewById(R.id.listviewmanhinhchinh);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
                arrCategoryModels = new ArrayList<>();
                arrCategoryModels.add(0, new CategoryModel(0, "Home", "https://cdn-icons-png.flaticon.com/512/25/25694.png"));
                arrCategoryModels.add(1, new CategoryModel(1, "Tu lanh", "https://beptukaff.vn/data/news/12357/tu-lanh-side-by-side-dang-multi-door-kaff-kf-bcd446w-1.jpg"));
                arrCategoryModels.add(2, new CategoryModel(2, "May giat", "https://hangdienmaygiare.com/images/products/2023/03/03/large/may-giat-electrolux-ewf1024m3sb-10-kg-inverter_1677819674.jpg"));
                arrCategoryModels.add(3, new CategoryModel(3, "Gia dung", "https://sunhouse.com.vn/pic/product/bo-noi-inox-5-day-sh779-removebg-preview.png"));

        categoryAdapter = new CategoryAdapter(arrCategoryModels, getApplicationContext());
                listViewManHinhChinh.setAdapter(categoryAdapter);
    }
}