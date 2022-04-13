package LoadMon;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResignRule extends Message {
  public static final Integer DEFAULT_CARD_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_RANGE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer card_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String range;
  
  public ResignRule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.range;
      if (str == null) {
        this.range = "";
      } else {
        this.range = str;
      } 
      integer = paramBuilder.card_num;
      if (integer == null) {
        this.card_num = DEFAULT_CARD_NUM;
      } else {
        this.card_num = integer;
      } 
    } else {
      this.range = ((Builder)integer).range;
      this.card_num = ((Builder)integer).card_num;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1623530852, "Ltbclient/LoadMon/ResignRule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1623530852, "Ltbclient/LoadMon/ResignRule;");
          return;
        } 
      } 
    } 
  }
}
