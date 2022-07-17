package tbclient.SaveGameStatus;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserGameStatus extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer status;
  
  public UserGameStatus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.game_id;
      if (str == null) {
        this.game_id = "";
      } else {
        this.game_id = str;
      } 
      integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
    } else {
      this.game_id = ((Builder)integer).game_id;
      this.status = ((Builder)integer).status;
    } 
  }
  
  public UserGameStatus(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-297555320, "Ltbclient/SaveGameStatus/UserGameStatus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-297555320, "Ltbclient/SaveGameStatus/UserGameStatus;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserGameStatus> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String game_id;
    
    public Integer status;
    
    public Builder() {}
    
    public Builder(UserGameStatus param1UserGameStatus) {
      super(param1UserGameStatus);
      if (param1UserGameStatus == null)
        return; 
      this.game_id = param1UserGameStatus.game_id;
      this.status = param1UserGameStatus.status;
    }
    
    public UserGameStatus build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserGameStatus)interceptResult.objValue; 
      } 
      return new UserGameStatus(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
