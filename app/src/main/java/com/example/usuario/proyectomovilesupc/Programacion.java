package com.example.usuario.proyectomovilesupc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Programacion extends AppCompatActivity {

    private Spinner listclientes;
    private Spinner listsucursales;
    private Spinner listempleados;
    private Spinner listtipovisita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacion);
        setTitle("Programar de Visitas");

        listclientes=(Spinner) findViewById(R.id.spcliente);
        listsucursales=(Spinner) findViewById(R.id.spsucursal);
        listempleados=(Spinner) findViewById(R.id.spempleado);
        listtipovisita=(Spinner) findViewById(R.id.sptvisita);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.list_clientes,android.R.layout.simple_spinner_item);
        listclientes.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter_suc=ArrayAdapter.createFromResource(this,R.array.list_sucursales,android.R.layout.simple_spinner_item);
        listsucursales.setAdapter(adapter_suc);

        ArrayAdapter<CharSequence> adapter_emp=ArrayAdapter.createFromResource(this,R.array.list_empleados,android.R.layout.simple_spinner_item);
        listempleados.setAdapter(adapter_emp);

        ArrayAdapter<CharSequence> adapter_tvis=ArrayAdapter.createFromResource(this,R.array.list_tipovisita,android.R.layout.simple_spinner_item);
        listtipovisita.setAdapter(adapter_tvis);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.create_new:
                Intent launchNewIntent = new Intent(this,Programacion.class);
                startActivityForResult(launchNewIntent, 0);
                break;
            case R.id.atender_visita:
                Intent launchAtenderVisita = new Intent(this,AtenderVisitaActivity.class);
                startActivityForResult(launchAtenderVisita, 0);
                break;

            case R.id.logout:
                Intent launchLogout = new Intent(this,Login.class);
                startActivityForResult(launchLogout, 0);
                break;
            case R.id.trazar_ruta:
                Intent launchTrazarRuta = new Intent(this,DireccionRutaActivity.class);
                startActivityForResult(launchTrazarRuta, 0);
                break;

        }
        return false;
    }
}
