package tbclient.HotThreadList;

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
import tbclient.RecomTopicList;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<FrsTabInfo> DEFAULT_HOT_THREAD_TAB_INFO;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_INFO;
  
  public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<FrsTabInfo> hot_thread_tab_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_info;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RecomTopicList> topic_list;
  
  static {
    DEFAULT_THREAD_INFO = Collections.emptyList();
    DEFAULT_HOT_THREAD_TAB_INFO = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FrsTabInfo> list;
    if (paramBoolean == true) {
      List<RecomTopicList> list2 = paramBuilder.topic_list;
      if (list2 == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list2);
      } 
      List<ThreadInfo> list1 = paramBuilder.thread_info;
      if (list1 == null) {
        this.thread_info = DEFAULT_THREAD_INFO;
      } else {
        this.thread_info = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.hot_thread_tab_info;
      if (list == null) {
        this.hot_thread_tab_info = DEFAULT_HOT_THREAD_TAB_INFO;
      } else {
        this.hot_thread_tab_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
      this.thread_info = Message.immutableCopyOf(((Builder)list).thread_info);
      this.hot_thread_tab_info = Message.immutableCopyOf(((Builder)list).hot_thread_tab_info);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1866146103, "Ltbclient/HotThreadList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1866146103, "Ltbclient/HotThreadList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<FrsTabInfo> hot_thread_tab_info;
    
    public List<ThreadInfo> thread_info;
    
    public List<RecomTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.topic_list = Message.copyOf(param1DataRes.topic_list);
      this.thread_info = Message.copyOf(param1DataRes.thread_info);
      this.hot_thread_tab_info = Message.copyOf(param1DataRes.hot_thread_tab_info);
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
