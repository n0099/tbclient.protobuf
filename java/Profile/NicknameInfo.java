package tbclient.Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NicknameInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_LEFT_DAYS = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer left_days;
  
  public NicknameInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.left_days;
      if (integer == null) {
        this.left_days = DEFAULT_LEFT_DAYS;
      } else {
        this.left_days = integer;
      } 
    } else {
      this.left_days = ((Builder)integer).left_days;
    } 
  }
  
  public NicknameInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1334358833, "Ltbclient/Profile/NicknameInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1334358833, "Ltbclient/Profile/NicknameInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<NicknameInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer left_days;
    
    public Builder() {}
    
    public Builder(NicknameInfo param1NicknameInfo) {
      super(param1NicknameInfo);
      if (param1NicknameInfo == null)
        return; 
      this.left_days = param1NicknameInfo.left_days;
    }
    
    public NicknameInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NicknameInfo)interceptResult.objValue; 
      } 
      return new NicknameInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
