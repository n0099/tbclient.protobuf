package ThreadList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdMixFloor;
import tbclient.BannerList;
import tbclient.ThreadInfo;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST;
  
  public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final String DEFAULT_ASP_SHOWN_INFO = "";
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<AdMixFloor> ad_mix_list;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String ad_sample_map_key;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String asp_shown_info;
  
  @ProtoField(tag = 3)
  public final BannerList banner_list;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<User> user_list;
  
  static {
    DEFAULT_AD_MIX_LIST = Collections.emptyList();
    DEFAULT_AD_SHOW_SELECT = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      List list2 = paramBuilder.thread_list;
      if (list2 == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.user_list;
      if (list2 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list2);
      } 
      this.banner_list = paramBuilder.banner_list;
      String str1 = paramBuilder.asp_shown_info;
      if (str1 == null) {
        this.asp_shown_info = "";
      } else {
        this.asp_shown_info = str1;
      } 
      str1 = paramBuilder.partial_visible_toast;
      if (str1 == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str1;
      } 
      List list1 = paramBuilder.ad_mix_list;
      if (list1 == null) {
        this.ad_mix_list = DEFAULT_AD_MIX_LIST;
      } else {
        this.ad_mix_list = Message.immutableCopyOf(list1);
      } 
      Integer integer = paramBuilder.ad_show_select;
      if (integer == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer;
      } 
      str = paramBuilder.ad_sample_map_key;
      if (str == null) {
        this.ad_sample_map_key = "";
      } else {
        this.ad_sample_map_key = str;
      } 
    } else {
      this.thread_list = Message.immutableCopyOf(((Builder)str).thread_list);
      this.user_list = Message.immutableCopyOf(((Builder)str).user_list);
      this.banner_list = ((Builder)str).banner_list;
      this.asp_shown_info = ((Builder)str).asp_shown_info;
      this.partial_visible_toast = ((Builder)str).partial_visible_toast;
      this.ad_mix_list = Message.immutableCopyOf(((Builder)str).ad_mix_list);
      this.ad_show_select = ((Builder)str).ad_show_select;
      this.ad_sample_map_key = ((Builder)str).ad_sample_map_key;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(881483202, "Ltbclient/ThreadList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(881483202, "Ltbclient/ThreadList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
