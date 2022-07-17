package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaStageDislikeInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_DISLIKE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_DISLIKE_REASON = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer dislike_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String dislike_reason;
  
  public AlaStageDislikeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.dislike_reason;
      if (str == null) {
        this.dislike_reason = "";
      } else {
        this.dislike_reason = str;
      } 
      integer = paramBuilder.dislike_id;
      if (integer == null) {
        this.dislike_id = DEFAULT_DISLIKE_ID;
      } else {
        this.dislike_id = integer;
      } 
    } else {
      this.dislike_reason = ((Builder)integer).dislike_reason;
      this.dislike_id = ((Builder)integer).dislike_id;
    } 
  }
  
  public AlaStageDislikeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(426500666, "Ltbclient/AlaStageDislikeInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(426500666, "Ltbclient/AlaStageDislikeInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AlaStageDislikeInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer dislike_id;
    
    public String dislike_reason;
    
    public Builder() {}
    
    public Builder(AlaStageDislikeInfo param1AlaStageDislikeInfo) {
      super(param1AlaStageDislikeInfo);
      if (param1AlaStageDislikeInfo == null)
        return; 
      this.dislike_reason = param1AlaStageDislikeInfo.dislike_reason;
      this.dislike_id = param1AlaStageDislikeInfo.dislike_id;
    }
    
    public AlaStageDislikeInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AlaStageDislikeInfo)interceptResult.objValue; 
      } 
      return new AlaStageDislikeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
