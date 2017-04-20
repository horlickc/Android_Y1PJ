package tobyjai.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Sub1Activity extends Activity {

    ListView buckysListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        ListView buckysListView = (ListView)findViewById(R.id.buckysListView);

        String[] data = {"Wedding 12/12/2015 Tsuen Wan", "Wedding 20/12/2015 Sha Tin", "Wedding 20/12/2015 Tsum Sha Tsui", "Wedding 13/01/2016 Sha Tin", "Meatball", "Potato"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        buckysListView.setAdapter(adapter);
    }

}
