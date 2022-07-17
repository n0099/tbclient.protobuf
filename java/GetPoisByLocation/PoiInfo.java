package tbclient.GetPoisByLocation;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PoiInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ADDR = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SN = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String addr;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sn;
  
  public PoiInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.addr;
      if (str1 == null) {
        this.addr = "";
      } else {
        this.addr = str1;
      } 
      str = paramBuilder.sn;
      if (str == null) {
        this.sn = "";
      } else {
        this.sn = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.addr = ((Builder)str).addr;
      this.sn = ((Builder)str).sn;
    } 
  }
  
  public PoiInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PoiInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String addr;
    
    public String name;
    
    public String sn;
    
    public Builder() {}
    
    public Builder(PoiInfo param1PoiInfo) {
      super(param1PoiInfo);
      if (param1PoiInfo == null)
        return; 
      this.name = param1PoiInfo.name;
      this.addr = param1PoiInfo.addr;
      this.sn = param1PoiInfo.sn;
    }
    
    public PoiInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PoiInfo)interceptResult.objValue; 
      } 
      return new PoiInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
