package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class YuleActivity extends Message {
  public static final String DEFAULT_ACTIVITY_ALL_ICON = "";
  
  public static final String DEFAULT_ACTIVITY_HALF_ICON = "";
  
  public static final Long DEFAULT_ACTIVITY_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_ACTIVITY_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String activity_all_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String activity_half_icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long activity_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer activity_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String activity_url;
  
  public YuleActivity(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.activity_id;
      if (long_ == null) {
        this.activity_id = DEFAULT_ACTIVITY_ID;
      } else {
        this.activity_id = long_;
      } 
      Integer integer = paramBuilder.activity_type;
      if (integer == null) {
        this.activity_type = DEFAULT_ACTIVITY_TYPE;
      } else {
        this.activity_type = integer;
      } 
      String str1 = paramBuilder.activity_url;
      if (str1 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str1;
      } 
      str1 = paramBuilder.activity_all_icon;
      if (str1 == null) {
        this.activity_all_icon = "";
      } else {
        this.activity_all_icon = str1;
      } 
      str = paramBuilder.activity_half_icon;
      if (str == null) {
        this.activity_half_icon = "";
      } else {
        this.activity_half_icon = str;
      } 
    } else {
      this.activity_id = ((Builder)str).activity_id;
      this.activity_type = ((Builder)str).activity_type;
      this.activity_url = ((Builder)str).activity_url;
      this.activity_all_icon = ((Builder)str).activity_all_icon;
      this.activity_half_icon = ((Builder)str).activity_half_icon;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-250733516, "Ltbclient/FrsPage/YuleActivity;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-250733516, "Ltbclient/FrsPage/YuleActivity;");
          return;
        } 
      } 
    } 
  }
}
