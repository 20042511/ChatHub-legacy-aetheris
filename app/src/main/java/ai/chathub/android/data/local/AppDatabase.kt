package ai.chathub.android.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ai.chathub.android.data.local.dao.CachedModelDao
import ai.chathub.android.data.local.dao.ConversationDao
import ai.chathub.android.data.local.dao.CustomProviderDao
import ai.chathub.android.data.local.dao.MessageDao
import ai.chathub.android.data.local.entity.CachedModelEntity
import ai.chathub.android.data.local.entity.ConversationEntity
import ai.chathub.android.data.local.entity.CustomProviderEntity
import ai.chathub.android.data.local.entity.MessageEntity

@Database(
    entities = [
        ConversationEntity::class,
        MessageEntity::class,
        CustomProviderEntity::class,
        CachedModelEntity::class
    ],
    version = 2,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun conversationDao(): ConversationDao
    abstract fun messageDao(): MessageDao
    abstract fun customProviderDao(): CustomProviderDao
    abstract fun cachedModelDao(): CachedModelDao
}
