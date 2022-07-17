package tbclient.GodFollowRecommend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GodUserInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  public GodUserInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.portrait = ((Builder)str).portrait;
      this.forum_name = ((Builder)str).forum_name;
      this.intro = ((Builder)str).intro;
    } 
  }
  
  public GodUserInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(48043836, "Ltbclient/GodFollowRecommend/GodUserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(48043836, "Ltbclient/GodFollowRecommend/GodUserInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<GodUserInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String forum_name;
    
    public String intro;
    
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(GodUserInfo param1GodUserInfo) {
      super(param1GodUserInfo);
      if (param1GodUserInfo == null)
        return; 
      this.user_id = param1GodUserInfo.user_id;
      this.user_name = param1GodUserInfo.user_name;
      this.portrait = param1GodUserInfo.portrait;
      this.forum_name = param1GodUserInfo.forum_name;
      this.intro = param1GodUserInfo.intro;
    }
    
    public GodUserInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GodUserInfo)interceptResult.objValue; 
      } 
      return new GodUserInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
