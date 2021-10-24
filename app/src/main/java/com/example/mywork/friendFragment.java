package com.example.mywork;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Fragment;
public class friendFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<Map<String,Object>> items;
    private Context context;
    private ada ada;
    public friendFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.friend, container, false);
        recyclerView=view.findViewById(R.id.recycle1);
        context=this.getActivity();
        String[] products={"小米Note","华为荣耀7","魅族MX5","锤子T1"};
        String[] prices={"1999","1999","1999","2480"};
        String[] configurations={"高通骁龙 801，3GB RAM，16GB ROM","麒麟 935，3GB RAM，16GB ROM",
                "联发科（MTK)Helio X10 Turbo，3GB RAM，32GB ROM","高通骁龙 801，2GB RAM，32GB ROM"};
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for(int i=0;i<products.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put("products", products[i]);
            item.put("prices", prices[i]);
            item.put("configurations", configurations[i]);
            item.put("png",R.drawable.faxian);
            items.add(item);
        }
        ada=new ada(items,context);
        LinearLayoutManager layoutManager=new LinearLayoutManager(context);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(ada);
        return view;
    }
}