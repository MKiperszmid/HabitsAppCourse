package com.mkiperszmid.home_data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mkiperszmid.home_data.local.entity.HabitEntity;
import com.mkiperszmid.home_data.local.entity.HabitSyncEntity;
import com.mkiperszmid.home_data.local.typeconverter.HomeTypeConverter;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HomeDao_Impl implements HomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HabitEntity> __insertionAdapterOfHabitEntity;

  private HomeTypeConverter __homeTypeConverter;

  private final EntityInsertionAdapter<HabitSyncEntity> __insertionAdapterOfHabitSyncEntity;

  private final EntityDeletionOrUpdateAdapter<HabitSyncEntity> __deletionAdapterOfHabitSyncEntity;

  public HomeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabitEntity = new EntityInsertionAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HabitEntity` (`id`,`name`,`frequency`,`completedDates`,`reminder`,`startDate`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        final String _tmp = __homeTypeConverter().fromFrequency(value.getFrequency());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
        final String _tmp_1 = __homeTypeConverter().fromcompletedDates(value.getCompletedDates());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp_1);
        }
        stmt.bindLong(5, value.getReminder());
        stmt.bindLong(6, value.getStartDate());
      }
    };
    this.__insertionAdapterOfHabitSyncEntity = new EntityInsertionAdapter<HabitSyncEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HabitSyncEntity` (`id`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitSyncEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__deletionAdapterOfHabitSyncEntity = new EntityDeletionOrUpdateAdapter<HabitSyncEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `HabitSyncEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitSyncEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertHabit(final HabitEntity habitEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHabitEntity.insert(habitEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertHabitSync(final HabitSyncEntity habitSyncEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHabitSyncEntity.insert(habitSyncEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteHabitSync(final HabitSyncEntity habitSyncEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfHabitSyncEntity.handle(habitSyncEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getHabitById(final String id,
      final Continuation<? super HabitEntity> continuation) {
    final String _sql = "SELECT * FROM HabitEntity WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<HabitEntity>() {
      @Override
      public HabitEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "frequency");
          final int _cursorIndexOfCompletedDates = CursorUtil.getColumnIndexOrThrow(_cursor, "completedDates");
          final int _cursorIndexOfReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final HabitEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final List<Integer> _tmpFrequency;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfFrequency)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfFrequency);
            }
            _tmpFrequency = __homeTypeConverter().toFrequency(_tmp);
            final List<Long> _tmpCompletedDates;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCompletedDates)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCompletedDates);
            }
            _tmpCompletedDates = __homeTypeConverter().tocompletedDates(_tmp_1);
            final long _tmpReminder;
            _tmpReminder = _cursor.getLong(_cursorIndexOfReminder);
            final long _tmpStartDate;
            _tmpStartDate = _cursor.getLong(_cursorIndexOfStartDate);
            _result = new HabitEntity(_tmpId,_tmpName,_tmpFrequency,_tmpCompletedDates,_tmpReminder,_tmpStartDate);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<HabitEntity>> getAllHabitsForSelectedDate(final long date) {
    final String _sql = "SELECT * FROM HabitEntity WHERE startDate <= ? ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, date);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"HabitEntity"}, new Callable<List<HabitEntity>>() {
      @Override
      public List<HabitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "frequency");
          final int _cursorIndexOfCompletedDates = CursorUtil.getColumnIndexOrThrow(_cursor, "completedDates");
          final int _cursorIndexOfReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final List<HabitEntity> _result = new ArrayList<HabitEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HabitEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final List<Integer> _tmpFrequency;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfFrequency)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfFrequency);
            }
            _tmpFrequency = __homeTypeConverter().toFrequency(_tmp);
            final List<Long> _tmpCompletedDates;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCompletedDates)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCompletedDates);
            }
            _tmpCompletedDates = __homeTypeConverter().tocompletedDates(_tmp_1);
            final long _tmpReminder;
            _tmpReminder = _cursor.getLong(_cursorIndexOfReminder);
            final long _tmpStartDate;
            _tmpStartDate = _cursor.getLong(_cursorIndexOfStartDate);
            _item = new HabitEntity(_tmpId,_tmpName,_tmpFrequency,_tmpCompletedDates,_tmpReminder,_tmpStartDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<HabitEntity> getAllHabits() {
    final String _sql = "SELECT * FROM HabitEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "frequency");
      final int _cursorIndexOfCompletedDates = CursorUtil.getColumnIndexOrThrow(_cursor, "completedDates");
      final int _cursorIndexOfReminder = CursorUtil.getColumnIndexOrThrow(_cursor, "reminder");
      final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
      final List<HabitEntity> _result = new ArrayList<HabitEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HabitEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final List<Integer> _tmpFrequency;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfFrequency)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfFrequency);
        }
        _tmpFrequency = __homeTypeConverter().toFrequency(_tmp);
        final List<Long> _tmpCompletedDates;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCompletedDates)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfCompletedDates);
        }
        _tmpCompletedDates = __homeTypeConverter().tocompletedDates(_tmp_1);
        final long _tmpReminder;
        _tmpReminder = _cursor.getLong(_cursorIndexOfReminder);
        final long _tmpStartDate;
        _tmpStartDate = _cursor.getLong(_cursorIndexOfStartDate);
        _item = new HabitEntity(_tmpId,_tmpName,_tmpFrequency,_tmpCompletedDates,_tmpReminder,_tmpStartDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HabitSyncEntity> getAllHabitsSync() {
    final String _sql = "SELECT * FROM HabitSyncEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<HabitSyncEntity> _result = new ArrayList<HabitSyncEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HabitSyncEntity _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        _item = new HabitSyncEntity(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Arrays.asList(HomeTypeConverter.class);
  }

  private synchronized HomeTypeConverter __homeTypeConverter() {
    if (__homeTypeConverter == null) {
      __homeTypeConverter = __db.getTypeConverter(HomeTypeConverter.class);
    }
    return __homeTypeConverter;
  }
}
