package tbclient.CompleteTask;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COMPELETE_ID = "";
  
  public static final String DEFAULT_SHOUBAICUID = "";
  
  public static final String DEFAULT_TOKEN = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String compelete_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String shoubaicuid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String token;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.shoubaicuid;
      if (str1 == null) {
        this.shoubaicuid = "";
      } else {
        this.shoubaicuid = str1;
      } 
      str1 = paramBuilder.compelete_id;
      if (str1 == null) {
        this.compelete_id = "";
      } else {
        this.compelete_id = str1;
      } 
      str = paramBuilder.token;
      if (str == null) {
        this.token = "";
      } else {
        this.token = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.shoubaicuid = ((Builder)str).shoubaicuid;
      this.compelete_id = ((Builder)str).compelete_id;
      this.token = ((Builder)str).token;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String compelete_id;
    
    public String shoubaicuid;
    
    public String token;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.shoubaicuid = param1DataReq.shoubaicuid;
      this.compelete_id = param1DataReq.compelete_id;
      this.token = param1DataReq.token;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
