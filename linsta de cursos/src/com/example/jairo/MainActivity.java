package com.example.jairo;

import java.util.ArrayList;
import java.util.List;

import com.example.jairo.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
		
	
	 protected void onStart() {
	        super.onStart();
	        Toast.makeText(this,"Vienvenido", Toast.LENGTH_LONG).show();
	        super.onStart();
	    }
	    @Override
	    protected void onResume() {
	        super.onResume();
	        Toast.makeText( this,"Cargando Archivos",Toast.LENGTH_LONG).show();
	        super.onStart();
	    }

	    @Override
	    protected void onPause() {
	        super.onPause();
	        Toast.makeText( this,"Minimizando",Toast.LENGTH_LONG).show();
	        super.onStart();
	    }

	    @Override
	    protected void onDestroy() {
	        Toast.makeText( this,"Saliendo de la Aplicacion",Toast.LENGTH_LONG).show();
	        super.onDestroy();

	    }

    private ListView listView;
    List<String> listadenombres;
    List<String> listadehoras;
   

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView) findViewById(id.listView1);
        
        //dats para mostrar en mi listas
        listadenombres = new ArrayList<String>();
        listadehoras = new ArrayList<String>();
        
        listadenombres.add("Aplicativos moviles");
        listadehoras.add("8");
        listadenombres.add("Pagina Web");
        listadehoras.add("10");
        listadenombres.add("Programacion");
        listadehoras.add("9");
        listadenombres.add("Administracion de Redes");
        listadehoras.add("4");
        listadenombres.add("Audio y Video");
        listadehoras.add("6");
        
        
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,listadenombres);
        
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> AdapterView, View view, int position,long id) 
			{
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this,"las horas a la semas de "+listadenombres.get(position)+" es de "+listadehoras.get(position)+" horas ", Toast.LENGTH_LONG).show();
			}
        	
		});
    } 
    
}
