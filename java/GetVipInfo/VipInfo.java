package tbclient.GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_A_SCORE;
  
  public static final Integer DEFAULT_EXT_SCORE;
  
  public static final Integer DEFAULT_E_TIME;
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_N_SCORE;
  
  public static final Integer DEFAULT_S_TIME;
  
  public static final Integer DEFAULT_V_LEVEL;
  
  public static final Integer DEFAULT_V_STATUS;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer a_score;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer e_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer ext_score;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer n_score;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer s_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer v_level;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer v_status;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(923224256, "Ltbclient/GetVipInfo/VipInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(923224256, "Ltbclient/GetVipInfo/VipInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_V_STATUS = integer;
    DEFAULT_S_TIME = integer;
    DEFAULT_E_TIME = integer;
    DEFAULT_EXT_SCORE = integer;
    DEFAULT_V_LEVEL = integer;
    DEFAULT_A_SCORE = integer;
    DEFAULT_N_SCORE = integer;
  }
  
  public VipInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.v_status;
      if (integer == null) {
        this.v_status = DEFAULT_V_STATUS;
      } else {
        this.v_status = integer;
      } 
      integer = paramBuilder.s_time;
      if (integer == null) {
        this.s_time = DEFAULT_S_TIME;
      } else {
        this.s_time = integer;
      } 
      integer = paramBuilder.e_time;
      if (integer == null) {
        this.e_time = DEFAULT_E_TIME;
      } else {
        this.e_time = integer;
      } 
      integer = paramBuilder.ext_score;
      if (integer == null) {
        this.ext_score = DEFAULT_EXT_SCORE;
      } else {
        this.ext_score = integer;
      } 
      integer = paramBuilder.v_level;
      if (integer == null) {
        this.v_level = DEFAULT_V_LEVEL;
      } else {
        this.v_level = integer;
      } 
      integer = paramBuilder.a_score;
      if (integer == null) {
        this.a_score = DEFAULT_A_SCORE;
      } else {
        this.a_score = integer;
      } 
      integer = paramBuilder.n_score;
      if (integer == null) {
        this.n_score = DEFAULT_N_SCORE;
      } else {
        this.n_score = integer;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
    } else {
      this.v_status = ((Builder)str).v_status;
      this.s_time = ((Builder)str).s_time;
      this.e_time = ((Builder)str).e_time;
      this.ext_score = ((Builder)str).ext_score;
      this.v_level = ((Builder)str).v_level;
      this.a_score = ((Builder)str).a_score;
      this.n_score = ((Builder)str).n_score;
      this.icon_url = ((Builder)str).icon_url;
    } 
  }
  
  public VipInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer a_score;
    
    public Integer e_time;
    
    public Integer ext_score;
    
    public String icon_url;
    
    public Integer n_score;
    
    public Integer s_time;
    
    public Integer v_level;
    
    public Integer v_status;
    
    public Builder() {}
    
    public Builder(VipInfo param1VipInfo) {
      super(param1VipInfo);
      if (param1VipInfo == null)
        return; 
      this.v_status = param1VipInfo.v_status;
      this.s_time = param1VipInfo.s_time;
      this.e_time = param1VipInfo.e_time;
      this.ext_score = param1VipInfo.ext_score;
      this.v_level = param1VipInfo.v_level;
      this.a_score = param1VipInfo.a_score;
      this.n_score = param1VipInfo.n_score;
      this.icon_url = param1VipInfo.icon_url;
    }
    
    public VipInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VipInfo)interceptResult.objValue; 
      } 
      return new VipInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
