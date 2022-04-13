package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RealTime extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Long DEFAULT_TASK_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long task_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public RealTime(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.task_id;
      if (long_ == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = long_;
      } 
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.task_id = ((Builder)str).task_id;
      this.icon = ((Builder)str).icon;
      this.url = ((Builder)str).url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-243265075, "Ltbclient/FrsPage/RealTime;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-243265075, "Ltbclient/FrsPage/RealTime;");
          return;
        } 
      } 
    } 
  }
}
