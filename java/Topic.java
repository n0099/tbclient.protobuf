import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Topic;

public final class Topic extends Message {
  public static final Integer DEFAULT_IS_LPOST;
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_TOPIC_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_lpost;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer topic_type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(660740694, "Ltbclient/Topic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(660740694, "Ltbclient/Topic;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LPOST = integer;
    DEFAULT_TOPIC_TYPE = integer;
  }
  
  public Topic(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_lpost;
      if (integer == null) {
        this.is_lpost = DEFAULT_IS_LPOST;
      } else {
        this.is_lpost = integer;
      } 
      integer = paramBuilder.topic_type;
      if (integer == null) {
        this.topic_type = DEFAULT_TOPIC_TYPE;
      } else {
        this.topic_type = integer;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.is_lpost = ((Builder)str).is_lpost;
      this.topic_type = ((Builder)str).topic_type;
      this.link = ((Builder)str).link;
    } 
  }
}
