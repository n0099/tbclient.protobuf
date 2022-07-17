package tbclient.StarTrends;

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
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Long DEFAULT_LAST_THREAD_ID;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long last_thread_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer q_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scr_w;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1147645924, "Ltbclient/StarTrends/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1147645924, "Ltbclient/StarTrends/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_LAST_THREAD_ID = long_;
    DEFAULT_RN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.scr_w;
      if (integer2 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer2;
      } 
      integer2 = paramBuilder.scr_h;
      if (integer2 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer2;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer1 = paramBuilder.q_type;
      if (integer1 == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer1;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      long_ = paramBuilder.last_thread_id;
      if (long_ == null) {
        this.last_thread_id = DEFAULT_LAST_THREAD_ID;
      } else {
        this.last_thread_id = long_;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
      this.forum_id = ((Builder)integer).forum_id;
      this.last_thread_id = ((Builder)integer).last_thread_id;
      this.rn = ((Builder)integer).rn;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Long forum_id;
    
    public Long last_thread_id;
    
    public Integer q_type;
    
    public Integer rn;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
      this.q_type = param1DataReq.q_type;
      this.forum_id = param1DataReq.forum_id;
      this.last_thread_id = param1DataReq.last_thread_id;
      this.rn = param1DataReq.rn;
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
