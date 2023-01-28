package tbclient.HotThreadList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InnerTabInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_JUMP_SCHEME = "";
  
  public static final String DEFAULT_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public InnerTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.jump_scheme;
      if (str1 == null) {
        this.jump_scheme = "";
      } else {
        this.jump_scheme = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.jump_scheme = ((Builder)str).jump_scheme;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public InnerTabInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<InnerTabInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String icon;
    
    public String jump_scheme;
    
    public String name;
    
    public Builder() {}
    
    public Builder(InnerTabInfo param1InnerTabInfo) {
      super(param1InnerTabInfo);
      if (param1InnerTabInfo == null)
        return; 
      this.name = param1InnerTabInfo.name;
      this.jump_scheme = param1InnerTabInfo.jump_scheme;
      this.icon = param1InnerTabInfo.icon;
    }
    
    public InnerTabInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (InnerTabInfo)interceptResult.objValue; 
      } 
      return new InnerTabInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
