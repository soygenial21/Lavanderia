package upc.com.lavanderiaproyec;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import upc.com.lavanderiaproyec.Objects.Reference;
import upc.com.lavanderiaproyec.Objects.cliente;

public class login extends AppCompatActivity {

    public Button entrar;
    public AutoCompleteTextView correo;
    public EditText contraseña;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private ProgressBar barra;
     TextView tv_Registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        entrar=(Button) findViewById(R.id.btnentrar);
        correo=(AutoCompleteTextView)  findViewById(R.id.txtcorreo1);
        contraseña=(EditText)  findViewById(R.id.txtpass1);
        barra=(ProgressBar) findViewById(R.id.barralogin);
        tv_Registrar=(TextView)findViewById(R.id.tv_registrar);

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null) {
                    // if (mAuth.getCurrentUser().isEmailVerified()) {
                    startActivity(new Intent(getApplicationContext(), activity_menu.class));
                    finish();


                }
            }
        };
        tv_Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSignIn();
                startActivity(new Intent(getApplicationContext(), registro.class));

            }
        });




        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startSignIn();

                startActivity(new Intent(getApplicationContext(), activity_menu.class));
            }
        });






    }

    private void startSignIn() {
        String email = correo.getText().toString();
        String pass = contraseña.getText().toString();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {

            Toast.makeText(getApplicationContext(),"Ingrese Correo & Contraseña",Toast.LENGTH_SHORT).show();
        } else{
            barra.setVisibility(View.VISIBLE);
            mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if (!task.isSuccessful()) {
                        barra.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(), "Datos Incorrectos", Toast.LENGTH_SHORT).show();
                    }
                }



            });

        }
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }

}

