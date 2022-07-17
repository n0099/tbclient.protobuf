package tbclient.Userlike;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NewGodInfo;
import tbclient.ThreadInfo;

public final class UserList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FANS_NUM;
  
  public static final Long DEFAULT_ID;
  
  public static final String DEFAULT_INTRO = "";
  
  public static final Integer DEFAULT_IS_GOD;
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_PREFIX = "";
  
  public static final String DEFAULT_RECOM_REASON = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer fans_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer is_god;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 12)
  public final NewGodInfo new_god_data;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String prefix;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String recom_reason;
  
  @ProtoField(tag = 11)
  public final ThreadInfo thread_info;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(933679279, "Ltbclient/Userlike/UserList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(933679279, "Ltbclient/Userlike/UserList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FANS_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_ID = Long.valueOf(0L);
    DEFAULT_IS_GOD = integer;
    DEFAULT_LEVEL = integer;
  }
  
  public UserList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      str2 = paramBuilder.prefix;
      if (str2 == null) {
        this.prefix = "";
      } else {
        this.prefix = str2;
      } 
      str2 = paramBuilder.intro;
      if (str2 == null) {
        this.intro = "";
      } else {
        this.intro = str2;
      } 
      Integer integer2 = paramBuilder.fans_num;
      if (integer2 == null) {
        this.fans_num = DEFAULT_FANS_NUM;
      } else {
        this.fans_num = integer2;
      } 
      integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      String str1 = paramBuilder.recom_reason;
      if (str1 == null) {
        this.recom_reason = "";
      } else {
        this.recom_reason = str1;
      } 
      str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      Integer integer1 = paramBuilder.is_god;
      if (integer1 == null) {
        this.is_god = DEFAULT_IS_GOD;
      } else {
        this.is_god = integer1;
      } 
      integer1 = paramBuilder.level;
      if (integer1 == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer1;
      } 
      this.thread_info = paramBuilder.thread_info;
      this.new_god_data = paramBuilder.new_god_data;
    } else {
      this.name = paramBuilder.name;
      this.prefix = paramBuilder.prefix;
      this.intro = paramBuilder.intro;
      this.fans_num = paramBuilder.fans_num;
      this.post_num = paramBuilder.post_num;
      this.recom_reason = paramBuilder.recom_reason;
      this.portrait = paramBuilder.portrait;
      this.id = paramBuilder.id;
      this.is_god = paramBuilder.is_god;
      this.level = paramBuilder.level;
      this.thread_info = paramBuilder.thread_info;
      this.new_god_data = paramBuilder.new_god_data;
    } 
  }
  
  public UserList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer fans_num;
    
    public Long id;
    
    public String intro;
    
    public Integer is_god;
    
    public Integer level;
    
    public String name;
    
    public NewGodInfo new_god_data;
    
    public String portrait;
    
    public Integer post_num;
    
    public String prefix;
    
    public String recom_reason;
    
    public ThreadInfo thread_info;
    
    public Builder() {}
    
    public Builder(UserList param1UserList) {
      super(param1UserList);
      if (param1UserList == null)
        return; 
      this.name = param1UserList.name;
      this.prefix = param1UserList.prefix;
      this.intro = param1UserList.intro;
      this.fans_num = param1UserList.fans_num;
      this.post_num = param1UserList.post_num;
      this.recom_reason = param1UserList.recom_reason;
      this.portrait = param1UserList.portrait;
      this.id = param1UserList.id;
      this.is_god = param1UserList.is_god;
      this.level = param1UserList.level;
      this.thread_info = param1UserList.thread_info;
      this.new_god_data = param1UserList.new_god_data;
    }
    
    public UserList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserList)interceptResult.objValue; 
      } 
      return new UserList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
