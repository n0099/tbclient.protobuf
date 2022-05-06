import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Abstract;
import tbclient.PostInfoContent;

public final class PostInfoContent extends Message {
  public static final Long DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_IS_AUTHOR_VIEW;
  
  public static final List<Abstract> DEFAULT_POST_CONTENT = Collections.emptyList();
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_POST_TYPE;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long create_time;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_author_view;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Abstract> post_content;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_type;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_CREATE_TIME = long_;
    DEFAULT_POST_TYPE = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_IS_AUTHOR_VIEW = Integer.valueOf(0);
  }
  
  public PostInfoContent(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.post_content;
      if (list == null) {
        this.post_content = DEFAULT_POST_CONTENT;
      } else {
        this.post_content = Message.immutableCopyOf(list);
      } 
      Long long_ = paramBuilder.create_time;
      if (long_ == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = long_;
      } 
      long_ = paramBuilder.post_type;
      if (long_ == null) {
        this.post_type = DEFAULT_POST_TYPE;
      } else {
        this.post_type = long_;
      } 
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      integer = paramBuilder.is_author_view;
      if (integer == null) {
        this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
      } else {
        this.is_author_view = integer;
      } 
    } else {
      this.post_content = Message.immutableCopyOf(((Builder)integer).post_content);
      this.create_time = ((Builder)integer).create_time;
      this.post_type = ((Builder)integer).post_type;
      this.post_id = ((Builder)integer).post_id;
      this.is_author_view = ((Builder)integer).is_author_view;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-716269734, "Ltbclient/PostInfoContent;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-716269734, "Ltbclient/PostInfoContent;");
          return;
        } 
      } 
    } 
  }
}
