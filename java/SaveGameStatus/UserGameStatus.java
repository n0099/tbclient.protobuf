package SaveGameStatus;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserGameStatus extends Message {
  public static final String DEFAULT_GAME_ID = "";
  
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer status;
  
  public UserGameStatus(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
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
}
