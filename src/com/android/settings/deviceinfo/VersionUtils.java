
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getArsenalsOsVersion(){
        return SystemProperties.get("cn.arsenals.os.version.display","");
    }
}
