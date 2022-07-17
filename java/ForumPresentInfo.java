package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumPresentInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final List<UserRankPresentInfo> DEFAULT_USER_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<UserRankPresentInfo> user_list;
  
  public ForumPresentInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<UserRankPresentInfo> list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.user_list = Message.immutableCopyOf(((Builder)str).user_list);
      this.content = ((Builder)str).content;
    } 
  }
  
  public ForumPresentInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(98030953, "Ltbclient/ForumPresentInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(98030953, "Ltbclient/ForumPresentInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumPresentInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String content;
    
    public List<UserRankPresentInfo> user_list;
    
    public Builder() {}
    
    public Builder(ForumPresentInfo param1ForumPresentInfo) {
      super(param1ForumPresentInfo);
      if (param1ForumPresentInfo == null)
        return; 
      this.user_list = Message.copyOf(param1ForumPresentInfo.user_list);
      this.content = param1ForumPresentInfo.content;
    }
    
    public ForumPresentInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumPresentInfo)interceptResult.objValue; 
      } 
      return new ForumPresentInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
