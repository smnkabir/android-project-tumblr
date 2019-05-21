 package com.example.tumblr;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.tumblr.Adapter.Post_list_adapter;
import com.example.tumblr.Fragment.ContactFragment;
import com.example.tumblr.Fragment.HomeFragment;
import com.example.tumblr.Fragment.MessageFragment;
import com.example.tumblr.Fragment.SearchFragment;
import com.example.tumblr.data.model.Post;
import com.example.tumblr.data.model.User;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<Post> postList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSampleData();
        initRecyclerView();

        ImageView homeIcon = findViewById(R.id.homeIcon);
        ImageView searchIcon = findViewById(R.id.searchIcon);
        ImageView messageIcon = findViewById(R.id.messageIcon);
        ImageView contactIcon = findViewById(R.id.contactIcon);

        homeIcon.setOnClickListener(this);
        searchIcon.setOnClickListener(this);
        messageIcon.setOnClickListener(this);
        contactIcon.setOnClickListener(this);
    }

     private void createSampleData() {
        Post p = new Post(new User("mtv",R.drawable.ic_p1)
                ,"#macaroni #have a good week end"
                ,"It's Friday"
                ,R.drawable.ic_image1
                ,"12 notes"
        );
        postList.add(p);
         p = new Post(new User("laina",R.drawable.ic_p2)
                 ,"#caption #have a bad week end"
                 ,"Crishmash"
                 ,R.drawable.ic_image2
                 ,"100 notes"
         );
         postList.add(p);
         p = new Post(new User("mtv",R.drawable.ic_p1)
                 ,"#macaroni #have a good week end"
                 ,"It's Friday"
                 ,R.drawable.ic_image1
                 ,"12 notes"
         );
         postList.add(p);
         p = new Post(new User("laina",R.drawable.ic_p2)
                 ,"#caption #have a bad week end"
                 ,"Crishmash"
                 ,R.drawable.ic_image2
                 ,"100 notes"
         );
         postList.add(p);
         p = new Post(new User("mtv",R.drawable.ic_p1)
                 ,"#macaroni #have a good week end"
                 ,"It's Friday"
                 ,R.drawable.ic_image1
                 ,"12 notes"
         );
         postList.add(p);
         p = new Post(new User("laina",R.drawable.ic_p2)
                 ,"#caption #have a bad week end"
                 ,"Crishmash"
                 ,R.drawable.ic_image2
                 ,"100 notes"
         );
         postList.add(p);
         p = new Post(new User("mtv",R.drawable.ic_p1)
                 ,"#macaroni #have a good week end"
                 ,"It's Friday"
                 ,R.drawable.ic_image1
                 ,"12 notes"
         );
         postList.add(p);
         p = new Post(new User("laina",R.drawable.ic_p2)
                 ,"#caption #have a bad week end"
                 ,"Crishmash"
                 ,R.drawable.ic_image2
                 ,"100 notes"
         );
         postList.add(p);
         p = new Post(new User("mtv",R.drawable.ic_p1)
                 ,"#macaroni #have a good week end"
                 ,"It's Friday"
                 ,R.drawable.ic_image1
                 ,"12 notes"
         );
         postList.add(p);
         p = new Post(new User("laina",R.drawable.ic_p2)
                 ,"#caption #have a bad week end"
                 ,"Crishmash"
                 ,R.drawable.ic_image2
                 ,"100 notes"
         );
         postList.add(p);
         p = new Post(new User("mtv",R.drawable.ic_p1)
                 ,"#macaroni #have a good week end"
                 ,"It's Friday"
                 ,R.drawable.ic_image1
                 ,"12 notes"
         );
         postList.add(p);
         p = new Post(new User("laina",R.drawable.ic_p2)
                 ,"#caption #have a bad week end"
                 ,"Crishmash"
                 ,R.drawable.ic_image2
                 ,"100 notes"
         );
         postList.add(p);



     }

     private void initRecyclerView() {
         recyclerView = findViewById(R.id.recycleView_post);
         recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
         Post_list_adapter post_list_adapter = new Post_list_adapter(this,postList);
         recyclerView.setAdapter(post_list_adapter);
     }

     @Override
     public void onClick(View v) {
        switch (v.getId()){
            case R.id.homeIcon:
                getMyFragment(new HomeFragment());
                break;
            case R.id.searchIcon:
                getMyFragment(new SearchFragment());
                break;
            case R.id.messageIcon:
                getMyFragment(new MessageFragment());
                break;
            case R.id.contactIcon:
                getMyFragment(new ContactFragment());
                break;
        }
     }

     void getMyFragment(Fragment f){
         FragmentManager fragmentManager = getFragmentManager();
         FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
         fragmentTransaction.replace(R.id.fragmentId,f);
         fragmentTransaction.commit();

     }
 }
