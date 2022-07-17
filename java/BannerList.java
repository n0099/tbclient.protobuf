package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class BannerList extends Message {
  public static Interceptable $ic;
  
  public static final List<App> DEFAULT_APP = Collections.emptyList();
  
  public static final String DEFAULT_APPLIST = "";
  
  public static final List<FeedForumInfo> DEFAULT_FEED_FORUM = Collections.emptyList();
  
  public static final List<App> DEFAULT_VIDEO_RECOMMEND_AD = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<App> app;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String applist;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FeedForumInfo> feed_forum;
  
  @ProtoField(tag = 3)
  public final RecomTopicInfo hot_topic;
  
  @ProtoField(tag = 5)
  public final App pb_banner_ad;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<App> video_recommend_ad;
  
  public BannerList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<App> list;
    if (paramBoolean == true) {
      List<App> list2 = paramBuilder.app;
      if (list2 == null) {
        this.app = DEFAULT_APP;
      } else {
        this.app = Message.immutableCopyOf(list2);
      } 
      List<FeedForumInfo> list1 = paramBuilder.feed_forum;
      if (list1 == null) {
        this.feed_forum = DEFAULT_FEED_FORUM;
      } else {
        this.feed_forum = Message.immutableCopyOf(list1);
      } 
      this.hot_topic = paramBuilder.hot_topic;
      String str = paramBuilder.applist;
      if (str == null) {
        this.applist = "";
      } else {
        this.applist = str;
      } 
      this.pb_banner_ad = paramBuilder.pb_banner_ad;
      list = paramBuilder.video_recommend_ad;
      if (list == null) {
        this.video_recommend_ad = DEFAULT_VIDEO_RECOMMEND_AD;
      } else {
        this.video_recommend_ad = Message.immutableCopyOf(list);
      } 
    } else {
      this.app = Message.immutableCopyOf(((Builder)list).app);
      this.feed_forum = Message.immutableCopyOf(((Builder)list).feed_forum);
      this.hot_topic = ((Builder)list).hot_topic;
      this.applist = ((Builder)list).applist;
      this.pb_banner_ad = ((Builder)list).pb_banner_ad;
      this.video_recommend_ad = Message.immutableCopyOf(((Builder)list).video_recommend_ad);
    } 
  }
  
  public BannerList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-311779225, "Ltbclient/BannerList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-311779225, "Ltbclient/BannerList;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BannerList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<App> app;
    
    public String applist;
    
    public List<FeedForumInfo> feed_forum;
    
    public RecomTopicInfo hot_topic;
    
    public App pb_banner_ad;
    
    public List<App> video_recommend_ad;
    
    public Builder() {}
    
    public Builder(BannerList param1BannerList) {
      super(param1BannerList);
      if (param1BannerList == null)
        return; 
      this.app = Message.copyOf(param1BannerList.app);
      this.feed_forum = Message.copyOf(param1BannerList.feed_forum);
      this.hot_topic = param1BannerList.hot_topic;
      this.applist = param1BannerList.applist;
      this.pb_banner_ad = param1BannerList.pb_banner_ad;
      this.video_recommend_ad = Message.copyOf(param1BannerList.video_recommend_ad);
    }
    
    public BannerList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BannerList)interceptResult.objValue; 
      } 
      return new BannerList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
