package tbclient.LoadMon;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DATE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String date;
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.date;
      if (str == null) {
        this.date = "";
      } else {
        this.date = str;
      } 
    } else {
      this.date = ((Builder)str).date;
    } 
  }
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SignInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String date;
    
    public Builder() {}
    
    public Builder(SignInfo param1SignInfo) {
      super(param1SignInfo);
      if (param1SignInfo == null)
        return; 
      this.date = param1SignInfo.date;
    }
    
    public SignInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SignInfo)interceptResult.objValue; 
      } 
      return new SignInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
