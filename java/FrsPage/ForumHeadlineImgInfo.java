package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumHeadlineImgInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_HEADLINE_URL = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final Long DEFAULT_IMG_USER_ID;
  
  public static final String DEFAULT_IMG_USER_NAME = "";
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_THREAD_USER_ID;
  
  public static final String DEFAULT_THREAD_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String headline_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long img_user_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_user_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long thread_user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String thread_user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1268013380, "Ltbclient/FrsPage/ForumHeadlineImgInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1268013380, "Ltbclient/FrsPage/ForumHeadlineImgInfo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_THREAD_USER_ID = long_;
    DEFAULT_IMG_USER_ID = long_;
  }
  
  public ForumHeadlineImgInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      String str1 = paramBuilder.thread_user_name;
      if (str1 == null) {
        this.thread_user_name = "";
      } else {
        this.thread_user_name = str1;
      } 
      str1 = paramBuilder.img_user_name;
      if (str1 == null) {
        this.img_user_name = "";
      } else {
        this.img_user_name = str1;
      } 
      str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      Long long_1 = paramBuilder.thread_user_id;
      if (long_1 == null) {
        this.thread_user_id = DEFAULT_THREAD_USER_ID;
      } else {
        this.thread_user_id = long_1;
      } 
      long_1 = paramBuilder.img_user_id;
      if (long_1 == null) {
        this.img_user_id = DEFAULT_IMG_USER_ID;
      } else {
        this.img_user_id = long_1;
      } 
      str = paramBuilder.headline_url;
      if (str == null) {
        this.headline_url = "";
      } else {
        this.headline_url = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.thread_user_name = ((Builder)str).thread_user_name;
      this.img_user_name = ((Builder)str).img_user_name;
      this.img_url = ((Builder)str).img_url;
      this.thread_user_id = ((Builder)str).thread_user_id;
      this.img_user_id = ((Builder)str).img_user_id;
      this.headline_url = ((Builder)str).headline_url;
    } 
  }
  
  public ForumHeadlineImgInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumHeadlineImgInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String headline_url;
    
    public String img_url;
    
    public Long img_user_id;
    
    public String img_user_name;
    
    public Long thread_id;
    
    public Long thread_user_id;
    
    public String thread_user_name;
    
    public Builder() {}
    
    public Builder(ForumHeadlineImgInfo param1ForumHeadlineImgInfo) {
      super(param1ForumHeadlineImgInfo);
      if (param1ForumHeadlineImgInfo == null)
        return; 
      this.thread_id = param1ForumHeadlineImgInfo.thread_id;
      this.thread_user_name = param1ForumHeadlineImgInfo.thread_user_name;
      this.img_user_name = param1ForumHeadlineImgInfo.img_user_name;
      this.img_url = param1ForumHeadlineImgInfo.img_url;
      this.thread_user_id = param1ForumHeadlineImgInfo.thread_user_id;
      this.img_user_id = param1ForumHeadlineImgInfo.img_user_id;
      this.headline_url = param1ForumHeadlineImgInfo.headline_url;
    }
    
    public ForumHeadlineImgInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumHeadlineImgInfo)interceptResult.objValue; 
      } 
      return new ForumHeadlineImgInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
