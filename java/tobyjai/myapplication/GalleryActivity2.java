package tobyjai.myapplication;

/*import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;




public class GalleryActivity2 extends AppCompatActivity {

    Gallery GL1;
    ImageView IMG1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery2);

        IMG1 = (ImageView)findViewById(R.id.img1);
        GL1 = (Gallery)findViewById(R.id.gl01);

        MyAdapter adapter = new MyAdapter(this);
        GL1.setAdapter(adapter);

        GL1.setOnItemSelectedListener(new Gallery.OnItemSelectedListener(){

            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3){

                IMG1.setImageResource(imageIds[position % imageIds.length]);
            }

            public void onNothingSelected(AdapterView<?> arg0){

            }});

        }

        class MyAdapter extends BaseAdapter{
            AppCompatActivity A;
            public MyAdapter(GalleryActivity2 galleryActivity2){
                A = galleryActivity2;
            }

            public int getCount(){
                return Integer.MAX_VALUE;
            }

            public Object getItem(int position){
                return null;
            }

            public long getItemId(int position){
                return 0;
            }

            public View getView(int position, View convertView, ViewGroup parent){
                ImageView iv = new ImageView(A);
                iv.setImageResource(imageId[position % imageIds.length]);
                iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                iv.setLayoutParams(new Gallery.LayoutParams(120.80));
                return iv;
            }
        }
}*/

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
public class GalleryActivity2 extends Activity {
    // 1.宣告物件
    Button B01, B02;
    ImageView imgPhoto;
    // 將所有的圖片儲存至陣列中
    int[] imgId = { R.drawable.img1, R.drawable.img2, R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img6};
    int p = 0; // 圖片的索引(第幾張圖片)
    int count = imgId.length; // 共有多少張圖片
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2.連結元件
        B01 = (Button) findViewById(R.id.b01);
        B02 = (Button) findViewById(R.id.b02);
        imgPhoto = (ImageView) findViewById(R.id.imgPhoto);
        // 3.建立事件
        B01.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                p--;
                if (p < 0)
                    p = imgId.length - 1;
                imgPhoto.setImageResource(imgId[p]);
                Toast.makeText(getApplicationContext(),"Number" + (p + 1) + "/" + count,Toast.LENGTH_SHORT).show();
            }
        });
        B02.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                p++;
                if (p == count) {
                    p = 0;
                }
                imgPhoto.setImageResource(imgId[p]);
                Toast.makeText(getApplicationContext(),"Number" + (p + 1) + "/" + count,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
