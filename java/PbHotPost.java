import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.HotPost;
import tbclient.PbHotPost;
import tbclient.Post;

public final class PbHotPost extends Message {
  public static final List<HotPost> DEFAULT_HOT_POST_LIST;
  
  public static final Integer DEFAULT_NEED_HOT_POST;
  
  public static final Integer DEFAULT_NEED_POST_ZAN;
  
  public static final List<Post> DEFAULT_POST_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<HotPost> hot_post_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer need_hot_post;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer need_post_zan;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Post> post_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_NEED_HOT_POST = integer;
    DEFAULT_NEED_POST_ZAN = integer;
    DEFAULT_HOT_POST_LIST = Collections.emptyList();
  }
  
  public PbHotPost(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.post_list;
      if (list1 == null) {
        this.post_list = DEFAULT_POST_LIST;
      } else {
        this.post_list = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder.need_hot_post;
      if (integer == null) {
        this.need_hot_post = DEFAULT_NEED_HOT_POST;
      } else {
        this.need_hot_post = integer;
      } 
      integer = paramBuilder.need_post_zan;
      if (integer == null) {
        this.need_post_zan = DEFAULT_NEED_POST_ZAN;
      } else {
        this.need_post_zan = integer;
      } 
      list = paramBuilder.hot_post_list;
      if (list == null) {
        this.hot_post_list = DEFAULT_HOT_POST_LIST;
      } else {
        this.hot_post_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.post_list = Message.immutableCopyOf(((Builder)list).post_list);
      this.need_hot_post = ((Builder)list).need_hot_post;
      this.need_post_zan = ((Builder)list).need_post_zan;
      this.hot_post_list = Message.immutableCopyOf(((Builder)list).hot_post_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-512328758, "Ltbclient/PbHotPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-512328758, "Ltbclient/PbHotPost;");
          return;
        } 
      } 
    } 
  }
}
