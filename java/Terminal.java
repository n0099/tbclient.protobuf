import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Terminal;

public final class Terminal extends Message {
  public static final Integer DEFAULT_CLIENT;
  
  public static final Integer DEFAULT_PC;
  
  public static final Integer DEFAULT_WAP;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer client;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pc;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer wap;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1939344277, "Ltbclient/Terminal;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1939344277, "Ltbclient/Terminal;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PC = integer;
    DEFAULT_WAP = integer;
    DEFAULT_CLIENT = integer;
  }
  
  public Terminal(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.pc;
      if (integer1 == null) {
        this.pc = DEFAULT_PC;
      } else {
        this.pc = integer1;
      } 
      integer1 = paramBuilder.wap;
      if (integer1 == null) {
        this.wap = DEFAULT_WAP;
      } else {
        this.wap = integer1;
      } 
      integer = paramBuilder.client;
      if (integer == null) {
        this.client = DEFAULT_CLIENT;
      } else {
        this.client = integer;
      } 
    } else {
      this.pc = ((Builder)integer).pc;
      this.wap = ((Builder)integer).wap;
      this.client = ((Builder)integer).client;
    } 
  }
}
