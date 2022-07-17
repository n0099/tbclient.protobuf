package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AnchorPower extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ANCHOR_MESSAGE = "";
  
  public static final Integer DEFAULT_CAN_ADD_LIVE_POST;
  
  public static final String DEFAULT_CAN_ADD_LIVE_POST_MSG = "";
  
  public static final Integer DEFAULT_CAN_DEL_LIVE_POST;
  
  public static final Integer DEFAULT_HAVE_POWER;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String anchor_message;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer can_add_live_post;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String can_add_live_post_msg;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer can_del_live_post;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer have_power;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1755581426, "Ltbclient/FrsPage/AnchorPower;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1755581426, "Ltbclient/FrsPage/AnchorPower;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAVE_POWER = integer;
    DEFAULT_CAN_ADD_LIVE_POST = integer;
    DEFAULT_CAN_DEL_LIVE_POST = integer;
  }
  
  public AnchorPower(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.have_power;
      if (integer2 == null) {
        this.have_power = DEFAULT_HAVE_POWER;
      } else {
        this.have_power = integer2;
      } 
      String str1 = paramBuilder.anchor_message;
      if (str1 == null) {
        this.anchor_message = "";
      } else {
        this.anchor_message = str1;
      } 
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
      str = paramBuilder.can_add_live_post_msg;
      if (str == null) {
        this.can_add_live_post_msg = "";
      } else {
        this.can_add_live_post_msg = str;
      } 
    } else {
      this.have_power = ((Builder)str).have_power;
      this.anchor_message = ((Builder)str).anchor_message;
      this.can_add_live_post = ((Builder)str).can_add_live_post;
      this.can_del_live_post = ((Builder)str).can_del_live_post;
      this.can_add_live_post_msg = ((Builder)str).can_add_live_post_msg;
    } 
  }
  
  public AnchorPower(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AnchorPower> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String anchor_message;
    
    public Integer can_add_live_post;
    
    public String can_add_live_post_msg;
    
    public Integer can_del_live_post;
    
    public Integer have_power;
    
    public Builder() {}
    
    public Builder(AnchorPower param1AnchorPower) {
      super(param1AnchorPower);
      if (param1AnchorPower == null)
        return; 
      this.have_power = param1AnchorPower.have_power;
      this.anchor_message = param1AnchorPower.anchor_message;
      this.can_add_live_post = param1AnchorPower.can_add_live_post;
      this.can_del_live_post = param1AnchorPower.can_del_live_post;
      this.can_add_live_post_msg = param1AnchorPower.can_add_live_post_msg;
    }
    
    public AnchorPower build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AnchorPower)interceptResult.objValue; 
      } 
      return new AnchorPower(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
