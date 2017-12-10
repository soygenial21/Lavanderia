package upc.com.lavanderiaproyec;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

import upc.com.lavanderiaproyec.Objects.RVAdapter;
import upc.com.lavanderiaproyec.Objects.Reserva;
import upc.com.lavanderiaproyec.Objects.cliente;

public class factura extends AppCompatActivity {
    private DatabaseReference mDatabase;
    List<Reserva> listaReserva1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);



        mDatabase = FirebaseDatabase.getInstance().getReference();


    }


    private void writeNewUser(String id, String nombre, String apellido, String direccion, String telefono){

        cliente ce = new cliente(nombre, apellido, direccion, telefono);

        mDatabase.child("registro").child(id).setValue(ce);
        
    }

} //FIN DE CLASE

