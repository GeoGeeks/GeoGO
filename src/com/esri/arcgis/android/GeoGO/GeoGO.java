package com.esri.arcgis.android.GeoGO;



import com.esri.arcgis.android.ruteo.SignInActivity;
import com.esri.arcgis.android.samples.routing.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class GeoGO extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 //ActionBar actionBar = getActionBar();
	     //actionBar.setDisplayOptions(R.drawable.banner);
		getActionBar().setIcon(
	    		   new ColorDrawable(getResources().getColor(android.R.color.transparent)));
		 ActionBar actionBar = getActionBar();
		 actionBar.hide();
         //actionBar.setBackgroundDrawable(new ColorDrawable(Color.rgb(,82,142)));
		 setContentView(R.layout.activity_pantalla_inicio);
		 Thread timer = new Thread(){
	            //El nuevo Thread exige el metodo run
	            public void run(){
	                try{
	                    sleep(2000);
	                }catch(InterruptedException e){
	                    //Si no puedo ejecutar el sleep muestro el error
	                    e.printStackTrace();
	                }finally{
	/*Intent cambio =new Intent(this, PantallaInicial.class);
	                    	startActivity(cambio);  */
	                	
	                Intent intent = new Intent();  
	                intent.setClass(GeoGO.this, SignInActivity.class);//(this, PantallaInicial.class);
	                startActivity(intent);
	                finish();
	            
	                	
	                }                
	            }
	        };
	        //ejecuto el thread
	        timer.start();
	    }
	
}
