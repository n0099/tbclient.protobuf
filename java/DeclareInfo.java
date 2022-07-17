package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DeclareInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_DECLARE_ID;
  
  public static final Long DEFAULT_DECLARE_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_DECLARE_TEXT = "";
  
  public static final String DEFAULT_DECLARE_URL = "";
  
  public static final Integer DEFAULT_IS_DECLARE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer declare_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long declare_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String declare_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String declare_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_declare;
  
  static {
    DEFAULT_IS_DECLARE = integer;
  }
  
  public DeclareInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.declare_id;
      if (integer1 == null) {
        this.declare_id = DEFAULT_DECLARE_ID;
      } else {
        this.declare_id = integer1;
      } 
      String str = paramBuilder.declare_url;
      if (str == null) {
        this.declare_url = "";
      } else {
        this.declare_url = str;
      } 
      str = paramBuilder.declare_text;
      if (str == null) {
        this.declare_text = "";
      } else {
        this.declare_text = str;
      } 
      Long long_ = paramBuilder.declare_num;
      if (long_ == null) {
        this.declare_num = DEFAULT_DECLARE_NUM;
      } else {
        this.declare_num = long_;
      } 
      integer = paramBuilder.is_declare;
      if (integer == null) {
        this.is_declare = DEFAULT_IS_DECLARE;
      } else {
        this.is_declare = integer;
      } 
    } else {
      this.declare_id = ((Builder)integer).declare_id;
      this.declare_url = ((Builder)integer).declare_url;
      this.declare_text = ((Builder)integer).declare_text;
      this.declare_num = ((Builder)integer).declare_num;
      this.is_declare = ((Builder)integer).is_declare;
    } 
  }
  
  public DeclareInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(76404717, "Ltbclient/DeclareInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(76404717, "Ltbclient/DeclareInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_DECLARE_ID = integer;
  }
  
  public static final class Builder extends Message.Builder<DeclareInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer declare_id;
    
    public Long declare_num;
    
    public String declare_text;
    
    public String declare_url;
    
    public Integer is_declare;
    
    public Builder() {}
    
    public Builder(DeclareInfo param1DeclareInfo) {
      super(param1DeclareInfo);
      if (param1DeclareInfo == null)
        return; 
      this.declare_id = param1DeclareInfo.declare_id;
      this.declare_url = param1DeclareInfo.declare_url;
      this.declare_text = param1DeclareInfo.declare_text;
      this.declare_num = param1DeclareInfo.declare_num;
      this.is_declare = param1DeclareInfo.is_declare;
    }
    
    public DeclareInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DeclareInfo)interceptResult.objValue; 
      } 
      return new DeclareInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
