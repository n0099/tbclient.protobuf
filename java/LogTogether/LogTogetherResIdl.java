package tbclient.LogTogether;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class LogTogetherResIdl extends Message {
  public static Interceptable $ic;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public LogTogetherResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
    } else {
      this.error = paramBuilder.error;
    } 
  }
  
  public LogTogetherResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LogTogetherResIdl> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(LogTogetherResIdl param1LogTogetherResIdl) {
      super(param1LogTogetherResIdl);
      if (param1LogTogetherResIdl == null)
        return; 
      this.error = param1LogTogetherResIdl.error;
    }
    
    public LogTogetherResIdl build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LogTogetherResIdl)interceptResult.objValue; 
      } 
      return new LogTogetherResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
