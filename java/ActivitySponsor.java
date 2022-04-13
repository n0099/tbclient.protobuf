import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ActivitySponsor;

public final class ActivitySponsor extends Message {
  public static final Integer DEFAULT_IS_SPONSOR = Integer.valueOf(0);
  
  public static final String DEFAULT_SPONSOR_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_sponsor;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sponsor_url;
  
  public ActivitySponsor(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_sponsor;
      if (integer == null) {
        this.is_sponsor = DEFAULT_IS_SPONSOR;
      } else {
        this.is_sponsor = integer;
      } 
      str = paramBuilder.sponsor_url;
      if (str == null) {
        this.sponsor_url = "";
      } else {
        this.sponsor_url = str;
      } 
    } else {
      this.is_sponsor = ((Builder)str).is_sponsor;
      this.sponsor_url = ((Builder)str).sponsor_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1451814266, "Ltbclient/ActivitySponsor;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1451814266, "Ltbclient/ActivitySponsor;");
          return;
        } 
      } 
    } 
  }
}
