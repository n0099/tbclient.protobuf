import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.DealMedia;

public final class DealMedia extends Message {
  public static final String DEFAULT_BIG_PIC = "";
  
  public static final String DEFAULT_SMALL_PIC = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_WATER_PIC = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String big_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String small_pic;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String water_pic;
  
  public DealMedia(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.small_pic;
      if (str1 == null) {
        this.small_pic = "";
      } else {
        this.small_pic = str1;
      } 
      str1 = paramBuilder.big_pic;
      if (str1 == null) {
        this.big_pic = "";
      } else {
        this.big_pic = str1;
      } 
      str = paramBuilder.water_pic;
      if (str == null) {
        this.water_pic = "";
      } else {
        this.water_pic = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.small_pic = ((Builder)str).small_pic;
      this.big_pic = ((Builder)str).big_pic;
      this.water_pic = ((Builder)str).water_pic;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1873998029, "Ltbclient/DealMedia;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1873998029, "Ltbclient/DealMedia;");
          return;
        } 
      } 
    } 
  }
}
