package upc.com.lavanderiaproyec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_menu extends AppCompatActivity {
    public Button listaP;
    public Button inicioP;
    public  Button confirmar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listaP = (Button) findViewById(R.id.btnlispre);
        inicioP = (Button) findViewById(R.id.btniniped);
        confirmar=(Button)findViewById(R.id.btnconfi) ;


        listaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent lip = new Intent(getApplicationContext(), precios.class);
                    startActivity(lip);

                } catch (Exception ex) {

                }
            }
        });
        inicioP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent inp=new Intent(getApplicationContext(),pedido.class);
                    startActivity(inp);
                }
                catch (Exception ex){

                }
            }
        });
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent confi=new Intent(getApplicationContext(),ubicacion.class);
                    startActivity(confi);
                }
                catch (Exception ex){

                }
            }
        });



    }
}

