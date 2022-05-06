package GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetForumDetail.UniversityInfo;

public final class UniversityTabInfo extends Message {
  public static final List<UniversityInfo> DEFAULT_CONTENT = Collections.emptyList();
  
  public static final String DEFAULT_TAB_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<UniversityInfo> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tab_name;
  
  public UniversityTabInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.tab_name;
      if (str == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str;
      } 
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.tab_name = ((Builder)list).tab_name;
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1448101585, "Ltbclient/GetForumDetail/UniversityTabInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1448101585, "Ltbclient/GetForumDetail/UniversityTabInfo;");
          return;
        } 
      } 
    } 
  }
}
