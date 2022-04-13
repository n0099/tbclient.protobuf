import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AndroidBfbSdk;
import tbclient.UserBfbInfo;

public final class UserBfbInfo extends Message {
  public static final Integer DEFAULT_ACTIVITY_STATUS;
  
  public static final String DEFAULT_BFB_URL = "";
  
  public static final String DEFAULT_MASTE_URL = "";
  
  public static final Integer DEFAULT_RES_NO;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer activity_status;
  
  @ProtoField(tag = 5)
  public final AndroidBfbSdk android_bfb_sdk;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String bfb_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String maste_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer res_no;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-103066076, "Ltbclient/UserBfbInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-103066076, "Ltbclient/UserBfbInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ACTIVITY_STATUS = integer;
    DEFAULT_RES_NO = integer;
  }
  
  public UserBfbInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.activity_status;
      if (integer2 == null) {
        this.activity_status = DEFAULT_ACTIVITY_STATUS;
      } else {
        this.activity_status = integer2;
      } 
      String str = paramBuilder.bfb_url;
      if (str == null) {
        this.bfb_url = "";
      } else {
        this.bfb_url = str;
      } 
      str = paramBuilder.maste_url;
      if (str == null) {
        this.maste_url = "";
      } else {
        this.maste_url = str;
      } 
      Integer integer1 = paramBuilder.res_no;
      if (integer1 == null) {
        this.res_no = DEFAULT_RES_NO;
      } else {
        this.res_no = integer1;
      } 
      this.android_bfb_sdk = paramBuilder.android_bfb_sdk;
    } else {
      this.activity_status = paramBuilder.activity_status;
      this.bfb_url = paramBuilder.bfb_url;
      this.maste_url = paramBuilder.maste_url;
      this.res_no = paramBuilder.res_no;
      this.android_bfb_sdk = paramBuilder.android_bfb_sdk;
    } 
  }
}
