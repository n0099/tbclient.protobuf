package tbclient.GetInfluenceRank;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RankRuler;
import tbclient.TiebaFieldsInfo;
import tbclient.User;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final Boolean DEFAULT_HAS_MORE;
  
  public static final Long DEFAULT_TIMESTAMP;
  
  public static final List<User> DEFAULT_USER_RANK = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final User current_user;
  
  @ProtoField(tag = 3)
  public final TiebaFieldsInfo field_info;
  
  @ProtoField(tag = 6, type = Message.Datatype.BOOL)
  public final Boolean has_more;
  
  @ProtoField(tag = 4)
  public final RankRuler rank_description;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long timestamp;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> user_rank;
  
  static {
    DEFAULT_TIMESTAMP = Long.valueOf(0L);
    DEFAULT_HAS_MORE = Boolean.FALSE;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List<User> list = paramBuilder.user_rank;
      if (list == null) {
        this.user_rank = DEFAULT_USER_RANK;
      } else {
        this.user_rank = Message.immutableCopyOf(list);
      } 
      this.current_user = paramBuilder.current_user;
      this.field_info = paramBuilder.field_info;
      this.rank_description = paramBuilder.rank_description;
      Long long_ = paramBuilder.timestamp;
      if (long_ == null) {
        this.timestamp = DEFAULT_TIMESTAMP;
      } else {
        this.timestamp = long_;
      } 
      bool = paramBuilder.has_more;
      if (bool == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = bool;
      } 
    } else {
      this.user_rank = Message.immutableCopyOf(((Builder)bool).user_rank);
      this.current_user = ((Builder)bool).current_user;
      this.field_info = ((Builder)bool).field_info;
      this.rank_description = ((Builder)bool).rank_description;
      this.timestamp = ((Builder)bool).timestamp;
      this.has_more = ((Builder)bool).has_more;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1219781983, "Ltbclient/GetInfluenceRank/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1219781983, "Ltbclient/GetInfluenceRank/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public User current_user;
    
    public TiebaFieldsInfo field_info;
    
    public Boolean has_more;
    
    public RankRuler rank_description;
    
    public Long timestamp;
    
    public List<User> user_rank;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user_rank = Message.copyOf(param1DataRes.user_rank);
      this.current_user = param1DataRes.current_user;
      this.field_info = param1DataRes.field_info;
      this.rank_description = param1DataRes.rank_description;
      this.timestamp = param1DataRes.timestamp;
      this.has_more = param1DataRes.has_more;
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
