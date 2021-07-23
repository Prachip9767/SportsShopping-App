package com.example.anushmp.decathlonapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ImageView click1;
    private ImageView click2;
    private ImageView c1;
    private ImageView c2;
    private ImageView Box6;
    private View nav;
    private Button mbtn1;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;
    private RecyclerView recyclerView5;
    private ImageView iv;

    private ArrayList<List1Model> list1ModelArrayList= new ArrayList<>();
    private ArrayList<List2Model> list1ModelArrayList1= new ArrayList<>();
    private ArrayList<List3Model> list1ModelArrayList2= new ArrayList<>();
    private ArrayList<List4Model> list1ModelArrayList3= new ArrayList<>();
    private ArrayList<List5Model> list1ModelArrayList4= new ArrayList<>();
    private ArrayList<List6Model> list1ModelArrayList5= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Slideme();
        initView();
        buildStudentList();
        buildStudentList1();
        buildStudentList2();
        buildStudentList3();
        buildStudentList4();
        buildStudentList6();
        setRecyclerView();
        setRecyclerView2();
        setRecyclerView3();
        setRecyclerView4();
        setRecyclerView5();
        setRecyclerView6();
        openProduct();
        openurl();
        nav();
        cart();
    }

    private void cart() {

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(MainActivity2.this, cartActivity.class);
                startActivity(i5);

            }
        });

    }

    private void openurl(){
        click2=findViewById(R.id.boxa);
        click1=findViewById(R.id.box14);
        c1=findViewById(R.id.box15);
        c2=findViewById(R.id.box16);
        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.allforsport.in/event-details/physical-fitness-for-runners-with-patit-mahata-and-puneet-bhattacharya---sportsforall/cd547a5a-e149-11eb-8047-3fccd3bb25c8";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.allforsport.in/event-details/30km-cycling-challenge---sportsforall-sfa/676e3478-e52d-11eb-bb9b-1384bf45fe55";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.allforsport.in/event-details/my-journey-of-cycling-across-the-country-for-20,000km-:-bhagyashree---sportsforall/15399dee-e5cf-11eb-9300-6bb44d08881b";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://blog.decathlon.in/";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
    private void buildStudentList() {

        list1ModelArrayList.add(new List1Model(R.drawable.ss1, "₹599","good shoe","₹899"," 4.5/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss18 , "₹699","men waterproof hiking pants,","₹999"," 4.4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss16, "₹799"," kelenji run 100","₹999"," 4.4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss17 , "₹699"," slim - fitpolyester mens pant,","₹1299"," 4.4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss18 , "₹699","adult badmiminton racket","₹999"," 3.9/5"));list1ModelArrayList.add(new List1Model(R.drawable.ss15 , "₹1599","comfort yoga mat,","₹2000"," 4.5/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss10 , "₹599"," mens cotton GYM pants","₹699"," 4.3/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss9 , "599"," trek 150 rain poncho,","₹999"," 4/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss11 , "₹699","mens cricket striaghtfit pant","₹899"," 4.6/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss23 , "₹999"," mens footballshoes","₹899","4.5/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss21 , "₹1499"  ,"hex dumbell 5Kg","₹2999"," 4.8/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss8 , "₹599","mens tennis t- shirt,","₹999"," 4.6/5"));
        list1ModelArrayList.add(new List1Model(R.drawable.ss20 , "₹599",  " mens rain jacket" ,"₹1299"," 4.4/5"));
    }
    private void buildStudentList1() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList1.add(new List2Model(R.drawable.shoe1, "554", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList2() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList2.add(new List3Model(R.drawable.shoe1, "2323", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList3() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList3.add(new List4Model(R.drawable.shoe1, "2324", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList4() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList4.add(new List5Model(R.drawable.shoe1, "224", "good shoe", "789", "4.5/5"));
        }
    }
    private void buildStudentList6() {
        for(int i=0;i<5;i++) {
            list1ModelArrayList5.add(new List6Model(R.drawable.shoe1, "230", "good shoe", "789", "4.5/5"));
        }
    }

private void Slideme(){
    ArrayList<slide_item> sliderDataArrayList = new ArrayList<>();
    SliderView sliderView = findViewById(R.id.imageSlider);
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/ig1.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid2.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/sli3.png"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slid3.png.jpeg"));
    sliderDataArrayList.add(new slide_item("https://www.linkpicture.com/q/slide4.png.jpeg"));
    SliderAdapter adapter = new SliderAdapter(this, sliderDataArrayList);
    sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
    sliderView.setSliderAdapter(adapter);
    sliderView.setScrollTimeInSec(3);
    sliderView.setAutoCycle(true);
    sliderView.startAutoCycle();
}
    private void initView() {
        recyclerView = findViewById(R.id.recyclerView5);
        recyclerView1=findViewById(R.id.recyclerView2);
        recyclerView2=findViewById(R.id.recyclerView3);
        recyclerView3=findViewById(R.id.recyclerView4);
        recyclerView4=findViewById(R.id.recyclerView6);
        recyclerView5=findViewById(R.id.recyclerView1);
        iv = findViewById(R.id.iv);


    }
    public void setRecyclerView() {
        List1Adapter list1Adapter= new List1Adapter(list1ModelArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(list1Adapter);

    }
    public void setRecyclerView3() {
        List2Adapter list2Adapter= new List2Adapter(list1ModelArrayList1,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager);
        recyclerView1.setAdapter(list2Adapter);

    }
    public void setRecyclerView4() {
        List3Adapter list3Adapter= new List3Adapter(list1ModelArrayList2,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setAdapter(list3Adapter);

    }
    public void setRecyclerView5() {
        List4Adapter list4Adapter= new List4Adapter(list1ModelArrayList3,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(linearLayoutManager);
        recyclerView3.setAdapter(list4Adapter);

    }
    public void setRecyclerView6() {
        List5Adapter list5Adapter= new List5Adapter(list1ModelArrayList4,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(linearLayoutManager);
        recyclerView4.setAdapter(list5Adapter);

    }
    public void setRecyclerView2() {
        List6Adapter list6Adapter= new List6Adapter(list1ModelArrayList5,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity2.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(linearLayoutManager);
        recyclerView5.setAdapter(list6Adapter);

    }
    public void openProduct(){
        Box6=findViewById(R.id.box6);
        Box6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,All_productActivity.class);
                startActivity(intent);
            }
        });
        mbtn1=findViewById(R.id.btn1);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,All_productActivity.class);
                startActivity(intent);
            }
        });

    }
    private void nav(){
        nav=findViewById(R.id.sports);
        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity2.this,SportsPage.class);
                startActivity(intent);
            }
        });


    }
}