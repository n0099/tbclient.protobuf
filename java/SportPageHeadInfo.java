import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.SportPageHeadInfo;

public final class SportPageHeadInfo extends Message {
  public static final String DEFAULT_HEAD_URL = "";
  
  public static final Integer DEFAULT_IS_AD = Integer.valueOf(0);
  
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String head_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_ad;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  public SportPageHeadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.head_url;
      if (str1 == null) {
        this.head_url = "";
      } else {
        this.head_url = str1;
      } 
      Integer integer = paramBuilder.is_ad;
      if (integer == null) {
        this.is_ad = DEFAULT_IS_AD;
      } else {
        this.is_ad = integer;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.head_url = ((Builder)str).head_url;
      this.is_ad = ((Builder)str).is_ad;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1824357164, "Ltbclient/SportPageHeadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1824357164, "Ltbclient/SportPageHeadInfo;");
          return;
        } 
      } 
    } 
  }
}
