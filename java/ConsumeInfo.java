package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ConsumeInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public ConsumeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.title = ((Builder)str).title;
      this.content = ((Builder)str).content;
    } 
  }
  
  public ConsumeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ConsumeInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String content;
    
    public String icon;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ConsumeInfo param1ConsumeInfo) {
      super(param1ConsumeInfo);
      if (param1ConsumeInfo == null)
        return; 
      this.icon = param1ConsumeInfo.icon;
      this.title = param1ConsumeInfo.title;
      this.content = param1ConsumeInfo.content;
    }
    
    public ConsumeInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ConsumeInfo)interceptResult.objValue; 
      } 
      return new ConsumeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
