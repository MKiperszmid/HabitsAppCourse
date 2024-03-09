package com.mkiperszmid.home_data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HomeDatabase_Impl extends HomeDatabase {
  private volatile HomeDao _homeDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HabitEntity` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `frequency` TEXT NOT NULL, `completedDates` TEXT NOT NULL, `reminder` INTEGER NOT NULL, `startDate` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HabitSyncEntity` (`id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fbcb7b8049acbcd1358888b92a57dec8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `HabitEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `HabitSyncEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHabitEntity = new HashMap<String, TableInfo.Column>(6);
        _columnsHabitEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitEntity.put("frequency", new TableInfo.Column("frequency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitEntity.put("completedDates", new TableInfo.Column("completedDates", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitEntity.put("reminder", new TableInfo.Column("reminder", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitEntity.put("startDate", new TableInfo.Column("startDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHabitEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHabitEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHabitEntity = new TableInfo("HabitEntity", _columnsHabitEntity, _foreignKeysHabitEntity, _indicesHabitEntity);
        final TableInfo _existingHabitEntity = TableInfo.read(_db, "HabitEntity");
        if (! _infoHabitEntity.equals(_existingHabitEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HabitEntity(com.mkiperszmid.home_data.local.entity.HabitEntity).\n"
                  + " Expected:\n" + _infoHabitEntity + "\n"
                  + " Found:\n" + _existingHabitEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsHabitSyncEntity = new HashMap<String, TableInfo.Column>(1);
        _columnsHabitSyncEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHabitSyncEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHabitSyncEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHabitSyncEntity = new TableInfo("HabitSyncEntity", _columnsHabitSyncEntity, _foreignKeysHabitSyncEntity, _indicesHabitSyncEntity);
        final TableInfo _existingHabitSyncEntity = TableInfo.read(_db, "HabitSyncEntity");
        if (! _infoHabitSyncEntity.equals(_existingHabitSyncEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "HabitSyncEntity(com.mkiperszmid.home_data.local.entity.HabitSyncEntity).\n"
                  + " Expected:\n" + _infoHabitSyncEntity + "\n"
                  + " Found:\n" + _existingHabitSyncEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "fbcb7b8049acbcd1358888b92a57dec8", "2bb5b2b6791185ef588bc98d44b93604");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "HabitEntity","HabitSyncEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `HabitEntity`");
      _db.execSQL("DELETE FROM `HabitSyncEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(HomeDao.class, HomeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public HomeDao getDao() {
    if (_homeDao != null) {
      return _homeDao;
    } else {
      synchronized(this) {
        if(_homeDao == null) {
          _homeDao = new HomeDao_Impl(this);
        }
        return _homeDao;
      }
    }
  }
}
