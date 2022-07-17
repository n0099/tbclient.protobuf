package tbclient.GetRemindLiveRooms;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.YyExt;

public final class YyLiveInfoSimple extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BTN_TEXT = "";
  
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_FEED_ID = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_ROOM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String btn_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String feed_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long room_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 5)
  public final YyExt yy_ext;
  
  public YyLiveInfoSimple(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.desc;
      if (str2 == null) {
        this.desc = "";
      } else {
        this.desc = str2;
      } 
      this.yy_ext = paramBuilder.yy_ext;
      Long long_ = paramBuilder.room_id;
      if (long_ == null) {
        this.room_id = DEFAULT_ROOM_ID;
      } else {
        this.room_id = long_;
      } 
      String str1 = paramBuilder.btn_text;
      if (str1 == null) {
        this.btn_text = "";
      } else {
        this.btn_text = str1;
      } 
      str = paramBuilder.feed_id;
      if (str == null) {
        this.feed_id = "";
      } else {
        this.feed_id = str;
      } 
    } else {
      this.user_name = ((Builder)str).user_name;
      this.portrait = ((Builder)str).portrait;
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.yy_ext = ((Builder)str).yy_ext;
      this.room_id = ((Builder)str).room_id;
      this.btn_text = ((Builder)str).btn_text;
      this.feed_id = ((Builder)str).feed_id;
    } 
  }
  
  public YyLiveInfoSimple(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1531658587, "Ltbclient/GetRemindLiveRooms/YyLiveInfoSimple;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1531658587, "Ltbclient/GetRemindLiveRooms/YyLiveInfoSimple;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<YyLiveInfoSimple> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String btn_text;
    
    public String desc;
    
    public String feed_id;
    
    public String portrait;
    
    public Long room_id;
    
    public String title;
    
    public String user_name;
    
    public YyExt yy_ext;
    
    public Builder() {}
    
    public Builder(YyLiveInfoSimple param1YyLiveInfoSimple) {
      super(param1YyLiveInfoSimple);
      if (param1YyLiveInfoSimple == null)
        return; 
      this.user_name = param1YyLiveInfoSimple.user_name;
      this.portrait = param1YyLiveInfoSimple.portrait;
      this.title = param1YyLiveInfoSimple.title;
      this.desc = param1YyLiveInfoSimple.desc;
      this.yy_ext = param1YyLiveInfoSimple.yy_ext;
      this.room_id = param1YyLiveInfoSimple.room_id;
      this.btn_text = param1YyLiveInfoSimple.btn_text;
      this.feed_id = param1YyLiveInfoSimple.feed_id;
    }
    
    public YyLiveInfoSimple build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (YyLiveInfoSimple)interceptResult.objValue; 
      } 
      return new YyLiveInfoSimple(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
