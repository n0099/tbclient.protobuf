package GetWebviewCacheInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetWebviewCacheInfo.Offpack;

public final class DataRes extends Message {
  public static final String DEFAULT_MD5 = "";
  
  public static final List<Offpack> DEFAULT_OFFPACK_LIST = Collections.emptyList();
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_WEBVIEW_VERSION = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String md5;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<Offpack> offpack_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String webview_version;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.src;
      if (str == null) {
        this.src = "";
      } else {
        this.src = str;
      } 
      str = paramBuilder.webview_version;
      if (str == null) {
        this.webview_version = "";
      } else {
        this.webview_version = str;
      } 
      str = paramBuilder.md5;
      if (str == null) {
        this.md5 = "";
      } else {
        this.md5 = str;
      } 
      list = paramBuilder.offpack_list;
      if (list == null) {
        this.offpack_list = DEFAULT_OFFPACK_LIST;
      } else {
        this.offpack_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.src = ((Builder)list).src;
      this.webview_version = ((Builder)list).webview_version;
      this.md5 = ((Builder)list).md5;
      this.offpack_list = Message.immutableCopyOf(((Builder)list).offpack_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1319158129, "Ltbclient/GetWebviewCacheInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1319158129, "Ltbclient/GetWebviewCacheInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
}
