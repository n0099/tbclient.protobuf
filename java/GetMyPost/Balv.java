package GetMyPost;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Balv extends Message {
  public static final Integer DEFAULT_DAYS_TOFREE;
  
  public static final Integer DEFAULT_IS_BLACK;
  
  public static final Integer DEFAULT_IS_BLOCK;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer days_tofree;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_black;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_block;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(581843995, "Ltbclient/GetMyPost/Balv;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(581843995, "Ltbclient/GetMyPost/Balv;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_BLACK = integer;
    DEFAULT_IS_BLOCK = integer;
    DEFAULT_DAYS_TOFREE = integer;
  }
  
  public Balv(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_black;
      if (integer1 == null) {
        this.is_black = DEFAULT_IS_BLACK;
      } else {
        this.is_black = integer1;
      } 
      integer1 = paramBuilder.is_block;
      if (integer1 == null) {
        this.is_block = DEFAULT_IS_BLOCK;
      } else {
        this.is_block = integer1;
      } 
      integer = paramBuilder.days_tofree;
      if (integer == null) {
        this.days_tofree = DEFAULT_DAYS_TOFREE;
      } else {
        this.days_tofree = integer;
      } 
    } else {
      this.is_black = ((Builder)integer).is_black;
      this.is_block = ((Builder)integer).is_block;
      this.days_tofree = ((Builder)integer).days_tofree;
    } 
  }
}
