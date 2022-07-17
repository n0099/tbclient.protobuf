package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VoiceRoom extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_JOINED_NUM;
  
  public static final Long DEFAULT_ROOM_ID;
  
  public static final String DEFAULT_ROOM_NAME = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final List<User> DEFAULT_TALKER = Collections.emptyList();
  
  public static final Long DEFAULT_TALKER_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4)
  public final User author;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long joined_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long room_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String room_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer status;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<User> talker;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long talker_num;
  
  static {
    DEFAULT_JOINED_NUM = long_;
    DEFAULT_TALKER_NUM = long_;
    DEFAULT_STATUS = Integer.valueOf(0);
  }
  
  public VoiceRoom(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.room_id;
      if (long_2 == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_2;
      } 
      this.author = paramBuilder.author;
      List<User> list = paramBuilder.talker;
      if (list == null) {
        this.talker = DEFAULT_TALKER;
      } else {
        this.talker = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.joined_num;
      if (long_1 == null) {
        this.joined_num = DEFAULT_JOINED_NUM;
      } else {
        this.joined_num = long_1;
      } 
      long_1 = paramBuilder.talker_num;
      if (long_1 == null) {
        this.talker_num = DEFAULT_TALKER_NUM;
      } else {
        this.talker_num = long_1;
      } 
      Integer integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
      str = paramBuilder.room_name;
      if (str == null) {
        this.room_name = "";
      } else {
        this.room_name = str;
      } 
    } else {
      this.room_id = ((Builder)str).room_id;
      this.author = ((Builder)str).author;
      this.talker = Message.immutableCopyOf(((Builder)str).talker);
      this.joined_num = ((Builder)str).joined_num;
      this.talker_num = ((Builder)str).talker_num;
      this.status = ((Builder)str).status;
      this.room_name = ((Builder)str).room_name;
    } 
  }
  
  public VoiceRoom(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-228051688, "Ltbclient/VoiceRoom;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-228051688, "Ltbclient/VoiceRoom;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ROOM_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<VoiceRoom> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public User author;
    
    public Long joined_num;
    
    public Long room_id;
    
    public String room_name;
    
    public Integer status;
    
    public List<User> talker;
    
    public Long talker_num;
    
    public Builder() {}
    
    public Builder(VoiceRoom param1VoiceRoom) {
      super(param1VoiceRoom);
      if (param1VoiceRoom == null)
        return; 
      this.room_id = param1VoiceRoom.room_id;
      this.author = param1VoiceRoom.author;
      this.talker = Message.copyOf(param1VoiceRoom.talker);
      this.joined_num = param1VoiceRoom.joined_num;
      this.talker_num = param1VoiceRoom.talker_num;
      this.status = param1VoiceRoom.status;
      this.room_name = param1VoiceRoom.room_name;
    }
    
    public VoiceRoom build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VoiceRoom)interceptResult.objValue; 
      } 
      return new VoiceRoom(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
