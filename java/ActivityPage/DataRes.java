package tbclient.ActivityPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.Page;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<BannerImage> DEFAULT_BANNER_IMAGE = Collections.emptyList();
  
  public static final List<BannerImage> DEFAULT_GRID = Collections.emptyList();
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
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
    super(paramBuilder);
    if (paramBoolean == true) {
      List<BannerImage> list1 = paramBuilder.banner_image;
      if (list1 == null) {
        this.banner_image = DEFAULT_BANNER_IMAGE;
      } else {
        this.banner_image = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.grid;
      if (list1 == null) {
        this.grid = DEFAULT_GRID;
      } else {
        this.grid = Message.immutableCopyOf(list1);
      } 
      List<ThreadInfo> list = paramBuilder.thread_list;
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
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<BannerImage> banner_image;
    
    public List<BannerImage> grid;
    
    public HotTopic hot_topic;
    
    public Page page_info;
    
    public RecommendForumList recommend_forum;
    
    public RecommendUserList recommend_user;
    
    public SpecialColumnList special_column;
    
    public List<ThreadInfo> thread_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.banner_image = Message.copyOf(param1DataRes.banner_image);
      this.grid = Message.copyOf(param1DataRes.grid);
      this.thread_list = Message.copyOf(param1DataRes.thread_list);
      this.hot_topic = param1DataRes.hot_topic;
      this.special_column = param1DataRes.special_column;
      this.recommend_forum = param1DataRes.recommend_forum;
      this.recommend_user = param1DataRes.recommend_user;
      this.page_info = param1DataRes.page_info;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
