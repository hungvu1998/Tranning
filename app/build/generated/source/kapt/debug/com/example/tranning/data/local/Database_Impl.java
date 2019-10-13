package com.example.tranning.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class Database_Impl extends Database {
  private volatile BreedDao _breedDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(8) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `BreedModel` (`id` INTEGER NOT NULL, `breedName` TEXT, `img` BLOB, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"e08766e7f9a5d061874c5796f53c70a8\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `BreedModel`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
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
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBreedModel = new HashMap<String, TableInfo.Column>(3);
        _columnsBreedModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsBreedModel.put("breedName", new TableInfo.Column("breedName", "TEXT", false, 0));
        _columnsBreedModel.put("img", new TableInfo.Column("img", "BLOB", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBreedModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBreedModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBreedModel = new TableInfo("BreedModel", _columnsBreedModel, _foreignKeysBreedModel, _indicesBreedModel);
        final TableInfo _existingBreedModel = TableInfo.read(_db, "BreedModel");
        if (! _infoBreedModel.equals(_existingBreedModel)) {
          throw new IllegalStateException("Migration didn't properly handle BreedModel(com.example.tranning.data.model.BreedModel).\n"
                  + " Expected:\n" + _infoBreedModel + "\n"
                  + " Found:\n" + _existingBreedModel);
        }
      }
    }, "e08766e7f9a5d061874c5796f53c70a8", "c91545ae288f09bdf215fbe256bbf7a6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "BreedModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `BreedModel`");
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
  public BreedDao breedDao() {
    if (_breedDao != null) {
      return _breedDao;
    } else {
      synchronized(this) {
        if(_breedDao == null) {
          _breedDao = new BreedDao_Impl(this);
        }
        return _breedDao;
      }
    }
  }
}
