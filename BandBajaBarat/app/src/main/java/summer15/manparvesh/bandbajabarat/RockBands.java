package summer15.manparvesh.bandbajabarat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class RockBands extends Activity {

    ListView lv;
    public static int [] prgmImages={R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1,R.drawable.bg1};
    public static String [] prgmNameList={"Band 1","Band 2","Band 3","Band 4","Band 5","Band 6","Band 7","Band 8","Band 9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_bands);

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rock_bands, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
