import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Abstract;

public final class Abstract extends Message {
  public static final String DEFAULT_DURING_TIME = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_UN = "";
  
  public static final String DEFAULT_VOICE_MD5 = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String during_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String un;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String voice_md5;
  
  public Abstract(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.src;
      if (str1 == null) {
        this.src = "";
      } else {
        this.src = str1;
      } 
      str1 = paramBuilder.un;
      if (str1 == null) {
        this.un = "";
      } else {
        this.un = str1;
      } 
      str1 = paramBuilder.during_time;
      if (str1 == null) {
        this.during_time = "";
      } else {
        this.during_time = str1;
      } 
      str = paramBuilder.voice_md5;
      if (str == null) {
        this.voice_md5 = "";
      } else {
        this.voice_md5 = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.text = ((Builder)str).text;
      this.link = ((Builder)str).link;
      this.src = ((Builder)str).src;
      this.un = ((Builder)str).un;
      this.during_time = ((Builder)str).during_time;
      this.voice_md5 = ((Builder)str).voice_md5;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2083611311, "Ltbclient/Abstract;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2083611311, "Ltbclient/Abstract;");
          return;
        } 
      } 
    } 
  }
}
