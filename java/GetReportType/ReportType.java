package GetReportType;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReportType extends Message {
  public static final Integer DEFAULT_TYPE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE_TEXT = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String type_text;
  
  public ReportType(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type_id;
      if (integer == null) {
        this.type_id = DEFAULT_TYPE_ID;
      } else {
        this.type_id = integer;
      } 
      str = paramBuilder.type_text;
      if (str == null) {
        this.type_text = "";
      } else {
        this.type_text = str;
      } 
    } else {
      this.type_id = ((Builder)str).type_id;
      this.type_text = ((Builder)str).type_text;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1018443112, "Ltbclient/GetReportType/ReportType;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1018443112, "Ltbclient/GetReportType/ReportType;");
          return;
        } 
      } 
    } 
  }
}
