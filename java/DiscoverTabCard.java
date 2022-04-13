import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DiscoverTabCard;
import tbclient.RecommendForumInfo;

public final class DiscoverTabCard extends Message {
  public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
  
  public static final Boolean DEFAULT_IS_SHOW_ORDER_NUMBER = Boolean.FALSE;
  
  public static final String DEFAULT_JUMP_NAME = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecommendForumInfo> forum_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.BOOL)
  public final Boolean is_show_order_number;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  public DiscoverTabCard(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      List list = paramBuilder.forum_list;
      if (list == null) {
        this.forum_list = DEFAULT_FORUM_LIST;
      } else {
        this.forum_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.jump_name;
      if (str1 == null) {
        this.jump_name = "";
      } else {
        this.jump_name = str1;
      } 
      bool = paramBuilder.is_show_order_number;
      if (bool == null) {
        this.is_show_order_number = DEFAULT_IS_SHOW_ORDER_NUMBER;
      } else {
        this.is_show_order_number = bool;
      } 
    } else {
      this.name = ((Builder)bool).name;
      this.forum_list = Message.immutableCopyOf(((Builder)bool).forum_list);
      this.jump_name = ((Builder)bool).jump_name;
      this.is_show_order_number = ((Builder)bool).is_show_order_number;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-824798071, "Ltbclient/DiscoverTabCard;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-824798071, "Ltbclient/DiscoverTabCard;");
          return;
        } 
      } 
    } 
  }
}
