package GeneralTabList;

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
import tbclient.App;
import tbclient.ItemInfo;
import tbclient.SortOption;
import tbclient.SportPageHeadInfo;
import tbclient.SportScheduleInfo;
import tbclient.ThreadInfo;
import tbclient.User;

public final class DataRes extends Message {
  public static final List<AdMixFloor> DEFAULT_AD_MIX_LIST;
  
  public static final String DEFAULT_AD_SAMPLE_MAP_KEY = "";
  
  public static final Integer DEFAULT_AD_SHOW_SELECT;
  
  public static final List<App> DEFAULT_APP_LIST;
  
  public static final List<ThreadInfo> DEFAULT_GENERAL_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_NEW_THREAD_NUM;
  
  public static final List<SortOption> DEFAULT_SORT_OPTION;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 12)
  public final List<AdMixFloor> ad_mix_list;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String ad_sample_map_key;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer ad_show_select;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 10)
  public final List<App> app_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> general_list;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 8)
  public final ItemInfo item_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer new_thread_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 9)
  public final List<SortOption> sort_option;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 5)
  public final SportPageHeadInfo sport_head_info;
  
  @ProtoField(tag = 4)
  public final SportScheduleInfo sport_schedule_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<User> user_list;
  
  static {
    DEFAULT_NEW_THREAD_NUM = integer;
    DEFAULT_SORT_TYPE = integer;
    DEFAULT_SORT_OPTION = Collections.emptyList();
    DEFAULT_APP_LIST = Collections.emptyList();
    DEFAULT_AD_SHOW_SELECT = integer;
    DEFAULT_AD_MIX_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      List list4 = paramBuilder.general_list;
      if (list4 == null) {
        this.general_list = DEFAULT_GENERAL_LIST;
      } else {
        this.general_list = Message.immutableCopyOf(list4);
      } 
      Integer integer3 = paramBuilder.has_more;
      if (integer3 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer3;
      } 
      List list3 = paramBuilder.user_list;
      if (list3 == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list3);
      } 
      this.sport_schedule_info = paramBuilder.sport_schedule_info;
      this.sport_head_info = paramBuilder.sport_head_info;
      Integer integer2 = paramBuilder.new_thread_num;
      if (integer2 == null) {
        this.new_thread_num = DEFAULT_NEW_THREAD_NUM;
      } else {
        this.new_thread_num = integer2;
      } 
      integer2 = paramBuilder.sort_type;
      if (integer2 == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer2;
      } 
      this.item_info = paramBuilder.item_info;
      List list2 = paramBuilder.sort_option;
      if (list2 == null) {
        this.sort_option = DEFAULT_SORT_OPTION;
      } else {
        this.sort_option = Message.immutableCopyOf(list2);
      } 
      list2 = paramBuilder.app_list;
      if (list2 == null) {
        this.app_list = DEFAULT_APP_LIST;
      } else {
        this.app_list = Message.immutableCopyOf(list2);
      } 
      Integer integer1 = paramBuilder.ad_show_select;
      if (integer1 == null) {
        this.ad_show_select = DEFAULT_AD_SHOW_SELECT;
      } else {
        this.ad_show_select = integer1;
      } 
      List list1 = paramBuilder.ad_mix_list;
      if (list1 == null) {
        this.ad_mix_list = DEFAULT_AD_MIX_LIST;
      } else {
        this.ad_mix_list = Message.immutableCopyOf(list1);
      } 
      str = paramBuilder.ad_sample_map_key;
      if (str == null) {
        this.ad_sample_map_key = "";
      } else {
        this.ad_sample_map_key = str;
      } 
    } else {
      this.general_list = Message.immutableCopyOf(((Builder)str).general_list);
      this.has_more = ((Builder)str).has_more;
      this.user_list = Message.immutableCopyOf(((Builder)str).user_list);
      this.sport_schedule_info = ((Builder)str).sport_schedule_info;
      this.sport_head_info = ((Builder)str).sport_head_info;
      this.new_thread_num = ((Builder)str).new_thread_num;
      this.sort_type = ((Builder)str).sort_type;
      this.item_info = ((Builder)str).item_info;
      this.sort_option = Message.immutableCopyOf(((Builder)str).sort_option);
      this.app_list = Message.immutableCopyOf(((Builder)str).app_list);
      this.ad_show_select = ((Builder)str).ad_show_select;
      this.ad_mix_list = Message.immutableCopyOf(((Builder)str).ad_mix_list);
      this.ad_sample_map_key = ((Builder)str).ad_sample_map_key;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1617356831, "Ltbclient/GeneralTabList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1617356831, "Ltbclient/GeneralTabList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
  }
}
