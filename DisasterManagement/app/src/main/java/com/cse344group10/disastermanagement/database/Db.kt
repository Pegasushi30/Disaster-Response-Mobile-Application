package com.cse344group10.disastermanagement.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cse344group10.disastermanagement.database.dao.DbDao
import com.cse344group10.disastermanagement.database.map.BuildingInfo
import com.cse344group10.disastermanagement.database.map.EmergencyDepotInfo
import com.cse344group10.disastermanagement.database.map.MedicalInfo
import com.cse344group10.disastermanagement.database.map.SarInfo
import com.cse344group10.disastermanagement.database.users.UserTable

enum class BuildingTypes {
    Building,
    EmergencySupplyDepot,
    MedicalSupplyDepot,
    SarCenter
}

@Database(
    entities = [
        BuildingInfo::class,
        EmergencyDepotInfo::class,
        MedicalInfo::class,
        SarInfo::class,
        UserTable::class
    ],
    version = 1
)
abstract class Db: RoomDatabase() {
    abstract fun mapDao():DbDao

    companion object {
        @Volatile
        private var INSTANCE: Db? = null

        fun getDatabase(context: Context): Db {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    Db::class.java,
                    "db"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}