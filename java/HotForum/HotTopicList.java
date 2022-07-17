package tbclient.HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotTopicList extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_DISCUSS_NUM;
  
  public static final Integer DEFAULT_TAG;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long discuss_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer tag;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(849530602, "Ltbclient/HotForum/HotTopicList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(849530602, "Ltbclient/HotForum/HotTopicList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_DISCUSS_NUM = long_;
    DEFAULT_TAG = integer;
  }
  
  public HotTopicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.topic_id;
      if (long_2 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_2;
      } 
      String str = paramBuilder.topic_name;
      if (str == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      Long long_1 = paramBuilder.discuss_num;
      if (long_1 == null) {
        this.discuss_num = DEFAULT_DISCUSS_NUM;
      } else {
        this.discuss_num = long_1;
      } 
      integer = paramBuilder.tag;
      if (integer == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer;
      } 
    } else {
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_name = ((Builder)integer).topic_name;
      this.type = ((Builder)integer).type;
      this.discuss_num = ((Builder)integer).discuss_num;
      this.tag = ((Builder)integer).tag;
    } 
  }
  
  public HotTopicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotTopicList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long discuss_num;
    
    public Integer tag;
    
    public Long topic_id;
    
    public String topic_name;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(HotTopicList param1HotTopicList) {
      super(param1HotTopicList);
      if (param1HotTopicList == null)
        return; 
      this.topic_id = param1HotTopicList.topic_id;
      this.topic_name = param1HotTopicList.topic_name;
      this.type = param1HotTopicList.type;
      this.discuss_num = param1HotTopicList.discuss_num;
      this.tag = param1HotTopicList.tag;
    }
    
    public HotTopicList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HotTopicList)interceptResult.objValue; 
      } 
      return new HotTopicList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
