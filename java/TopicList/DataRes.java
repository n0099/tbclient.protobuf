package tbclient.TopicList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<TopicList> DEFAULT_FRS_TAB_TOPIC;
  
  public static final List<TabList> DEFAULT_TAB_LIST = Collections.emptyList();
  
  public static final List<NewTopicList> DEFAULT_TOPIC_LIST;
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<TopicList> frs_tab_topic;
  
  @ProtoField(tag = 3)
  public final MediaTopic media_topic;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6)
  public final List<TabList> tab_list;
  
  @ProtoField(tag = 1)
  public final TopicListModule topic_bang;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<NewTopicList> topic_list;
  
  @ProtoField(tag = 2)
  public final TopicListModule topic_manual;
  
  static {
    DEFAULT_FRS_TAB_TOPIC = Collections.emptyList();
    DEFAULT_TOPIC_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<NewTopicList> list;
    if (paramBoolean == true) {
      this.topic_bang = paramBuilder.topic_bang;
      this.topic_manual = paramBuilder.topic_manual;
      this.media_topic = paramBuilder.media_topic;
      List<TabList> list2 = paramBuilder.tab_list;
      if (list2 == null) {
        this.tab_list = DEFAULT_TAB_LIST;
      } else {
        this.tab_list = Message.immutableCopyOf(list2);
      } 
      List<TopicList> list1 = paramBuilder.frs_tab_topic;
      if (list1 == null) {
        this.frs_tab_topic = DEFAULT_FRS_TAB_TOPIC;
      } else {
        this.frs_tab_topic = Message.immutableCopyOf(list1);
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.topic_bang = ((Builder)list).topic_bang;
      this.topic_manual = ((Builder)list).topic_manual;
      this.media_topic = ((Builder)list).media_topic;
      this.tab_list = Message.immutableCopyOf(((Builder)list).tab_list);
      this.frs_tab_topic = Message.immutableCopyOf(((Builder)list).frs_tab_topic);
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-860898735, "Ltbclient/TopicList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-860898735, "Ltbclient/TopicList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<TopicList> frs_tab_topic;
    
    public MediaTopic media_topic;
    
    public List<TabList> tab_list;
    
    public TopicListModule topic_bang;
    
    public List<NewTopicList> topic_list;
    
    public TopicListModule topic_manual;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.topic_bang = param1DataRes.topic_bang;
      this.topic_manual = param1DataRes.topic_manual;
      this.media_topic = param1DataRes.media_topic;
      this.tab_list = Message.copyOf(param1DataRes.tab_list);
      this.frs_tab_topic = Message.copyOf(param1DataRes.frs_tab_topic);
      this.topic_list = Message.copyOf(param1DataRes.topic_list);
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
