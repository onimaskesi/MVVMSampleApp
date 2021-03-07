package com.onimaskesi.mvvmsampleapp.data.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.onimaskesi.mvvmsampleapp.data.db.entities.User;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `User` (`uid`,`_id`,`name`,`email`,`password`,`email_verified_at`,`created_at`,`updated_at`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getUid());
        if (value.get_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.get_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
        if (value.getEmail_verified_at() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEmail_verified_at());
        }
        if (value.getCreated_at() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCreated_at());
        }
        if (value.getUpdated_at() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getUpdated_at());
        }
      }
    };
  }

  @Override
  public Object upsert(final User user, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfUser.insertAndReturnId(user);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<User> getUser() {
    final String _sql = "SELECT * FROM user WHERE uid = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"user"}, false, new Callable<User>() {
      @Override
      public User call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfİd = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfEmailVerifiedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "email_verified_at");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final User _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp_id;
            if (_cursor.isNull(_cursorIndexOfİd)) {
              _tmp_id = null;
            } else {
              _tmp_id = (int) _cursor.getInt(_cursorIndexOfİd);
            }
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpEmail_verified_at;
            _tmpEmail_verified_at = _cursor.getString(_cursorIndexOfEmailVerifiedAt);
            final String _tmpCreated_at;
            _tmpCreated_at = _cursor.getString(_cursorIndexOfCreatedAt);
            final String _tmpUpdated_at;
            _tmpUpdated_at = _cursor.getString(_cursorIndexOfUpdatedAt);
            _result = new User(_tmp_id,_tmpName,_tmpEmail,_tmpPassword,_tmpEmail_verified_at,_tmpCreated_at,_tmpUpdated_at);
            final int _tmpUid;
            _tmpUid = (int) _cursor.getInt(_cursorIndexOfUid);
            _result.setUid(_tmpUid);
          } else {
            _result = null;
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
}
