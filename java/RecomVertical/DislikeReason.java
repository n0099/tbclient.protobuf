package tbclient.RecomVertical;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DislikeReason extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_DISLIKE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_DISLIKE_REASON = "";
  
  public static final String DEFAULT_EXTRA = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer dislike_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dislike_reason;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String extra;
  
  public DislikeReason(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.dislike_reason;
      if (str1 == null) {
        this.dislike_reason = "";
      } else {
        this.dislike_reason = str1;
      } 
      Integer integer = paramBuilder.dislike_id;
      if (integer == null) {
        this.dislike_id = DEFAULT_DISLIKE_ID;
      } else {
        this.dislike_id = integer;
      } 
      str = paramBuilder.extra;
      if (str == null) {
        this.extra = "";
      } else {
        this.extra = str;
      } 
    } else {
      this.dislike_reason = ((Builder)str).dislike_reason;
      this.dislike_id = ((Builder)str).dislike_id;
      this.extra = ((Builder)str).extra;
    } 
  }
  
  public DislikeReason(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(881412359, "Ltbclient/RecomVertical/DislikeReason;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(881412359, "Ltbclient/RecomVertical/DislikeReason;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DislikeReason> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer dislike_id;
    
    public String dislike_reason;
    
    public String extra;
    
    public Builder() {}
    
    public Builder(DislikeReason param1DislikeReason) {
      super(param1DislikeReason);
      if (param1DislikeReason == null)
        return; 
      this.dislike_reason = param1DislikeReason.dislike_reason;
      this.dislike_id = param1DislikeReason.dislike_id;
      this.extra = param1DislikeReason.extra;
    }
    
    public DislikeReason build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DislikeReason)interceptResult.objValue; 
      } 
      return new DislikeReason(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
