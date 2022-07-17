package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecomUserInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<CommonForum> DEFAULT_COMMON_FORUM = Collections.emptyList();
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final List<PostInfo> DEFAULT_POST_INFO = Collections.emptyList();
  
  public static final String DEFAULT_POS_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<CommonForum> common_forum;
  
  @ProtoField(tag = 6)
  public final CommonDistance distanceinfo;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String pos_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PostInfo> post_info;
  
  @ProtoField(tag = 1)
  public final UserInfo user_info;
  
  public RecomUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      List<CommonForum> list1 = paramBuilder.common_forum;
      if (list1 == null) {
        this.common_forum = DEFAULT_COMMON_FORUM;
      } else {
        this.common_forum = Message.immutableCopyOf(list1);
      } 
      List<PostInfo> list = paramBuilder.post_info;
      if (list == null) {
        this.post_info = DEFAULT_POST_INFO;
      } else {
        this.post_info = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.pos_name;
      if (str == null) {
        this.pos_name = "";
      } else {
        this.pos_name = str;
      } 
      str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
      this.distanceinfo = paramBuilder.distanceinfo;
    } else {
      this.user_info = paramBuilder.user_info;
      this.common_forum = Message.immutableCopyOf(paramBuilder.common_forum);
      this.post_info = Message.immutableCopyOf(paramBuilder.post_info);
      this.pos_name = paramBuilder.pos_name;
      this.message = paramBuilder.message;
      this.distanceinfo = paramBuilder.distanceinfo;
    } 
  }
  
  public RecomUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1139974615, "Ltbclient/FrsPage/RecomUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1139974615, "Ltbclient/FrsPage/RecomUserInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RecomUserInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<CommonForum> common_forum;
    
    public CommonDistance distanceinfo;
    
    public String message;
    
    public String pos_name;
    
    public List<PostInfo> post_info;
    
    public UserInfo user_info;
    
    public Builder() {}
    
    public Builder(RecomUserInfo param1RecomUserInfo) {
      super(param1RecomUserInfo);
      if (param1RecomUserInfo == null)
        return; 
      this.user_info = param1RecomUserInfo.user_info;
      this.common_forum = Message.copyOf(param1RecomUserInfo.common_forum);
      this.post_info = Message.copyOf(param1RecomUserInfo.post_info);
      this.pos_name = param1RecomUserInfo.pos_name;
      this.message = param1RecomUserInfo.message;
      this.distanceinfo = param1RecomUserInfo.distanceinfo;
    }
    
    public RecomUserInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecomUserInfo)interceptResult.objValue; 
      } 
      return new RecomUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
