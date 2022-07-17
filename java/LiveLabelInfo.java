package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LiveLabelInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public LiveLabelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public LiveLabelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LiveLabelInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String icon;
    
    public String name;
    
    public Builder() {}
    
    public Builder(LiveLabelInfo param1LiveLabelInfo) {
      super(param1LiveLabelInfo);
      if (param1LiveLabelInfo == null)
        return; 
      this.name = param1LiveLabelInfo.name;
      this.icon = param1LiveLabelInfo.icon;
    }
    
    public LiveLabelInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LiveLabelInfo)interceptResult.objValue; 
      } 
      return new LiveLabelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
