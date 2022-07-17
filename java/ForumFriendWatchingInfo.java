package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumFriendWatchingInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORUM_AVATAR = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_SHOW_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_SHOW_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer show_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String show_type;
  
  public ForumFriendWatchingInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.forum_avatar;
      if (str1 == null) {
        this.forum_avatar = "";
      } else {
        this.forum_avatar = str1;
      } 
      str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      Integer integer = paramBuilder.show_num;
      if (integer == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = integer;
      } 
      str = paramBuilder.show_type;
      if (str == null) {
        this.show_type = "";
      } else {
        this.show_type = str;
      } 
    } else {
      this.forum_avatar = ((Builder)str).forum_avatar;
      this.forum_name = ((Builder)str).forum_name;
      this.show_num = ((Builder)str).show_num;
      this.show_type = ((Builder)str).show_type;
    } 
  }
  
  public ForumFriendWatchingInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1713644955, "Ltbclient/ForumFriendWatchingInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1713644955, "Ltbclient/ForumFriendWatchingInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumFriendWatchingInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String forum_avatar;
    
    public String forum_name;
    
    public Integer show_num;
    
    public String show_type;
    
    public Builder() {}
    
    public Builder(ForumFriendWatchingInfo param1ForumFriendWatchingInfo) {
      super(param1ForumFriendWatchingInfo);
      if (param1ForumFriendWatchingInfo == null)
        return; 
      this.forum_avatar = param1ForumFriendWatchingInfo.forum_avatar;
      this.forum_name = param1ForumFriendWatchingInfo.forum_name;
      this.show_num = param1ForumFriendWatchingInfo.show_num;
      this.show_type = param1ForumFriendWatchingInfo.show_type;
    }
    
    public ForumFriendWatchingInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumFriendWatchingInfo)interceptResult.objValue; 
      } 
      return new ForumFriendWatchingInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
