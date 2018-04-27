package Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sachd.courses.R;

import java.util.ArrayList;
import java.util.List;

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.SimpleViewHolder> {

    List<Integer> dataSource;

    public SimpleRecyclerAdapter() {
        //this.dataSource = dataSource;
        dataSource= new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            dataSource.add(i);
        }
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_main,parent, false);

        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {
        if(position == 0) {
            holder.textView.setText("Bachelor of Technology (B.Tech)");

            }
            else if(position == 1)
        {
            holder.textView.setText("Bachelor of LAWs (LLB)");
        }

        else if(position == 2)
        {
            holder.textView.setText("Bachelor of Business Administration (BBA) ");
        }

        else if(position == 3)
        {
            holder.textView.setText("Bachelor of Computer Applications (BCA)");
        }

        else if(position == 4)
        {
            holder.textView.setText("Bachelor of Education (B.Ed)");
        }
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textView;
        public SimpleViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.textview1);
        }
    }

}
