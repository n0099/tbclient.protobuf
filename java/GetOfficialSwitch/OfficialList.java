package GetOfficialSwitch;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OfficialList extends Message {
  public static final Integer DEFAULT_IS_ON;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_on;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  static {
    DEFAULT_IS_ON = Integer.valueOf(0);
  }
  
  public OfficialList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      integer = paramBuilder.is_on;
      if (integer == null) {
        this.is_on = DEFAULT_IS_ON;
      } else {
        this.is_on = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.name = ((Builder)integer).name;
      this.is_on = ((Builder)integer).is_on;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1273196722, "Ltbclient/GetOfficialSwitch/OfficialList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1273196722, "Ltbclient/GetOfficialSwitch/OfficialList;");
          return;
        } 
      } 
    } 
  }
}
