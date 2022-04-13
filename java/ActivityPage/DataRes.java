package ActivityPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActivityPage.HotTopic;
import tbclient.ActivityPage.RecommendForumList;
import tbclient.ActivityPage.RecommendUserList;
import tbclient.ActivityPage.SpecialColumnList;
import tbclient.BannerImage;
import tbclient.Page;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final List<BannerImage> DEFAULT_BANNER_IMAGE = Collections.emptyList();
  
  public static final List<BannerImage> DEFAULT_GRID = Collections.emptyList();
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BannerImage> banner_image;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<BannerImage> grid;
  
  @ProtoField(tag = 4)
  public final HotTopic hot_topic;
  
  @ProtoField(tag = 8)
  public final Page page_info;
  
  @ProtoField(tag = 6)
  public final RecommendForumList recommend_forum;
  
  @ProtoField(tag = 7)
  public final RecommendUserList recommend_user;
  
  @ProtoField(tag = 5)
  public final SpecialColumnList special_column;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ThreadInfo> thread_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.banner_image;
      if (list == null) {
        this.banner_image = DEFAULT_BANNER_IMAGE;
      } else {
        this.banner_image = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.grid;
      if (list == null) {
        this.grid = DEFAULT_GRID;
      } else {
        this.grid = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.hot_topic = paramBuilder.hot_topic;
      this.special_column = paramBuilder.special_column;
      this.recommend_forum = paramBuilder.recommend_forum;
      this.recommend_user = paramBuilder.recommend_user;
      this.page_info = paramBuilder.page_info;
    } else {
      this.banner_image = Message.immutableCopyOf(paramBuilder.banner_image);
      this.grid = Message.immutableCopyOf(paramBuilder.grid);
      this.thread_list = Message.immutableCopyOf(paramBuilder.thread_list);
      this.hot_topic = paramBuilder.hot_topic;
      this.special_column = paramBuilder.special_column;
      this.recommend_forum = paramBuilder.recommend_forum;
      this.recommend_user = paramBuilder.recommend_user;
      this.page_info = paramBuilder.page_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1291720844, "Ltbclient/ActivityPage/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1291720844, "Ltbclient/ActivityPage/DataRes;");
          return;
        } 
      } 
    } 
  }
}
