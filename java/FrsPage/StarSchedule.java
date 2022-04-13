package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarSchedule extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public StarSchedule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
      String str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.type = ((Builder)str).type;
      this.desc = ((Builder)str).desc;
      this.url = ((Builder)str).url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1047179663, "Ltbclient/FrsPage/StarSchedule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1047179663, "Ltbclient/FrsPage/StarSchedule;");
          return;
        } 
      } 
    } 
  }
}
