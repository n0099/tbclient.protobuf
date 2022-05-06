package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleUser;

public final class AgreeBanner extends Message {
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final List<SimpleUser> DEFAULT_TOP_AGREE_USER = Collections.emptyList();
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<SimpleUser> top_agree_user;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public AgreeBanner(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.icon_url;
      if (str == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      list = paramBuilder.top_agree_user;
      if (list == null) {
        this.top_agree_user = DEFAULT_TOP_AGREE_USER;
      } else {
        this.top_agree_user = Message.immutableCopyOf(list);
      } 
    } else {
      this.text = ((Builder)list).text;
      this.icon_url = ((Builder)list).icon_url;
      this.url = ((Builder)list).url;
      this.top_agree_user = Message.immutableCopyOf(((Builder)list).top_agree_user);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(999603046, "Ltbclient/FrsPage/AgreeBanner;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(999603046, "Ltbclient/FrsPage/AgreeBanner;");
          return;
        } 
      } 
    } 
  }
}
