package tbclient.RecommendFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LikeUserInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final List<PostInfo> DEFAULT_POST_INFO = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ForumInfo> forum_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PostInfo> post_info;
  
  @ProtoField(tag = 1)
  public final UserInfo user_info;
  
  public LikeUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      List<ForumInfo> list1 = paramBuilder.forum_info;
      if (list1 == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list1);
      } 
      List<PostInfo> list = paramBuilder.post_info;
      if (list == null) {
        this.post_info = DEFAULT_POST_INFO;
      } else {
        this.post_info = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
    } else {
      this.user_info = ((Builder)str).user_info;
      this.forum_info = Message.immutableCopyOf(((Builder)str).forum_info);
      this.post_info = Message.immutableCopyOf(((Builder)str).post_info);
      this.message = ((Builder)str).message;
    } 
  }
  
  public LikeUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1047375564, "Ltbclient/RecommendFriend/LikeUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1047375564, "Ltbclient/RecommendFriend/LikeUserInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LikeUserInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ForumInfo> forum_info;
    
    public String message;
    
    public List<PostInfo> post_info;
    
    public UserInfo user_info;
    
    public Builder() {}
    
    public Builder(LikeUserInfo param1LikeUserInfo) {
      super(param1LikeUserInfo);
      if (param1LikeUserInfo == null)
        return; 
      this.user_info = param1LikeUserInfo.user_info;
      this.forum_info = Message.copyOf(param1LikeUserInfo.forum_info);
      this.post_info = Message.copyOf(param1LikeUserInfo.post_info);
      this.message = param1LikeUserInfo.message;
    }
    
    public LikeUserInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LikeUserInfo)interceptResult.objValue; 
      } 
      return new LikeUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
