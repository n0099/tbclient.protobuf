package tbclient.GetPostList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FLOOR_RN;
  
  public static final Integer DEFAULT_IS_COMM_REVERSE;
  
  public static final Long DEFAULT_KZ = Long.valueOf(0L);
  
  public static final List<Long> DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Integer DEFAULT_ST_TYPE;
  
  public static final Integer DEFAULT_WITH_FLOOR;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer floor_rn;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer is_comm_reverse;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long kz;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.INT64)
  public final List<Long> post_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer st_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer with_floor;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_WITH_FLOOR = integer;
    DEFAULT_POST_ID = Collections.emptyList();
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_ST_TYPE = integer;
    DEFAULT_IS_COMM_REVERSE = integer;
    DEFAULT_FLOOR_RN = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.kz;
      if (long_ == null) {
        this.kz = DEFAULT_KZ;
      } else {
        this.kz = long_;
      } 
      Integer integer2 = paramBuilder.with_floor;
      if (integer2 == null) {
        this.with_floor = DEFAULT_WITH_FLOOR;
      } else {
        this.with_floor = integer2;
      } 
      List<Long> list = paramBuilder.post_id;
      if (list == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.scr_w;
      if (integer1 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer1;
      } 
      integer1 = paramBuilder.scr_h;
      if (integer1 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer1;
      } 
      integer1 = paramBuilder.st_type;
      if (integer1 == null) {
        this.st_type = DEFAULT_ST_TYPE;
      } else {
        this.st_type = integer1;
      } 
      integer1 = paramBuilder.is_comm_reverse;
      if (integer1 == null) {
        this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
      } else {
        this.is_comm_reverse = integer1;
      } 
      integer = paramBuilder.floor_rn;
      if (integer == null) {
        this.floor_rn = DEFAULT_FLOOR_RN;
      } else {
        this.floor_rn = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.kz = ((Builder)integer).kz;
      this.with_floor = ((Builder)integer).with_floor;
      this.post_id = Message.immutableCopyOf(((Builder)integer).post_id);
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.st_type = ((Builder)integer).st_type;
      this.is_comm_reverse = ((Builder)integer).is_comm_reverse;
      this.floor_rn = ((Builder)integer).floor_rn;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(928736012, "Ltbclient/GetPostList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(928736012, "Ltbclient/GetPostList/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Integer floor_rn;
    
    public Integer is_comm_reverse;
    
    public Long kz;
    
    public List<Long> post_id;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Integer st_type;
    
    public Integer with_floor;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.kz = param1DataReq.kz;
      this.with_floor = param1DataReq.with_floor;
      this.post_id = Message.copyOf(param1DataReq.post_id);
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.st_type = param1DataReq.st_type;
      this.is_comm_reverse = param1DataReq.is_comm_reverse;
      this.floor_rn = param1DataReq.floor_rn;
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
