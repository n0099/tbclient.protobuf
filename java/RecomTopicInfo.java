import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomTopicInfo;
import tbclient.RecomTopicList;

public final class RecomTopicInfo extends Message {
  public static final String DEFAULT_RECOM_TITLE = "";
  
  public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recom_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecomTopicList> topic_list;
  
  public RecomTopicInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.recom_title;
      if (str == null) {
        this.recom_title = "";
      } else {
        this.recom_title = str;
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.recom_title = ((Builder)list).recom_title;
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-536208318, "Ltbclient/RecomTopicInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-536208318, "Ltbclient/RecomTopicInfo;");
          return;
        } 
      } 
    } 
  }
}
