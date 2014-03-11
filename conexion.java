package com.deitel.cannongame;

import android.app.Activity;
import android.os.Bundle;

public class Conexion extends Activity{
	//private Button bt;
	//private EditText edit;
	//Creamos el handler puente para mostrar
	//el mensaje recibido del servidor
	//private Handler puente = new Handler() {
	 //@Override
	 //public void handleMessage(Message msg) {
	 //Mostramos el mensage recibido del servido en pantalla
	 //Toast.makeText(getApplicationContext(), (String)msg.obj, 
	 //  Toast.LENGTH_LONG).show();
	 //}
	private  void hiloRecolector(){
		Thread t = new Thread();	
		t.start();  
	} 
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		
	}
}
