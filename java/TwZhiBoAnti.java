package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TwZhiBoAnti extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CAN_ADD_LIVE_POST;
  
  public static final Integer DEFAULT_CAN_DEL_LIVE_POST;
  
  public static final Integer DEFAULT_CAN_SHOW_PB_HEADLINE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer can_add_live_post;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer can_del_live_post;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer can_show_pb_headline;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1955873310, "Ltbclient/TwZhiBoAnti;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1955873310, "Ltbclient/TwZhiBoAnti;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CAN_ADD_LIVE_POST = integer;
    DEFAULT_CAN_DEL_LIVE_POST = integer;
    DEFAULT_CAN_SHOW_PB_HEADLINE = integer;
  }
  
  public TwZhiBoAnti(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.can_add_live_post;
      if (integer1 == null) {
        this.can_add_live_post = DEFAULT_CAN_ADD_LIVE_POST;
      } else {
        this.can_add_live_post = integer1;
      } 
      integer1 = paramBuilder.can_del_live_post;
      if (integer1 == null) {
        this.can_del_live_post = DEFAULT_CAN_DEL_LIVE_POST;
      } else {
        this.can_del_live_post = integer1;
      } 
      integer = paramBuilder.can_show_pb_headline;
      if (integer == null) {
        this.can_show_pb_headline = DEFAULT_CAN_SHOW_PB_HEADLINE;
      } else {
        this.can_show_pb_headline = integer;
      } 
    } else {
      this.can_add_live_post = ((Builder)integer).can_add_live_post;
      this.can_del_live_post = ((Builder)integer).can_del_live_post;
      this.can_show_pb_headline = ((Builder)integer).can_show_pb_headline;
    } 
  }
  
  public TwZhiBoAnti(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TwZhiBoAnti> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer can_add_live_post;
    
    public Integer can_del_live_post;
    
    public Integer can_show_pb_headline;
    
    public Builder() {}
    
    public Builder(TwZhiBoAnti param1TwZhiBoAnti) {
      super(param1TwZhiBoAnti);
      if (param1TwZhiBoAnti == null)
        return; 
      this.can_add_live_post = param1TwZhiBoAnti.can_add_live_post;
      this.can_del_live_post = param1TwZhiBoAnti.can_del_live_post;
      this.can_show_pb_headline = param1TwZhiBoAnti.can_show_pb_headline;
    }
    
    public TwZhiBoAnti build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TwZhiBoAnti)interceptResult.objValue; 
      } 
      return new TwZhiBoAnti(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
