import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.YulePostActivity;

public final class YulePostActivity extends Message {
  public static final String DEFAULT_ACTIVITY_BANNER = "";
  
  public static final String DEFAULT_ACTIVITY_BUTTON = "";
  
  public static final String DEFAULT_ACTIVITY_DESC = "";
  
  public static final String DEFAULT_ACTIVITY_URL = "";
  
  public static final Long DEFAULT_END_TIME;
  
  public static final Long DEFAULT_START_TIME;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String activity_banner;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String activity_button;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String activity_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String activity_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long end_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long start_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1236477709, "Ltbclient/YulePostActivity;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1236477709, "Ltbclient/YulePostActivity;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_START_TIME = long_;
    DEFAULT_END_TIME = long_;
  }
  
  public YulePostActivity(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.start_time;
      if (long_ == null) {
        this.start_time = DEFAULT_START_TIME;
      } else {
        this.start_time = long_;
      } 
      long_ = paramBuilder.end_time;
      if (long_ == null) {
        this.end_time = DEFAULT_END_TIME;
      } else {
        this.end_time = long_;
      } 
      String str1 = paramBuilder.activity_banner;
      if (str1 == null) {
        this.activity_banner = "";
      } else {
        this.activity_banner = str1;
      } 
      str1 = paramBuilder.activity_url;
      if (str1 == null) {
        this.activity_url = "";
      } else {
        this.activity_url = str1;
      } 
      str1 = paramBuilder.activity_desc;
      if (str1 == null) {
        this.activity_desc = "";
      } else {
        this.activity_desc = str1;
      } 
      str = paramBuilder.activity_button;
      if (str == null) {
        this.activity_button = "";
      } else {
        this.activity_button = str;
      } 
    } else {
      this.start_time = ((Builder)str).start_time;
      this.end_time = ((Builder)str).end_time;
      this.activity_banner = ((Builder)str).activity_banner;
      this.activity_url = ((Builder)str).activity_url;
      this.activity_desc = ((Builder)str).activity_desc;
      this.activity_button = ((Builder)str).activity_button;
    } 
  }
}
