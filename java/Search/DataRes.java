package Search;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final Long DEFAULT_APPLY_ID;
  
  public static final Integer DEFAULT_FORUM_LEVEL;
  
  public static final Boolean DEFAULT_IS_VOTE;
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final Long DEFAULT_TID;
  
  public static final Long DEFAULT_UID;
  
  public static final Integer DEFAULT_VOTE_NUM;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long apply_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer forum_level;
  
  @ProtoField(tag = 5, type = Message.Datatype.BOOL)
  public final Boolean is_vote;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer vote_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1141427426, "Ltbclient/Search/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1141427426, "Ltbclient/Search/DataRes;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_VOTE_NUM = integer;
    DEFAULT_IS_VOTE = Boolean.FALSE;
    DEFAULT_FORUM_LEVEL = integer;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_APPLY_ID = long_;
    DEFAULT_TID = long_;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.uid;
      if (long_2 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_2;
      } 
      String str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      str = paramBuilder.name_show;
      if (str == null) {
        this.name_show = "";
      } else {
        this.name_show = str;
      } 
      Integer integer2 = paramBuilder.vote_num;
      if (integer2 == null) {
        this.vote_num = DEFAULT_VOTE_NUM;
      } else {
        this.vote_num = integer2;
      } 
      Boolean bool = paramBuilder.is_vote;
      if (bool == null) {
        this.is_vote = DEFAULT_IS_VOTE;
      } else {
        this.is_vote = bool;
      } 
      Integer integer1 = paramBuilder.forum_level;
      if (integer1 == null) {
        this.forum_level = DEFAULT_FORUM_LEVEL;
      } else {
        this.forum_level = integer1;
      } 
      integer1 = paramBuilder.agree_num;
      if (integer1 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer1;
      } 
      integer1 = paramBuilder.thread_num;
      if (integer1 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer1;
      } 
      integer1 = paramBuilder.post_num;
      if (integer1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer1;
      } 
      Long long_1 = paramBuilder.apply_id;
      if (long_1 == null) {
        this.apply_id = DEFAULT_APPLY_ID;
      } else {
        this.apply_id = long_1;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
    } else {
      this.uid = ((Builder)long_).uid;
      this.portrait = ((Builder)long_).portrait;
      this.name_show = ((Builder)long_).name_show;
      this.vote_num = ((Builder)long_).vote_num;
      this.is_vote = ((Builder)long_).is_vote;
      this.forum_level = ((Builder)long_).forum_level;
      this.agree_num = ((Builder)long_).agree_num;
      this.thread_num = ((Builder)long_).thread_num;
      this.post_num = ((Builder)long_).post_num;
      this.apply_id = ((Builder)long_).apply_id;
      this.tid = ((Builder)long_).tid;
    } 
  }
}
