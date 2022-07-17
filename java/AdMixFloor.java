package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdMixFloor extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ADVERTISE_ID = "";
  
  public static final Long DEFAULT_AD_ID;
  
  public static final Integer DEFAULT_AD_TYPE;
  
  public static final Integer DEFAULT_FLOOR_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long ad_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer ad_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String advertise_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer floor_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1259284706, "Ltbclient/AdMixFloor;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1259284706, "Ltbclient/AdMixFloor;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_AD_TYPE = integer;
    DEFAULT_FLOOR_NUM = integer;
    DEFAULT_AD_ID = Long.valueOf(0L);
  }
  
  public AdMixFloor(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.ad_type;
      if (integer == null) {
        this.ad_type = DEFAULT_AD_TYPE;
      } else {
        this.ad_type = integer;
      } 
      integer = paramBuilder.floor_num;
      if (integer == null) {
        this.floor_num = DEFAULT_FLOOR_NUM;
      } else {
        this.floor_num = integer;
      } 
      Long long_ = paramBuilder.ad_id;
      if (long_ == null) {
        this.ad_id = DEFAULT_AD_ID;
      } else {
        this.ad_id = long_;
      } 
      str = paramBuilder.advertise_id;
      if (str == null) {
        this.advertise_id = "";
      } else {
        this.advertise_id = str;
      } 
    } else {
      this.ad_type = ((Builder)str).ad_type;
      this.floor_num = ((Builder)str).floor_num;
      this.ad_id = ((Builder)str).ad_id;
      this.advertise_id = ((Builder)str).advertise_id;
    } 
  }
  
  public AdMixFloor(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdMixFloor> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long ad_id;
    
    public Integer ad_type;
    
    public String advertise_id;
    
    public Integer floor_num;
    
    public Builder() {}
    
    public Builder(AdMixFloor param1AdMixFloor) {
      super(param1AdMixFloor);
      if (param1AdMixFloor == null)
        return; 
      this.ad_type = param1AdMixFloor.ad_type;
      this.floor_num = param1AdMixFloor.floor_num;
      this.ad_id = param1AdMixFloor.ad_id;
      this.advertise_id = param1AdMixFloor.advertise_id;
    }
    
    public AdMixFloor build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AdMixFloor)interceptResult.objValue; 
      } 
      return new AdMixFloor(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
