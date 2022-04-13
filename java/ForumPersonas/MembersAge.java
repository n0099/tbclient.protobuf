package ForumPersonas;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MembersAge extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Double DEFAULT_RATE;
  
  public static final Integer DEFAULT_SEQ = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
  public final Double rate;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer seq;
  
  static {
    DEFAULT_RATE = Double.valueOf(0.0D);
  }
  
  public MembersAge(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.seq;
      if (integer == null) {
        this.seq = DEFAULT_SEQ;
      } else {
        this.seq = integer;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      double_ = paramBuilder.rate;
      if (double_ == null) {
        this.rate = DEFAULT_RATE;
      } else {
        this.rate = double_;
      } 
    } else {
      this.seq = ((Builder)double_).seq;
      this.name = ((Builder)double_).name;
      this.rate = ((Builder)double_).rate;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(507015428, "Ltbclient/ForumPersonas/MembersAge;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(507015428, "Ltbclient/ForumPersonas/MembersAge;");
          return;
        } 
      } 
    } 
  }
}
