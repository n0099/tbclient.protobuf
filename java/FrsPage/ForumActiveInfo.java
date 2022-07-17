package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumActiveInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FORUM_BRIEF = "";
  
  public static final String DEFAULT_FORUM_SHARE_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_brief;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_share_url;
  
  public ForumActiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.forum_brief;
      if (str1 == null) {
        this.forum_brief = "";
      } else {
        this.forum_brief = str1;
      } 
      str = paramBuilder.forum_share_url;
      if (str == null) {
        this.forum_share_url = "";
      } else {
        this.forum_share_url = str;
      } 
    } else {
      this.forum_brief = ((Builder)str).forum_brief;
      this.forum_share_url = ((Builder)str).forum_share_url;
    } 
  }
  
  public ForumActiveInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumActiveInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String forum_brief;
    
    public String forum_share_url;
    
    public Builder() {}
    
    public Builder(ForumActiveInfo param1ForumActiveInfo) {
      super(param1ForumActiveInfo);
      if (param1ForumActiveInfo == null)
        return; 
      this.forum_brief = param1ForumActiveInfo.forum_brief;
      this.forum_share_url = param1ForumActiveInfo.forum_share_url;
    }
    
    public ForumActiveInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumActiveInfo)interceptResult.objValue; 
      } 
      return new ForumActiveInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
