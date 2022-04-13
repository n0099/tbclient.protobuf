import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FeedForumInfo;

public final class FeedForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Integer DEFAULT_POS;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final String DEFAULT_REASON = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer member_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer pos;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String reason;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_POS = integer;
    DEFAULT_IS_LIKE = integer;
  }
  
  public FeedForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer2 = paramBuilder.member_count;
      if (integer2 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer2;
      } 
      integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      String str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      str1 = paramBuilder.reason;
      if (str1 == null) {
        this.reason = "";
      } else {
        this.reason = str1;
      } 
      Integer integer1 = paramBuilder.pos;
      if (integer1 == null) {
        this.pos = DEFAULT_POS;
      } else {
        this.pos = integer1;
      } 
      integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.member_count = ((Builder)integer).member_count;
      this.post_num = ((Builder)integer).post_num;
      this.avatar = ((Builder)integer).avatar;
      this.reason = ((Builder)integer).reason;
      this.pos = ((Builder)integer).pos;
      this.is_like = ((Builder)integer).is_like;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(513330260, "Ltbclient/FeedForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(513330260, "Ltbclient/FeedForumInfo;");
          return;
        } 
      } 
    } 
  }
}
