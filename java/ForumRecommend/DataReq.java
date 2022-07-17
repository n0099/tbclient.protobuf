package tbclient.ForumRecommend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_LIKE_FORUM;
  
  public static final Integer DEFAULT_RECOMMEND;
  
  public static final Integer DEFAULT_SORT_TYPE;
  
  public static final Integer DEFAULT_TOPIC;
  
  public static final String DEFAULT_VISIT_HISTORY = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer like_forum;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer recommend;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sort_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer topic;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String visit_history;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1886599919, "Ltbclient/ForumRecommend/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1886599919, "Ltbclient/ForumRecommend/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LIKE_FORUM = integer;
    DEFAULT_TOPIC = integer;
    DEFAULT_RECOMMEND = integer;
    DEFAULT_SORT_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.like_forum;
      if (integer1 == null) {
        this.like_forum = DEFAULT_LIKE_FORUM;
      } else {
        this.like_forum = integer1;
      } 
      integer1 = paramBuilder.topic;
      if (integer1 == null) {
        this.topic = DEFAULT_TOPIC;
      } else {
        this.topic = integer1;
      } 
      integer1 = paramBuilder.recommend;
      if (integer1 == null) {
        this.recommend = DEFAULT_RECOMMEND;
      } else {
        this.recommend = integer1;
      } 
      this.common = paramBuilder.common;
      String str = paramBuilder.visit_history;
      if (str == null) {
        this.visit_history = "";
      } else {
        this.visit_history = str;
      } 
      integer = paramBuilder.sort_type;
      if (integer == null) {
        this.sort_type = DEFAULT_SORT_TYPE;
      } else {
        this.sort_type = integer;
      } 
    } else {
      this.like_forum = ((Builder)integer).like_forum;
      this.topic = ((Builder)integer).topic;
      this.recommend = ((Builder)integer).recommend;
      this.common = ((Builder)integer).common;
      this.visit_history = ((Builder)integer).visit_history;
      this.sort_type = ((Builder)integer).sort_type;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Integer like_forum;
    
    public Integer recommend;
    
    public Integer sort_type;
    
    public Integer topic;
    
    public String visit_history;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.like_forum = param1DataReq.like_forum;
      this.topic = param1DataReq.topic;
      this.recommend = param1DataReq.recommend;
      this.common = param1DataReq.common;
      this.visit_history = param1DataReq.visit_history;
      this.sort_type = param1DataReq.sort_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
