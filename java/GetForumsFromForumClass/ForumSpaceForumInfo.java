package GetForumsFromForumClass;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumSpaceForumInfo extends Message {
  public static final String DEFAULT_ABSTRACT = "";
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_LIKE_NUM;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_RANK;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String _abstract;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer like_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer rank;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LIKE_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_IS_LIKE = integer;
    DEFAULT_RANK = integer;
  }
  
  public ForumSpaceForumInfo(Builder paramBuilder, boolean paramBoolean) {
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
      str2 = paramBuilder._abstract;
      if (str2 == null) {
        this._abstract = "";
      } else {
        this._abstract = str2;
      } 
      Integer integer2 = paramBuilder.like_num;
      if (integer2 == null) {
        this.like_num = DEFAULT_LIKE_NUM;
      } else {
        this.like_num = integer2;
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
      Integer integer1 = paramBuilder.is_like;
      if (integer1 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer1;
      } 
      integer = paramBuilder.rank;
      if (integer == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this._abstract = ((Builder)integer)._abstract;
      this.like_num = ((Builder)integer).like_num;
      this.post_num = ((Builder)integer).post_num;
      this.avatar = ((Builder)integer).avatar;
      this.is_like = ((Builder)integer).is_like;
      this.rank = ((Builder)integer).rank;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1654927009, "Ltbclient/GetForumsFromForumClass/ForumSpaceForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1654927009, "Ltbclient/GetForumsFromForumClass/ForumSpaceForumInfo;");
          return;
        } 
      } 
    } 
  }
}
