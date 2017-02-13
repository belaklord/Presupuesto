package com.example.pelu.presupuesto;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Spinner;
        import android.widget.Toast;
        import android.widget.AdapterView.OnItemSelectedListener;
        import java.util.ArrayList;
        import java.util.List;

        import static com.example.pelu.presupuesto.R.layout.mantenimiento;


public class MainActivity extends AppCompatActivity  implements OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);

        // Spinner click listener
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Páginas Web");
        categories.add("ERP(odoo)");
        categories.add("Mantenimiento web");
        categories.add("Mantenimiento(tarifas)");
        categories.add("Social Media");




        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


    }
    @Override

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        Intent intent = new Intent();
        // Handle item selection

        if(item == "ERP(odoo)"){
            intent.setClass(MainActivity.this, Mantenimiento.class);
            startActivity(intent);
            finish();

        }


        // Showing selected spinner item
        /*
        POOPUP DE LA CATEGORIA SELECCIONADA

         Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
         */



    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
