package tbclient.RecommendFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COMMON_POST_PIC = "";
  
  public static final String DEFAULT_LARGE_POST_PIC = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_post_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String large_post_pic;
  
  public PostInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.common_post_pic;
      if (str1 == null) {
        this.common_post_pic = "";
      } else {
        this.common_post_pic = str1;
      } 
      str = paramBuilder.large_post_pic;
      if (str == null) {
        this.large_post_pic = "";
      } else {
        this.large_post_pic = str;
      } 
    } else {
      this.common_post_pic = ((Builder)str).common_post_pic;
      this.large_post_pic = ((Builder)str).large_post_pic;
    } 
  }
  
  public PostInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PostInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String common_post_pic;
    
    public String large_post_pic;
    
    public Builder() {}
    
    public Builder(PostInfo param1PostInfo) {
      super(param1PostInfo);
      if (param1PostInfo == null)
        return; 
      this.common_post_pic = param1PostInfo.common_post_pic;
      this.large_post_pic = param1PostInfo.large_post_pic;
    }
    
    public PostInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PostInfo)interceptResult.objValue; 
      } 
      return new PostInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
