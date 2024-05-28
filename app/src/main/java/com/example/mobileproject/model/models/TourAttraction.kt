package com.example.mobileproject.model.models
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(
    tableName = "TourAttraction",
    foreignKeys = [
        ForeignKey(
            entity = Attractions::class,
            parentColumns = ["id"],
            childColumns = ["attraction_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Tours::class,
            parentColumns = ["id"],
            childColumns = ["tour_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class TourAttraction(
    @PrimaryKey(autoGenerate = true)
    @NotNull
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "attraction_id")
    val attractionId: Int,

    @ColumnInfo(name = "tour_id")
    val tourId: Int
)