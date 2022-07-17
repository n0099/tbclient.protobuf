package tbclient.GetTails;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String st_type;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.st_type;
      if (str == null) {
        this.st_type = "";
      } else {
        this.st_type = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.st_type = paramBuilder.st_type;
      this.common = paramBuilder.common;
    } 
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReqData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String st_type;
    
    public Builder() {}
    
    public Builder(ReqData param1ReqData) {
      super(param1ReqData);
      if (param1ReqData == null)
        return; 
      this.st_type = param1ReqData.st_type;
      this.common = param1ReqData.common;
    }
    
    public ReqData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReqData)interceptResult.objValue; 
      } 
      return new ReqData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
