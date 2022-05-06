import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TailInfo;

public final class TailInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON_LINK = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_TAIL_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tail_type;
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tail_type;
      if (integer == null) {
        this.tail_type = DEFAULT_TAIL_TYPE;
      } else {
        this.tail_type = integer;
      } 
      String str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str1 = paramBuilder.icon_link;
      if (str1 == null) {
        this.icon_link = "";
      } else {
        this.icon_link = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.tail_type = ((Builder)str).tail_type;
      this.icon_url = ((Builder)str).icon_url;
      this.icon_link = ((Builder)str).icon_link;
      this.content = ((Builder)str).content;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-192705229, "Ltbclient/TailInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-192705229, "Ltbclient/TailInfo;");
          return;
        } 
      } 
    } 
  }
}
