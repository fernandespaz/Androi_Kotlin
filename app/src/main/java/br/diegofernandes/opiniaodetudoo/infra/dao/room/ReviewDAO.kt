package br.diegofernandes.opiniaodetudoo.infra.dao.room

import android.arch.persistence.room.*
import android.database.Cursor
import br.diegofernandes.opiniaodetudoo.infra.dao.ReviewTableInfo
import br.diegofernandes.opiniaodetudoo.model.Review

/**
 * Created by DiegoPaz on 08/10/19.
 */

@Dao
interface ReviewDAO {

    @Insert
    fun insert(review: Review)

    @Update
    fun update(review: Review)

    @Query("SELECT * FROM ${ReviewTableInfo.TABLE_NAME}")
    fun readAll(): Cursor

    @Delete
    fun delete(review: Review)
}