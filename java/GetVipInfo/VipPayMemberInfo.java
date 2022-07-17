package tbclient.GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipPayMemberInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_END_TIME;
  
  public static final Integer DEFAULT_NOW_TIME;
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final Integer DEFAULT_PROPS_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer end_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer now_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer props_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(451960568, "Ltbclient/GetVipInfo/VipPayMemberInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(451960568, "Ltbclient/GetVipInfo/VipPayMemberInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PROPS_ID = integer;
    DEFAULT_END_TIME = integer;
    DEFAULT_NOW_TIME = integer;
  }
  
  public VipPayMemberInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.props_id;
      if (integer1 == null) {
        this.props_id = DEFAULT_PROPS_ID;
      } else {
        this.props_id = integer1;
      } 
      integer1 = paramBuilder.end_time;
      if (integer1 == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = integer1;
      } 
      String str = paramBuilder.pic_url;
      if (str == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str;
      } 
      integer = paramBuilder.now_time;
      if (integer == null) {
        this.now_time = DEFAULT_NOW_TIME;
      } else {
        this.now_time = integer;
      } 
    } else {
      this.props_id = ((Builder)integer).props_id;
      this.end_time = ((Builder)integer).end_time;
      this.pic_url = ((Builder)integer).pic_url;
      this.now_time = ((Builder)integer).now_time;
    } 
  }
  
  public VipPayMemberInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipPayMemberInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer end_time;
    
    public Integer now_time;
    
    public String pic_url;
    
    public Integer props_id;
    
    public Builder() {}
    
    public Builder(VipPayMemberInfo param1VipPayMemberInfo) {
      super(param1VipPayMemberInfo);
      if (param1VipPayMemberInfo == null)
        return; 
      this.props_id = param1VipPayMemberInfo.props_id;
      this.end_time = param1VipPayMemberInfo.end_time;
      this.pic_url = param1VipPayMemberInfo.pic_url;
      this.now_time = param1VipPayMemberInfo.now_time;
    }
    
    public VipPayMemberInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VipPayMemberInfo)interceptResult.objValue; 
      } 
      return new VipPayMemberInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
