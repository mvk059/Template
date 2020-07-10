package com.mvk.database.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mvk.database.db.entity.DummyEntity

@Dao
interface DummyDao {

    @Query("SELECT * FROM dummy_entity")
    fun getAll(): List<DummyEntity>

    @Insert
    fun insert(entity: DummyEntity)

    @Delete
    fun delete(entity: DummyEntity)
}