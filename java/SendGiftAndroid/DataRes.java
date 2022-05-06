package SendGiftAndroid;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_MONEY = Integer.valueOf(0);
  
  public static final String DEFAULT_PUBLIC_KEY = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer money;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String public_key;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.money;
      if (integer == null) {
        this.money = DEFAULT_MONEY;
      } else {
        this.money = integer;
      } 
      str = paramBuilder.public_key;
      if (str == null) {
        this.public_key = "";
      } else {
        this.public_key = str;
      } 
    } else {
      this.money = ((Builder)str).money;
      this.public_key = ((Builder)str).public_key;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1458761223, "Ltbclient/SendGiftAndroid/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1458761223, "Ltbclient/SendGiftAndroid/DataRes;");
          return;
        } 
      } 
    } 
  }
}
