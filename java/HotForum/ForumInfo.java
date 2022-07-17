package tbclient.HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Long DEFAULT_MEMBER_COUNT;
  
  public static final Long DEFAULT_THREAD_COUNT;
  
  public static final Long DEFAULT_TIME_OUT;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long member_count;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long thread_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long time_out;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(897420221, "Ltbclient/HotForum/ForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(897420221, "Ltbclient/HotForum/ForumInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_TIME_OUT = long_;
    DEFAULT_MEMBER_COUNT = long_;
    DEFAULT_THREAD_COUNT = long_;
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      Long long_1 = paramBuilder.time_out;
      if (long_1 == null) {
        this.time_out = DEFAULT_TIME_OUT;
      } else {
        this.time_out = long_1;
      } 
      long_1 = paramBuilder.member_count;
      if (long_1 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = long_1;
      } 
      long_ = paramBuilder.thread_count;
      if (long_ == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = long_;
      } 
    } else {
      this.forum_id = ((Builder)long_).forum_id;
      this.forum_name = ((Builder)long_).forum_name;
      this.avatar = ((Builder)long_).avatar;
      this.time_out = ((Builder)long_).time_out;
      this.member_count = ((Builder)long_).member_count;
      this.thread_count = ((Builder)long_).thread_count;
    } 
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Long member_count;
    
    public Long thread_count;
    
    public Long time_out;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.forum_id = param1ForumInfo.forum_id;
      this.forum_name = param1ForumInfo.forum_name;
      this.avatar = param1ForumInfo.avatar;
      this.time_out = param1ForumInfo.time_out;
      this.member_count = param1ForumInfo.member_count;
      this.thread_count = param1ForumInfo.thread_count;
    }
    
    public ForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumInfo)interceptResult.objValue; 
      } 
      return new ForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
