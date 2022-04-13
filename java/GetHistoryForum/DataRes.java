package GetHistoryForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
import tbclient.HistoryForumInfo;

public final class DataRes extends Message {
  public static final List<HistoryForumInfo> DEFAULT_HISTORY_FORUM = Collections.emptyList();
  
  public static final List<FrsTabInfo> DEFAULT_NAV_TAB_INFO = Collections.emptyList();
  
  public static final List<HistoryForumInfo> DEFAULT_THIS_WEEK_FORUMS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<HistoryForumInfo> history_forum;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<FrsTabInfo> nav_tab_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<HistoryForumInfo> this_week_forums;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      List list1 = paramBuilder.history_forum;
      if (list1 == null) {
        this.history_forum = DEFAULT_HISTORY_FORUM;
      } else {
        this.history_forum = Message.immutableCopyOf(list1);
      } 
      list1 = paramBuilder.nav_tab_info;
      if (list1 == null) {
        this.nav_tab_info = DEFAULT_NAV_TAB_INFO;
      } else {
        this.nav_tab_info = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.this_week_forums;
      if (list == null) {
        this.this_week_forums = DEFAULT_THIS_WEEK_FORUMS;
      } else {
        this.this_week_forums = Message.immutableCopyOf(list);
      } 
    } else {
      this.history_forum = Message.immutableCopyOf(((Builder)list).history_forum);
      this.nav_tab_info = Message.immutableCopyOf(((Builder)list).nav_tab_info);
      this.this_week_forums = Message.immutableCopyOf(((Builder)list).this_week_forums);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1270107493, "Ltbclient/GetHistoryForum/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1270107493, "Ltbclient/GetHistoryForum/DataRes;");
          return;
        } 
      } 
    } 
  }
}
