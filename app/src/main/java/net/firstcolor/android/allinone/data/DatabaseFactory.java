package net.firstcolor.android.allinone.data;

import android.arch.persistence.room.Room;
import android.content.Context;

public class DatabaseFactory {

    private static AppDatabase db;

    public static AppDatabase getInstance(Context context){
        if(db == null){
            db = Room.databaseBuilder(context, AppDatabase.class, "articles").build();
        }
        return db;
    }
}
