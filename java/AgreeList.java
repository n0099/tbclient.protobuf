import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AgreeList;
import tbclient.Post;
import tbclient.ThreadInfo;
import tbclient.User;

public final class AgreeList extends Message {
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IS_DEL;
  
  public static final Integer DEFAULT_TIME;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 8)
  public final User agreeer;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_del;
  
  @ProtoField(tag = 9)
  public final Post post_info;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1453213819, "Ltbclient/AgreeList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1453213819, "Ltbclient/AgreeList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TIME = integer;
    DEFAULT_IS_DEL = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_ID = Long.valueOf(0L);
  }
  
  public AgreeList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      Integer integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
      integer = paramBuilder.is_del;
      if (integer == null) {
        this.is_del = DEFAULT_IS_DEL;
      } else {
        this.is_del = integer;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      Long long_ = paramBuilder.id;
      if (long_ == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_;
      } 
      this.agreeer = paramBuilder.agreeer;
      this.post_info = paramBuilder.post_info;
    } else {
      this.thread_info = paramBuilder.thread_info;
      this.time = paramBuilder.time;
      this.is_del = paramBuilder.is_del;
      this.type = paramBuilder.type;
      this.id = paramBuilder.id;
      this.agreeer = paramBuilder.agreeer;
      this.post_info = paramBuilder.post_info;
    } 
  }
}
