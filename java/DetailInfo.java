package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DetailInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public DetailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.text = ((Builder)str).text;
      this.url = ((Builder)str).url;
    } 
  }
  
  public DetailInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DetailInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String text;
    
    public String url;
    
    public Builder() {}
    
    public Builder(DetailInfo param1DetailInfo) {
      super(param1DetailInfo);
      if (param1DetailInfo == null)
        return; 
      this.text = param1DetailInfo.text;
      this.url = param1DetailInfo.url;
    }
    
    public DetailInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DetailInfo)interceptResult.objValue; 
      } 
      return new DetailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
