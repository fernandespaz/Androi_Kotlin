package br.diegofernandes.opiniaodetudoo.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

/**
 * Created by DiegoPaz on 17/09/19.
 */
@Entity
data class Review(
        @PrimaryKey val id: String,
        var opiniao: String,
        var titulo: String,
        @ColumnInfo(name = "photo_path")
        val photoPath: String? = null,
        @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
        val thumbnail: ByteArray? = null,
        @ColumnInfo(typeAffinity = ColumnInfo.REAL)
        var latitude: Double?,
        @ColumnInfo(typeAffinity = ColumnInfo.REAL)
        var longitude: Double?) : Serializable {

    @Ignore
    constructor(id: String, opiniao: String, titulo: String) : this(id, opiniao, titulo, null, null)

    @Ignore
    constructor(id: String, opiniao: String, titulo: String, photoPath: String?, thumbnail: ByteArray?) : this(id, opiniao, titulo, photoPath, thumbnail, null, null)
}