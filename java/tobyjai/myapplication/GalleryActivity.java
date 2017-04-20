package tobyjai.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

import java.util.ArrayList;

import static tobyjai.myapplication.R.styleable.View;

public class GalleryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        setContentView(R.layout.activity_gallery);

        TextView tx = (TextView)findViewById(R.id.headingWedding);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/SCRIPTIN.ttf");

        tx.setTypeface(custom_font);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.weddinggallery);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<CreateList> createLists = prepareData();
        MyAdapter adapter = new MyAdapter(getApplicationContext(), createLists);
        recyclerView.setAdapter(adapter);


    }

    private ArrayList<CreateList> prepareData(){

        ArrayList<CreateList> theimage = new ArrayList<>();
        for(int i = 0; i< image_titles.length; i++){
            CreateList createList = new CreateList();
            createList.setImage_title(image_titles[i]);
            createList.setImage_ID(image_ids[i]);
            theimage.add(createList);
        }
        return theimage;
    }


    private final String image_titles[] = {
            "Img1",
            /*"Img21",*/
            "Img3",
            "Img4",
            /*"Img51",*/
            "Img6",
            "Img7",
            "Img8",
            "Img9",
            "Img10",
    };
/*size will make the Img word cant show*/
    public final Integer image_ids[] = new Integer[]{
        R.drawable.img1,
            /*R.drawable.fourseasonshotelwedding011,*/
        R.drawable.img1,
        R.drawable.img4,
            /*R.drawable.img51,*/
        R.drawable.img6,
        R.drawable.img2,
        R.drawable.img8,
        R.drawable.img4,
        R.drawable.img10,
};



}

