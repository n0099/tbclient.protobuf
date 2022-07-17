package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DealAuthInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ITEM_CONTENT = "";
  
  public static final String DEFAULT_ITEM_NAME = "";
  
  public static final String DEFAULT_ITEM_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String item_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String item_url;
  
  public DealAuthInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.item_name;
      if (str1 == null) {
        this.item_name = "";
      } else {
        this.item_name = str1;
      } 
      str1 = paramBuilder.item_content;
      if (str1 == null) {
        this.item_content = "";
      } else {
        this.item_content = str1;
      } 
      str = paramBuilder.item_url;
      if (str == null) {
        this.item_url = "";
      } else {
        this.item_url = str;
      } 
    } else {
      this.item_name = ((Builder)str).item_name;
      this.item_content = ((Builder)str).item_content;
      this.item_url = ((Builder)str).item_url;
    } 
  }
  
  public DealAuthInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DealAuthInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String item_content;
    
    public String item_name;
    
    public String item_url;
    
    public Builder() {}
    
    public Builder(DealAuthInfo param1DealAuthInfo) {
      super(param1DealAuthInfo);
      if (param1DealAuthInfo == null)
        return; 
      this.item_name = param1DealAuthInfo.item_name;
      this.item_content = param1DealAuthInfo.item_content;
      this.item_url = param1DealAuthInfo.item_url;
    }
    
    public DealAuthInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DealAuthInfo)interceptResult.objValue; 
      } 
      return new DealAuthInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
