package tbclient.GetToken;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToastInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BTNTEXT = "";
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final String DEFAULT_SHARETOKEN = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String btntext;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sharetoken;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public ToastInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.message;
      if (str1 == null) {
        this.message = "";
      } else {
        this.message = str1;
      } 
      str1 = paramBuilder.btntext;
      if (str1 == null) {
        this.btntext = "";
      } else {
        this.btntext = str1;
      } 
      str = paramBuilder.sharetoken;
      if (str == null) {
        this.sharetoken = "";
      } else {
        this.sharetoken = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.message = ((Builder)str).message;
      this.btntext = ((Builder)str).btntext;
      this.sharetoken = ((Builder)str).sharetoken;
    } 
  }
  
  public ToastInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ToastInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String btntext;
    
    public String message;
    
    public String sharetoken;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ToastInfo param1ToastInfo) {
      super(param1ToastInfo);
      if (param1ToastInfo == null)
        return; 
      this.url = param1ToastInfo.url;
      this.message = param1ToastInfo.message;
      this.btntext = param1ToastInfo.btntext;
      this.sharetoken = param1ToastInfo.sharetoken;
    }
    
    public ToastInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ToastInfo)interceptResult.objValue; 
      } 
      return new ToastInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
