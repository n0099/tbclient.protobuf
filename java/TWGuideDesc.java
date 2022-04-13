import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.TWGuideDesc;

public final class TWGuideDesc extends Message {
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_ORDER = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer order;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public TWGuideDesc(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.order;
      if (integer == null) {
        this.order = DEFAULT_ORDER;
      } else {
        this.order = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.order = ((Builder)str).order;
      this.title = ((Builder)str).title;
      this.link = ((Builder)str).link;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(867023579, "Ltbclient/TWGuideDesc;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(867023579, "Ltbclient/TWGuideDesc;");
          return;
        } 
      } 
    } 
  }
}
