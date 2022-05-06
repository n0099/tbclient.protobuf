package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsPage.Forum;
import tbclient.FrsPage.RankInfo;

public final class SignForum extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_IS_FILTER;
  
  public static final Integer DEFAULT_IS_ON;
  
  public static final String DEFAULT_LEVEL1_DIR_NAME = "";
  
  public static final String DEFAULT_LEVEL2_DIR_NAME = "";
  
  @ProtoField(tag = 4)
  public final RankInfo current_rank_info;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3)
  public final Forum forum_info;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_filter;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_on;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String level1_dir_name;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String level2_dir_name;
  
  @ProtoField(tag = 9)
  public final RankInfo monthly_rank_info;
  
  @ProtoField(tag = 6)
  public final RankInfo weekly_rank_info;
  
  @ProtoField(tag = 5)
  public final RankInfo yesterday_rank_info;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1164186938, "Ltbclient/FrsPage/SignForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1164186938, "Ltbclient/FrsPage/SignForum;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_ON = integer;
    DEFAULT_IS_FILTER = integer;
    DEFAULT_FORUM_ID = Long.valueOf(0L);
  }
  
  public SignForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_on;
      if (integer == null) {
        this.is_on = DEFAULT_IS_ON;
      } else {
        this.is_on = integer;
      } 
      integer = paramBuilder.is_filter;
      if (integer == null) {
        this.is_filter = DEFAULT_IS_FILTER;
      } else {
        this.is_filter = integer;
      } 
      this.forum_info = paramBuilder.forum_info;
      this.current_rank_info = paramBuilder.current_rank_info;
      this.yesterday_rank_info = paramBuilder.yesterday_rank_info;
      this.weekly_rank_info = paramBuilder.weekly_rank_info;
      String str = paramBuilder.level1_dir_name;
      if (str == null) {
        this.level1_dir_name = "";
      } else {
        this.level1_dir_name = str;
      } 
      str = paramBuilder.level2_dir_name;
      if (str == null) {
        this.level2_dir_name = "";
      } else {
        this.level2_dir_name = str;
      } 
      this.monthly_rank_info = paramBuilder.monthly_rank_info;
      long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
    } else {
      this.is_on = ((Builder)long_).is_on;
      this.is_filter = ((Builder)long_).is_filter;
      this.forum_info = ((Builder)long_).forum_info;
      this.current_rank_info = ((Builder)long_).current_rank_info;
      this.yesterday_rank_info = ((Builder)long_).yesterday_rank_info;
      this.weekly_rank_info = ((Builder)long_).weekly_rank_info;
      this.level1_dir_name = ((Builder)long_).level1_dir_name;
      this.level2_dir_name = ((Builder)long_).level2_dir_name;
      this.monthly_rank_info = ((Builder)long_).monthly_rank_info;
      this.forum_id = ((Builder)long_).forum_id;
    } 
  }
}
