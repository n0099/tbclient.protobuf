package tbclient.GetPoisByLocation;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_LAT = "";
  
  public static final String DEFAULT_LNG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String lat;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String lng;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.lat;
      if (str == null) {
        this.lat = "";
      } else {
        this.lat = str;
      } 
      str = paramBuilder.lng;
      if (str == null) {
        this.lng = "";
      } else {
        this.lng = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.lat = paramBuilder.lat;
      this.lng = paramBuilder.lng;
      this.common = paramBuilder.common;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String lat;
    
    public String lng;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.lat = param1DataReq.lat;
      this.lng = param1DataReq.lng;
      this.common = param1DataReq.common;
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
