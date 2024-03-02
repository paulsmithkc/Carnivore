package org.rsg.carnivore;

import java.util.prefs.Preferences;


/*
 * a wrapper for Properties
 * this is static and singleton so that it can be called anywhere at any time 
 */

public class User_Defaults {
	private static Preferences prefs;
	
    ///////////////////////////////////////////////////////////////////////////
	//Main
	public static void main(String[] args) {
//		Preferences.instance().load();
		
//        Preferences prefs = Preferences.userRoot().node("org/rsg/carnivore");
//        
//        //put data
//        prefs.put("userTheme", "dark");
//        prefs.putInt("fontSize", 12);
//        prefs.put("foo", "bar");
//
//        //get data
//        String userTheme = prefs.get("userTheme", "defaultTheme");
//        int fontSize = prefs.getInt("fontSize", 10); // 10 is the default value
//
//        System.out.println("User Theme: " + userTheme);
//        System.out.println("Font Size: " + fontSize);
	}

    ///////////////////////////////////////////////////////////////////////////
	//singleton pattern
    private static final User_Defaults INSTANCE = new User_Defaults();
    public static User_Defaults instance() {
        return INSTANCE;
    }
    
	private User_Defaults() {
		prefs = Preferences.userRoot().node("org/rsg/carnivore");
//		load();
	}

	public void put(String key, Object val) {
		prefs.put(key, val.toString());
//		save();
	}

	/*
	 * getters require a default
	 */
	
//  String userTheme = prefs.get("userTheme", "defaultTheme");
//  int fontSize = prefs.getInt("fontSize", 10); // 10 is the default value
	
	
	public String getString(String key, String default_value) {
		return prefs.get(key, default_value);
	}
	
	public int getInt(String key, int default_value) {
		return prefs.getInt(key, default_value);	
	}

	public boolean getBoolean(String key, boolean default_value) {
		return prefs.getBoolean(key, default_value);	
	}

//	//LOAD
//	public void load() {
//		if(shouldSaveOrLoad) {
//			Log.debug("[org.rsg.carnivore.Preferences] loading preference file: " + file);
//			try {
//				InputStream in = new FileInputStream(file);
//				propsPreferences.load(in);
//				in.close();
//
//			//if not found assume file is new or missing, and write defaults
//			} catch (FileNotFoundException e) {
//				Log.debug("[org.rsg.carnivore.Preferences] preference file not found -- saving default values instead");
//				loadDefaults();
//				save();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	//SAVE
//	public void save() {
//		if(shouldSaveOrLoad) {
//			Log.debug("[org.rsg.carnivore.Preferences] saving prefs to disk: " + file);
//			try {
//				OutputStream os = new FileOutputStream(file);
//				propsPreferences.store(os, Constants.PROPS_COMMENT);
//				os.close();
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}	
	
//	private void loadDefaults() {
////		propsPreferences.clear();
////		shouldSaveOrLoad = false;
//		put(Constants.CHANNEL, 						Constants.DEFAULT_CHANNEL);
//		put(Constants.SHOULD_SKIP_UDP, 				Constants.DEFAULT_SHOULD_SKIP_UDP);
//		put(Constants.MAXIMUM_VOLUME, 				Constants.DEFAULT_MAXIMUM_VOLUME);
////		shouldSaveOrLoad = true;
//	}
}
