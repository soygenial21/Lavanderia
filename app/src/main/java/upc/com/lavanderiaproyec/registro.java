package upc.com.lavanderiaproyec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import upc.com.lavanderiaproyec.Objects.Reference;
import upc.com.lavanderiaproyec.Objects.cliente;

public class registro extends AppCompatActivity {
public EditText name;
    public EditText ape;
    public EditText mail;
    public EditText passw;
    public EditText direc;
    public EditText telef;
    public Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        name = (EditText)findViewById(R.id.txtname);
        ape=(EditText)findViewById(R.id.txtape);
        mail=(EditText) findViewById(R.id.txtmail);
        passw=(EditText)findViewById(R.id.txtcont);
        direc=(EditText)findViewById(R.id.txtdire);
        telef=(EditText)findViewById(R.id.txttel);
        save=(Button)findViewById(R.id.btnsave);

FirebaseDatabase mibd  = FirebaseDatabase.getInstance();
        final DatabaseReference miref= mibd.getReference(Reference.mibd);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n= "", a="", cor="", con="", dir="",te="";
                n=name.getText().toString();
                a=ape.getText().toString();
                cor=mail.getText().toString();
                con=passw.getText().toString();
                dir=direc.getText().toString();
                te=telef.getText().toString();

                try{

                    cliente necliente= new cliente(n,a,cor, con,dir,te);
                    miref.child(Reference.mitabla).push().setValue(necliente);
                    Toast.makeText(getApplicationContext(),"Registro Guardado",  Toast.LENGTH_SHORT).show();
                }
                catch (Exception ex)
                {
                    Toast.makeText(getApplicationContext(),"Error "+ ex, Toast.LENGTH_SHORT).show();
                }
            }
        });

save.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        try{
            Intent reg=new Intent(getApplicationContext(),activity_menu.class);
            startActivity(reg);
        }
        catch (Exception ex){


        }
    }
});
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("Nombre"))
                {
                    name.setText("");
                }
            }
        });
        ape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ape.getText().toString().equals("Apellido"))
                {
                    ape.setText("");
                }
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mail.getText().toString().equals("Email"))
                {
                    mail.setText("");
                }
            }
        });
        passw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passw.getText().toString().equals("Contraseña"))
                {
                    passw.setText("");
                }
            }
        });
        direc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(direc.getText().toString().equals("Direccion"))
                {
                    direc.setText("");
                }
            }
        });
        telef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(telef.getText().toString().equals("Telefono"))
                {
                    telef.setText("");
                }
            }
        });
    }

}
