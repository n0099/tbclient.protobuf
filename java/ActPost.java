import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActHot;
import tbclient.ActPost;
import tbclient.LinkInfo;

public final class ActPost extends Message {
  public static final List<ActHot> DEFAULT_ACT_HOT = Collections.emptyList();
  
  public static final List<LinkInfo> DEFAULT_LINK_INFO = Collections.emptyList();
  
  public static final String DEFAULT_LIST_HEAD = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ActHot> act_hot;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<LinkInfo> link_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String list_head;
  
  public ActPost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.act_hot;
      if (list1 == null) {
        this.act_hot = DEFAULT_ACT_HOT;
      } else {
        this.act_hot = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.list_head;
      if (str == null) {
        this.list_head = "";
      } else {
        this.list_head = str;
      } 
      list = paramBuilder.link_info;
      if (list == null) {
        this.link_info = DEFAULT_LINK_INFO;
      } else {
        this.link_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.act_hot = Message.immutableCopyOf(((Builder)list).act_hot);
      this.list_head = ((Builder)list).list_head;
      this.link_info = Message.immutableCopyOf(((Builder)list).link_info);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1405276909, "Ltbclient/ActPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1405276909, "Ltbclient/ActPost;");
          return;
        } 
      } 
    } 
  }
}
