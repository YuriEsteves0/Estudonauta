package com.yuri.projetofinalandroidstudioestudonauta.Helpers;

import android.content.Context;
import android.content.Intent;

public class AndroidHelper {
    public static void trocarTela(Context context,  Class<?> cls){
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
}
