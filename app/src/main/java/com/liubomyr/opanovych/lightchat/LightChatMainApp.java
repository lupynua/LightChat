package com.liubomyr.opanovych.lightchat;

import android.app.Application;

/**
 * Created by Liubomyr on 15.05.2017.
 */

public class LightChatMainApp extends Application{
    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        LightChatMainApp.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
