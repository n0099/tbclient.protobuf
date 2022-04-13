import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbTopAgreePost;
import tbclient.Post;

public final class PbTopAgreePost extends Message {
  public static final String DEFAULT_FORUM_TOP_LIST = "";
  
  public static final List<Long> DEFAULT_POST_ID_LIST;
  
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String forum_top_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
  public final List<Long> post_id_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Post> post_list;
  
  static {
    DEFAULT_POST_ID_LIST = Collections.emptyList();
  }
  
  public PbTopAgreePost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      List list = paramBuilder.post_list;
      if (list == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.post_id_list;
      if (list == null) {
        this.post_id_list = DEFAULT_POST_ID_LIST;
      } else {
        this.post_id_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.forum_top_list;
      if (str == null) {
        this.forum_top_list = "";
      } else {
        this.forum_top_list = str;
      } 
    } else {
      this.post_list = Message.immutableCopyOf(((Builder)str).post_list);
      this.post_id_list = Message.immutableCopyOf(((Builder)str).post_id_list);
      this.forum_top_list = ((Builder)str).forum_top_list;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2011550584, "Ltbclient/PbTopAgreePost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2011550584, "Ltbclient/PbTopAgreePost;");
          return;
        } 
      } 
    } 
  }
}
