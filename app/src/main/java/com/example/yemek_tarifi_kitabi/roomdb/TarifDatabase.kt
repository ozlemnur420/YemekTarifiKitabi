package com.example.yemek_tarifi_kitabi.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.yemek_tarifi_kitabi.model.Tarif

@Database(entities = [Tarif::class], version = 1)
abstract class TarifDatabase : RoomDatabase() {
    abstract fun tarifDao() : TarifDAO
}