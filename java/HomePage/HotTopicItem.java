package tbclient.HomePage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotTopicItem extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_TOPIC_DISCUSS_NUM;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long topic_discuss_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1995094223, "Ltbclient/HomePage/HotTopicItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1995094223, "Ltbclient/HomePage/HotTopicItem;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_TOPIC_DISCUSS_NUM = long_;
  }
  
  public HotTopicItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.topic_id;
      if (long_1 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_1;
      } 
      String str = paramBuilder.topic_name;
      if (str == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str;
      } 
      long_ = paramBuilder.topic_discuss_num;
      if (long_ == null) {
        this.topic_discuss_num = DEFAULT_TOPIC_DISCUSS_NUM;
      } else {
        this.topic_discuss_num = long_;
      } 
    } else {
      this.topic_id = ((Builder)long_).topic_id;
      this.topic_name = ((Builder)long_).topic_name;
      this.topic_discuss_num = ((Builder)long_).topic_discuss_num;
    } 
  }
  
  public HotTopicItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotTopicItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long topic_discuss_num;
    
    public Long topic_id;
    
    public String topic_name;
    
    public Builder() {}
    
    public Builder(HotTopicItem param1HotTopicItem) {
      super(param1HotTopicItem);
      if (param1HotTopicItem == null)
        return; 
      this.topic_id = param1HotTopicItem.topic_id;
      this.topic_name = param1HotTopicItem.topic_name;
      this.topic_discuss_num = param1HotTopicItem.topic_discuss_num;
    }
    
    public HotTopicItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HotTopicItem)interceptResult.objValue; 
      } 
      return new HotTopicItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
