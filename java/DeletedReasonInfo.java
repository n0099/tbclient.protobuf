package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DeletedReasonInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_BOOMGROW;
  
  public static final Integer DEFAULT_IS_GRAYS_CALE_FORUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_boomgrow;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_grays_cale_forum;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-230127110, "Ltbclient/DeletedReasonInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-230127110, "Ltbclient/DeletedReasonInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_GRAYS_CALE_FORUM = integer;
    DEFAULT_IS_BOOMGROW = integer;
  }
  
  public DeletedReasonInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_grays_cale_forum;
      if (integer1 == null) {
        this.is_grays_cale_forum = DEFAULT_IS_GRAYS_CALE_FORUM;
      } else {
        this.is_grays_cale_forum = integer1;
      } 
      integer = paramBuilder.is_boomgrow;
      if (integer == null) {
        this.is_boomgrow = DEFAULT_IS_BOOMGROW;
      } else {
        this.is_boomgrow = integer;
      } 
    } else {
      this.is_grays_cale_forum = ((Builder)integer).is_grays_cale_forum;
      this.is_boomgrow = ((Builder)integer).is_boomgrow;
    } 
  }
  
  public DeletedReasonInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeletedReasonInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_boomgrow;
    
    public Integer is_grays_cale_forum;
    
    public Builder() {}
    
    public Builder(DeletedReasonInfo param1DeletedReasonInfo) {
      super(param1DeletedReasonInfo);
      if (param1DeletedReasonInfo == null)
        return; 
      this.is_grays_cale_forum = param1DeletedReasonInfo.is_grays_cale_forum;
      this.is_boomgrow = param1DeletedReasonInfo.is_boomgrow;
    }
    
    public DeletedReasonInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DeletedReasonInfo)interceptResult.objValue; 
      } 
      return new DeletedReasonInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
