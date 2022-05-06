import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ForumMemberInfo;
import tbclient.User;

public final class ForumMemberInfo extends Message {
  public static final List<User> DEFAULT_MEMBER_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOTAL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> member_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String total;
  
  public ForumMemberInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.total;
      if (str == null) {
        this.total = "";
      } else {
        this.total = str;
      } 
      str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.member_list;
      if (list == null) {
        this.member_list = DEFAULT_MEMBER_LIST;
      } else {
        this.member_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.total = ((Builder)list).total;
      this.title = ((Builder)list).title;
      this.member_list = Message.immutableCopyOf(((Builder)list).member_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1622054876, "Ltbclient/ForumMemberInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1622054876, "Ltbclient/ForumMemberInfo;");
          return;
        } 
      } 
    } 
  }
}
