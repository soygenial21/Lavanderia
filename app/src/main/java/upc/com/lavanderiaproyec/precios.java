package upc.com.lavanderiaproyec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class precios extends AppCompatActivity {
    ListView listaPrecios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precios);
        listaPrecios= (ListView) findViewById(R.id.lv01);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Lavado, android.R.layout.simple_list_item_1);
        listaPrecios.setAdapter(adapter);
    }
}

