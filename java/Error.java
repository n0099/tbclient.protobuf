import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class Error extends Message {
  public static final String DEFAULT_ERRMSG = "";
  
  public static final Integer DEFAULT_ERRORNO = Integer.valueOf(0);
  
  public static final String DEFAULT_USERMSG = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String errmsg;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer errorno;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String usermsg;
  
  public Error(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.errorno;
      if (integer == null) {
        this.errorno = DEFAULT_ERRORNO;
      } else {
        this.errorno = integer;
      } 
      String str1 = paramBuilder.errmsg;
      if (str1 == null) {
        this.errmsg = "";
      } else {
        this.errmsg = str1;
      } 
      str = paramBuilder.usermsg;
      if (str == null) {
        this.usermsg = "";
      } else {
        this.usermsg = str;
      } 
    } else {
      this.errorno = ((Builder)str).errorno;
      this.errmsg = ((Builder)str).errmsg;
      this.usermsg = ((Builder)str).usermsg;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(234139805, "Ltbclient/Error;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(234139805, "Ltbclient/Error;");
          return;
        } 
      } 
    } 
  }
}
