package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SendCardInfo;

public final class BusinessPromotInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_HEADLINEPOST;
  
  public static final Long DEFAULT_IS_PROMOT = Long.valueOf(0L);
  
  public static final Integer DEFAULT_IS_S_CARD;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_headlinepost;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long is_promot;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_s_card;
  
  @ProtoField(tag = 4)
  public final SendCardInfo send_card_info;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_HEADLINEPOST = integer;
    DEFAULT_IS_S_CARD = integer;
  }
  
  public BusinessPromotInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.is_promot;
      if (long_ == null) {
        this.is_promot = DEFAULT_IS_PROMOT;
      } else {
        this.is_promot = long_;
      } 
      Integer integer = paramBuilder.is_headlinepost;
      if (integer == null) {
        this.is_headlinepost = DEFAULT_IS_HEADLINEPOST;
      } else {
        this.is_headlinepost = integer;
      } 
      integer = paramBuilder.is_s_card;
      if (integer == null) {
        this.is_s_card = DEFAULT_IS_S_CARD;
      } else {
        this.is_s_card = integer;
      } 
      this.send_card_info = paramBuilder.send_card_info;
    } else {
      this.is_promot = paramBuilder.is_promot;
      this.is_headlinepost = paramBuilder.is_headlinepost;
      this.is_s_card = paramBuilder.is_s_card;
      this.send_card_info = paramBuilder.send_card_info;
    } 
  }
  
  public BusinessPromotInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(132483076, "Ltbclient/PbPage/BusinessPromotInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(132483076, "Ltbclient/PbPage/BusinessPromotInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BusinessPromotInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_headlinepost;
    
    public Long is_promot;
    
    public Integer is_s_card;
    
    public SendCardInfo send_card_info;
    
    public Builder() {}
    
    public Builder(BusinessPromotInfo param1BusinessPromotInfo) {
      super(param1BusinessPromotInfo);
      if (param1BusinessPromotInfo == null)
        return; 
      this.is_promot = param1BusinessPromotInfo.is_promot;
      this.is_headlinepost = param1BusinessPromotInfo.is_headlinepost;
      this.is_s_card = param1BusinessPromotInfo.is_s_card;
      this.send_card_info = param1BusinessPromotInfo.send_card_info;
    }
    
    public BusinessPromotInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BusinessPromotInfo)interceptResult.objValue; 
      } 
      return new BusinessPromotInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
