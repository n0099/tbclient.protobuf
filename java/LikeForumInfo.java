package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LikeForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_name;
  
  public LikeForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
      long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
    } else {
      this.forum_name = ((Builder)long_).forum_name;
      this.forum_id = ((Builder)long_).forum_id;
    } 
  }
  
  public LikeForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-421121267, "Ltbclient/LikeForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-421121267, "Ltbclient/LikeForumInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LikeForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Builder() {}
    
    public Builder(LikeForumInfo param1LikeForumInfo) {
      super(param1LikeForumInfo);
      if (param1LikeForumInfo == null)
        return; 
      this.forum_name = param1LikeForumInfo.forum_name;
      this.forum_id = param1LikeForumInfo.forum_id;
    }
    
    public LikeForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LikeForumInfo)interceptResult.objValue; 
      } 
      return new LikeForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
