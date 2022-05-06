import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AddPostList;
import tbclient.SubPostList;

public final class AddPostList extends Message {
  public static final List<SubPostList> DEFAULT_ADD_POST_LIST;
  
  public static final Long DEFAULT_PID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_TOTAL_COUNT;
  
  public static final Integer DEFAULT_TOTAL_NUM;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<SubPostList> add_post_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long pid;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer total_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer total_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TOTAL_NUM = integer;
    DEFAULT_TOTAL_COUNT = integer;
    DEFAULT_ADD_POST_LIST = Collections.emptyList();
  }
  
  public AddPostList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.pid;
      if (long_ == null) {
        this.pid = DEFAULT_PID;
      } else {
        this.pid = long_;
      } 
      Integer integer = paramBuilder.total_num;
      if (integer == null) {
        this.total_num = DEFAULT_TOTAL_NUM;
      } else {
        this.total_num = integer;
      } 
      integer = paramBuilder.total_count;
      if (integer == null) {
        this.total_count = DEFAULT_TOTAL_COUNT;
      } else {
        this.total_count = integer;
      } 
      list = paramBuilder.add_post_list;
      if (list == null) {
        this.add_post_list = DEFAULT_ADD_POST_LIST;
      } else {
        this.add_post_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.pid = ((Builder)list).pid;
      this.total_num = ((Builder)list).total_num;
      this.total_count = ((Builder)list).total_count;
      this.add_post_list = Message.immutableCopyOf(((Builder)list).add_post_list);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(307827942, "Ltbclient/AddPostList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(307827942, "Ltbclient/AddPostList;");
          return;
        } 
      } 
    } 
  }
}
