import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LinkThreadContent;
import tbclient.LinkThreadInfo;

public final class LinkThreadInfo extends Message {
  public static final List<LinkThreadContent> DEFAULT_LINK_CONTENT = Collections.emptyList();
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_LINK_URL_CODE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<LinkThreadContent> link_content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String link_url_code;
  
  public LinkThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.link_url;
      if (str == null) {
        this.link_url = "";
      } else {
        this.link_url = str;
      } 
      str = paramBuilder.link_url_code;
      if (str == null) {
        this.link_url_code = "";
      } else {
        this.link_url_code = str;
      } 
      list = paramBuilder.link_content;
      if (list == null) {
        this.link_content = DEFAULT_LINK_CONTENT;
      } else {
        this.link_content = Message.immutableCopyOf(list);
      } 
    } else {
      this.link_url = ((Builder)list).link_url;
      this.link_url_code = ((Builder)list).link_url_code;
      this.link_content = Message.immutableCopyOf(((Builder)list).link_content);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1723713825, "Ltbclient/LinkThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1723713825, "Ltbclient/LinkThreadInfo;");
          return;
        } 
      } 
    } 
  }
}
