package tbclient.GetForumLevelList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumLevelInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  public ForumLevelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.name = ((Builder)str).name;
    } 
  }
  
  public ForumLevelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1645801832, "Ltbclient/GetForumLevelList/ForumLevelInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1645801832, "Ltbclient/GetForumLevelList/ForumLevelInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumLevelInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer id;
    
    public String name;
    
    public Builder() {}
    
    public Builder(ForumLevelInfo param1ForumLevelInfo) {
      super(param1ForumLevelInfo);
      if (param1ForumLevelInfo == null)
        return; 
      this.id = param1ForumLevelInfo.id;
      this.name = param1ForumLevelInfo.name;
    }
    
    public ForumLevelInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumLevelInfo)interceptResult.objValue; 
      } 
      return new ForumLevelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
