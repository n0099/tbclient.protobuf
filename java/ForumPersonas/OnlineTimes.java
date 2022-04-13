package ForumPersonas;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OnlineTimes extends Message {
  public static final String DEFAULT_END = "";
  
  public static final Integer DEFAULT_SEQ = Integer.valueOf(0);
  
  public static final String DEFAULT_START = "";
  
  public static final String DEFAULT_TIME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String end;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer seq;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String start;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String time;
  
  public OnlineTimes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.time;
      if (str == null) {
        this.time = "";
      } else {
        this.time = str;
      } 
      str = paramBuilder.start;
      if (str == null) {
        this.start = "";
      } else {
        this.start = str;
      } 
      str = paramBuilder.end;
      if (str == null) {
        this.end = "";
      } else {
        this.end = str;
      } 
      integer = paramBuilder.seq;
      if (integer == null) {
        this.seq = DEFAULT_SEQ;
      } else {
        this.seq = integer;
      } 
    } else {
      this.time = ((Builder)integer).time;
      this.start = ((Builder)integer).start;
      this.end = ((Builder)integer).end;
      this.seq = ((Builder)integer).seq;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-765288807, "Ltbclient/ForumPersonas/OnlineTimes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-765288807, "Ltbclient/ForumPersonas/OnlineTimes;");
          return;
        } 
      } 
    } 
  }
}
