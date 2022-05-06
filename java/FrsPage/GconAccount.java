package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GconAccount extends Message {
  public static final Integer DEFAULT_HAS_ACCOUNT = Integer.valueOf(0);
  
  public static final String DEFAULT_MENU_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer has_account;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String menu_name;
  
  public GconAccount(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.has_account;
      if (integer == null) {
        this.has_account = DEFAULT_HAS_ACCOUNT;
      } else {
        this.has_account = integer;
      } 
      str = paramBuilder.menu_name;
      if (str == null) {
        this.menu_name = "";
      } else {
        this.menu_name = str;
      } 
    } else {
      this.has_account = ((Builder)str).has_account;
      this.menu_name = ((Builder)str).menu_name;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1456090708, "Ltbclient/FrsPage/GconAccount;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1456090708, "Ltbclient/FrsPage/GconAccount;");
          return;
        } 
      } 
    } 
  }
}
