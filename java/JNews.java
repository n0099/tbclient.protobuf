import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.JNews;

public final class JNews extends Message {
  public static final String DEFAULT_FROM = "";
  
  public static final Long DEFAULT_JID = Long.valueOf(0L);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long jid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public JNews(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.jid;
      if (long_ == null) {
        this.jid = DEFAULT_JID;
      } else {
        this.jid = long_;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.from;
      if (str == null) {
        this.from = "";
      } else {
        this.from = str;
      } 
    } else {
      this.jid = ((Builder)str).jid;
      this.url = ((Builder)str).url;
      this.from = ((Builder)str).from;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(343659240, "Ltbclient/JNews;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(343659240, "Ltbclient/JNews;");
          return;
        } 
      } 
    } 
  }
}
