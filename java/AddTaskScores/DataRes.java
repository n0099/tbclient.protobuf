package AddTaskScores;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_SCORES;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scores;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(352622455, "Ltbclient/AddTaskScores/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(352622455, "Ltbclient/AddTaskScores/DataRes;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_FINISH = integer;
    DEFAULT_SCORES = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_finish;
      if (integer1 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer1;
      } 
      integer = paramBuilder.scores;
      if (integer == null) {
        this.scores = DEFAULT_SCORES;
      } else {
        this.scores = integer;
      } 
    } else {
      this.is_finish = ((Builder)integer).is_finish;
      this.scores = ((Builder)integer).scores;
    } 
  }
}
