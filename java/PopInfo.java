import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PopInfo;

public final class PopInfo extends Message {
  public static final String DEFAULT_AHEAD_INFO = "";
  
  public static final String DEFAULT_AHEAD_URL = "";
  
  public static final Integer DEFAULT_IF_POP = Integer.valueOf(0);
  
  public static final String DEFAULT_OK_INFO = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_V_TITLE = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ahead_info;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ahead_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer if_pop;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ok_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String v_title;
  
  public PopInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.if_pop;
      if (integer == null) {
        this.if_pop = DEFAULT_IF_POP;
      } else {
        this.if_pop = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.v_title;
      if (str1 == null) {
        this.v_title = "";
      } else {
        this.v_title = str1;
      } 
      str1 = paramBuilder.ahead_info;
      if (str1 == null) {
        this.ahead_info = "";
      } else {
        this.ahead_info = str1;
      } 
      str1 = paramBuilder.ahead_url;
      if (str1 == null) {
        this.ahead_url = "";
      } else {
        this.ahead_url = str1;
      } 
      str = paramBuilder.ok_info;
      if (str == null) {
        this.ok_info = "";
      } else {
        this.ok_info = str;
      } 
    } else {
      this.if_pop = ((Builder)str).if_pop;
      this.title = ((Builder)str).title;
      this.v_title = ((Builder)str).v_title;
      this.ahead_info = ((Builder)str).ahead_info;
      this.ahead_url = ((Builder)str).ahead_url;
      this.ok_info = ((Builder)str).ok_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(906160230, "Ltbclient/PopInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(906160230, "Ltbclient/PopInfo;");
          return;
        } 
      } 
    } 
  }
}
