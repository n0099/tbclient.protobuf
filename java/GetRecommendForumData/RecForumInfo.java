package GetRecommendForumData;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetRecommendForumData.ThreadList;
import tbclient.ThemeColorInfo;

public final class RecForumInfo extends Message {
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_FORUM_ID = "";
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_FROM = "";
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Boolean DEFAULT_NEED_TRANS;
  
  public static final List<ThreadList> DEFAULT_THREADLIST;
  
  public static final Integer DEFAULT_THREAD_COUNT;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String from;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  @ProtoField(tag = 10, type = Message.Datatype.BOOL)
  public final Boolean need_trans;
  
  @ProtoField(tag = 9)
  public final ThemeColorInfo theme_color;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer thread_count;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<ThreadList> threadlist;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1432081544, "Ltbclient/GetRecommendForumData/RecForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1432081544, "Ltbclient/GetRecommendForumData/RecForumInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_THREAD_COUNT = integer;
    DEFAULT_THREADLIST = Collections.emptyList();
    DEFAULT_NEED_TRANS = Boolean.FALSE;
  }
  
  public RecForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      String str2 = paramBuilder.forum_id;
      if (str2 == null) {
        this.forum_id = "";
      } else {
        this.forum_id = str2;
      } 
      str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      str2 = paramBuilder.avatar;
      if (str2 == null) {
        this.avatar = "";
      } else {
        this.avatar = str2;
      } 
      Integer integer = paramBuilder.member_count;
      if (integer == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer;
      } 
      integer = paramBuilder.thread_count;
      if (integer == null) {
        this.thread_count = DEFAULT_THREAD_COUNT;
      } else {
        this.thread_count = integer;
      } 
      String str1 = paramBuilder.from;
      if (str1 == null) {
        this.from = "";
      } else {
        this.from = str1;
      } 
      List list = paramBuilder.threadlist;
      if (list == null) {
        this.threadlist = DEFAULT_THREADLIST;
      } else {
        this.threadlist = Message.immutableCopyOf(list);
      } 
      this.theme_color = paramBuilder.theme_color;
      bool = paramBuilder.need_trans;
      if (bool == null) {
        this.need_trans = DEFAULT_NEED_TRANS;
      } else {
        this.need_trans = bool;
      } 
    } else {
      this.forum_id = ((Builder)bool).forum_id;
      this.forum_name = ((Builder)bool).forum_name;
      this.avatar = ((Builder)bool).avatar;
      this.member_count = ((Builder)bool).member_count;
      this.thread_count = ((Builder)bool).thread_count;
      this.from = ((Builder)bool).from;
      this.threadlist = Message.immutableCopyOf(((Builder)bool).threadlist);
      this.theme_color = ((Builder)bool).theme_color;
      this.need_trans = ((Builder)bool).need_trans;
    } 
  }
}
