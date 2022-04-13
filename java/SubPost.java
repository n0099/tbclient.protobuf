import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SubPost;
import tbclient.SubPostList;

public final class SubPost extends Message {
  public static final Long DEFAULT_PID = Long.valueOf(0L);
  
  public static final List<SubPostList> DEFAULT_SUB_POST_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long pid;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<SubPostList> sub_post_list;
  
  public SubPost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.pid;
      if (long_ == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_;
      } 
      list = paramBuilder.sub_post_list;
      if (list == null) {
        this.sub_post_list = DEFAULT_SUB_POST_LIST;
      } else {
        this.sub_post_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.pid = ((Builder)list).pid;
      this.sub_post_list = Message.immutableCopyOf(((Builder)list).sub_post_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1819589595, "Ltbclient/SubPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1819589595, "Ltbclient/SubPost;");
          return;
        } 
      } 
    } 
  }
}
