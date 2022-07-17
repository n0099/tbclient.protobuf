package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppTransmitData extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_WISE_SAMPLE_ID = "";
  
  public static final String DEFAULT_YY_HDID = "";
  
  public static final String DEFAULT_YY_VERSION = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String wise_sample_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String yy_hdid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String yy_version;
  
  public AppTransmitData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.wise_sample_id;
      if (str1 == null) {
        this.wise_sample_id = "";
      } else {
        this.wise_sample_id = str1;
      } 
      str1 = paramBuilder.yy_hdid;
      if (str1 == null) {
        this.yy_hdid = "";
      } else {
        this.yy_hdid = str1;
      } 
      str = paramBuilder.yy_version;
      if (str == null) {
        this.yy_version = "";
      } else {
        this.yy_version = str;
      } 
    } else {
      this.wise_sample_id = ((Builder)str).wise_sample_id;
      this.yy_hdid = ((Builder)str).yy_hdid;
      this.yy_version = ((Builder)str).yy_version;
    } 
  }
  
  public AppTransmitData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AppTransmitData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String wise_sample_id;
    
    public String yy_hdid;
    
    public String yy_version;
    
    public Builder() {}
    
    public Builder(AppTransmitData param1AppTransmitData) {
      super(param1AppTransmitData);
      if (param1AppTransmitData == null)
        return; 
      this.wise_sample_id = param1AppTransmitData.wise_sample_id;
      this.yy_hdid = param1AppTransmitData.yy_hdid;
      this.yy_version = param1AppTransmitData.yy_version;
    }
    
    public AppTransmitData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AppTransmitData)interceptResult.objValue; 
      } 
      return new AppTransmitData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
