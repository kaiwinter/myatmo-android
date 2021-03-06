package com.github.kaiwinter.myatmo.storage;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class SharedPreferencesStore {

    private static final String KEY_REFRESH_TOKEN = "KEY_REFRESH_TOKEN"; // OAUTH
    private static final String KEY_ACCESS_TOKEN = "KEY_ACCESS_TOKEN"; // OAUTH
    private static final String KEY_EXPIRES_AT = "KEY_EXPIRES_AT"; // OAUTH

    private static final String DEFAULT_OUTDOOR_MODULE = "DEFAULT_OUTDOOR_MODULE"; // If the user owns more than one outdoor module

    private final SharedPreferences sharedPreferences;

    public SharedPreferencesStore(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void setTokens(String refreshToken, String accessToken, long expiresAt) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_REFRESH_TOKEN, refreshToken);
        editor.putString(KEY_ACCESS_TOKEN, accessToken);
        editor.putLong(KEY_EXPIRES_AT, expiresAt);
        editor.apply();
    }

    public String getRefreshToken() {
        return sharedPreferences.getString(KEY_REFRESH_TOKEN, null);
    }

    public String getAccessToken() {
        return sharedPreferences.getString(KEY_ACCESS_TOKEN, null);
    }

    public long getExpiresAt() {
        return sharedPreferences.getLong(KEY_EXPIRES_AT, 0);
    }

    public String getDefaultOutdoorModule() {
        return sharedPreferences.getString(DEFAULT_OUTDOOR_MODULE, null);
    }

    public void setDefaultOutdoorModule(String indoorModuleId) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(DEFAULT_OUTDOOR_MODULE, indoorModuleId);
        editor.apply();
    }
}
