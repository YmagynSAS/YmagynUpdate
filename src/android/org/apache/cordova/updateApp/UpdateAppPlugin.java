package org.apache.cordova.updateApp;

import java.io.File;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.DroidGap;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.sax.StartElementListener;
import android.util.Log;

public class UpdateAppPlugin extends CordovaPlugin{
	public boolean execute(String arg0, JSONArray args, CallbackContext callbackContext) {
		if(arg0.equals("callNewView")) {
			DroidGap dg = (DroidGap) cordova.getActivity();
			try {
				File f = new File(args.getString(0));
				if (f.exists())
				{
					Log.d("file_exist", "le fichier existe");
				}
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				dg.loadUrl("file://"+args.getString(0));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
}
