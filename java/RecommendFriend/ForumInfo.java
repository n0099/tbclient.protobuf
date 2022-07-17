package tbclient.RecommendFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COMMON_FORUM = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_forum;
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.common_forum;
      if (str == null) {
        this.common_forum = "";
      } else {
        this.common_forum = str;
      } 
    } else {
      this.common_forum = ((Builder)str).common_forum;
    } 
  }
  
  public ForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String common_forum;
    
    public Builder() {}
    
    public Builder(ForumInfo param1ForumInfo) {
      super(param1ForumInfo);
      if (param1ForumInfo == null)
        return; 
      this.common_forum = param1ForumInfo.common_forum;
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
