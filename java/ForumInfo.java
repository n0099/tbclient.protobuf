package tbclient;

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
  
  public static final String DEFAULT_CONCERN_NUM = "";
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_HAS_CONCERNED;
  
  public static final String DEFAULT_POST_NUM = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String concern_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_concerned;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String post_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(437468438, "Ltbclient/ForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(437468438, "Ltbclient/ForumInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FORUM_ID = integer;
    DEFAULT_HAS_CONCERNED = integer;
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.forum_id;
      if (integer1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer1;
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
      str = paramBuilder.post_num;
      if (str == null) {
        this.post_num = "";
      } else {
        this.post_num = str;
      } 
      str = paramBuilder.concern_num;
      if (str == null) {
        this.concern_num = "";
      } else {
        this.concern_num = str;
      } 
      integer = paramBuilder.has_concerned;
      if (integer == null) {
        this.has_concerned = DEFAULT_HAS_CONCERNED;
      } else {
        this.has_concerned = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.avatar = ((Builder)integer).avatar;
      this.post_num = ((Builder)integer).post_num;
      this.concern_num = ((Builder)integer).concern_num;
      this.has_concerned = ((Builder)integer).has_concerned;
    } 
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String avatar;
    
    public String concern_num;
    
    public Integer forum_id;
    
    public String forum_name;
    
    public Integer has_concerned;
    
    public String post_num;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.forum_id = param1ForumInfo.forum_id;
      this.forum_name = param1ForumInfo.forum_name;
      this.avatar = param1ForumInfo.avatar;
      this.post_num = param1ForumInfo.post_num;
      this.concern_num = param1ForumInfo.concern_num;
      this.has_concerned = param1ForumInfo.has_concerned;
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
