package teamprojectgroup3.codesyntaxguide;

/**
 * Created by Jake on 19/03/2015.
 */
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.widget.ExpandableListView;

public class VARIABLES extends ActionBarActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variables);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();


        listDataHeader.add("C#");
        listDataHeader.add("C++");
        listDataHeader.add("Python");
        listDataHeader.add("Java");

        List<String> csharp = new ArrayList<String>();
        csharp.add("Variables are declared type first, then name.\n" +
                "values can be assigned on declaration or afterwards.\n\n" +
                "int x;\n" +
                "x =10\n\n" +
                "Multiple variables can be defined on a single line\n\n" +
                " int x, y, z;\n\n");

        List<String> cplusplus = new ArrayList<String>();
        cplusplus.add("Variables declared same way as C#.\n" +
                "Must be declared at the start of application after headers are declared\n\n" +
                "int x;\n" +
                "x = 10;\n\n");

        List<String> python = new ArrayList<String>();
        python.add("Python uses Names, they are not typed,\n" +
                " although all objects referred to by them are\n\n" +
                "a = 1");

        List<String> java = new ArrayList<String>();
        java.add("Variables are declared the same way as C#\n\n" +
                "int x;\n" +
                "x = 10;\n\n" +
                "Several variables at once\n\n" +
                "int x,y,z;");

        listDataChild.put(listDataHeader.get(0), csharp);
        listDataChild.put(listDataHeader.get(1), cplusplus);
        listDataChild.put(listDataHeader.get(2), python);
        listDataChild.put(listDataHeader.get(3), java);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_operators, menu);
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
