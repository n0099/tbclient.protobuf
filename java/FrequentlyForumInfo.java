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

public final class FrequentlyForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ACCESS_FLAG;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_FORUM_STATE;
  
  public static final Integer DEFAULT_IS_SIGN;
  
  public static final Long DEFAULT_LAST_ACCESS_TIME;
  
  public static final Integer DEFAULT_LEVEL_ID;
  
  public static final String DEFAULT_NEW_THREAD_NUM = "";
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer access_flag;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer forum_state;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer is_sign;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long last_access_time;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer level_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String new_thread_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<User> user_list;
  
  static {
    DEFAULT_LAST_ACCESS_TIME = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_LEVEL_ID = integer;
    DEFAULT_FORUM_STATE = integer;
    DEFAULT_ACCESS_FLAG = integer;
    DEFAULT_IS_SIGN = integer;
  }
  
  public FrequentlyForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.forum_id;
      if (long_2 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_2;
      } 
      String str2 = paramBuilder.new_thread_num;
      if (str2 == null) {
        this.new_thread_num = "";
      } else {
        this.new_thread_num = str2;
      } 
      List<User> list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      Long long_1 = paramBuilder.last_access_time;
      if (long_1 == null) {
        this.last_access_time = DEFAULT_LAST_ACCESS_TIME;
      } else {
        this.last_access_time = long_1;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      Integer integer1 = paramBuilder.level_id;
      if (integer1 == null) {
        this.level_id = DEFAULT_LEVEL_ID;
      } else {
        this.level_id = integer1;
      } 
      integer1 = paramBuilder.forum_state;
      if (integer1 == null) {
        this.forum_state = DEFAULT_FORUM_STATE;
      } else {
        this.forum_state = integer1;
      } 
      integer1 = paramBuilder.access_flag;
      if (integer1 == null) {
        this.access_flag = DEFAULT_ACCESS_FLAG;
      } else {
        this.access_flag = integer1;
      } 
      integer = paramBuilder.is_sign;
      if (integer == null) {
        this.is_sign = DEFAULT_IS_SIGN;
      } else {
        this.is_sign = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.new_thread_num = ((Builder)integer).new_thread_num;
      this.user_list = Message.immutableCopyOf(((Builder)integer).user_list);
      this.last_access_time = ((Builder)integer).last_access_time;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.level_id = ((Builder)integer).level_id;
      this.forum_state = ((Builder)integer).forum_state;
      this.access_flag = ((Builder)integer).access_flag;
      this.is_sign = ((Builder)integer).is_sign;
    } 
  }
  
  public FrequentlyForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2063690705, "Ltbclient/FrequentlyForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2063690705, "Ltbclient/FrequentlyForumInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
  }
  
  public static final class Builder extends Message.Builder<FrequentlyForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer access_flag;
    
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer forum_state;
    
    public Integer is_sign;
    
    public Long last_access_time;
    
    public Integer level_id;
    
    public String new_thread_num;
    
    public List<User> user_list;
    
    public Builder() {}
    
    public Builder(FrequentlyForumInfo param1FrequentlyForumInfo) {
      super(param1FrequentlyForumInfo);
      if (param1FrequentlyForumInfo == null)
        return; 
      this.forum_id = param1FrequentlyForumInfo.forum_id;
      this.new_thread_num = param1FrequentlyForumInfo.new_thread_num;
      this.user_list = Message.copyOf(param1FrequentlyForumInfo.user_list);
      this.last_access_time = param1FrequentlyForumInfo.last_access_time;
      this.forum_name = param1FrequentlyForumInfo.forum_name;
      this.avatar = param1FrequentlyForumInfo.avatar;
      this.level_id = param1FrequentlyForumInfo.level_id;
      this.forum_state = param1FrequentlyForumInfo.forum_state;
      this.access_flag = param1FrequentlyForumInfo.access_flag;
      this.is_sign = param1FrequentlyForumInfo.is_sign;
    }
    
    public FrequentlyForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (FrequentlyForumInfo)interceptResult.objValue; 
      } 
      return new FrequentlyForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
