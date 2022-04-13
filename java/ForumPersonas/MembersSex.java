package ForumPersonas;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MembersSex extends Message {
  public static final Double DEFAULT_RATE;
  
  public static final Integer DEFAULT_SEX = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
  public final Double rate;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer sex;
  
  static {
    DEFAULT_RATE = Double.valueOf(0.0D);
  }
  
  public MembersSex(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.sex;
      if (integer == null) {
        this.sex = DEFAULT_SEX;
      } else {
        this.sex = integer;
      } 
      double_ = paramBuilder.rate;
      if (double_ == null) {
        this.rate = DEFAULT_RATE;
      } else {
        this.rate = double_;
      } 
    } else {
      this.sex = ((Builder)double_).sex;
      this.rate = ((Builder)double_).rate;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(507550333, "Ltbclient/ForumPersonas/MembersSex;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(507550333, "Ltbclient/ForumPersonas/MembersSex;");
          return;
        } 
      } 
    } 
  }
}
