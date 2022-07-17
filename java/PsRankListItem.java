package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PsRankListItem extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_GAME_ID;
  
  public static final Long DEFAULT_SCORE;
  
  public static final Long DEFAULT_USER_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long game_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long score;
  
  @ProtoField(tag = 4)
  public final User user;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-586697903, "Ltbclient/PsRankListItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-586697903, "Ltbclient/PsRankListItem;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_GAME_ID = long_;
    DEFAULT_USER_ID = long_;
    DEFAULT_SCORE = long_;
  }
  
  public PsRankListItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.game_id;
      if (long_ == null) {
        this.game_id = DEFAULT_GAME_ID;
      } else {
        this.game_id = long_;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      long_ = paramBuilder.score;
      if (long_ == null) {
        this.score = DEFAULT_SCORE;
      } else {
        this.score = long_;
      } 
      this.user = paramBuilder.user;
    } else {
      this.game_id = paramBuilder.game_id;
      this.user_id = paramBuilder.user_id;
      this.score = paramBuilder.score;
      this.user = paramBuilder.user;
    } 
  }
  
  public PsRankListItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PsRankListItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long game_id;
    
    public Long score;
    
    public User user;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(PsRankListItem param1PsRankListItem) {
      super(param1PsRankListItem);
      if (param1PsRankListItem == null)
        return; 
      this.game_id = param1PsRankListItem.game_id;
      this.user_id = param1PsRankListItem.user_id;
      this.score = param1PsRankListItem.score;
      this.user = param1PsRankListItem.user;
    }
    
    public PsRankListItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PsRankListItem)interceptResult.objValue; 
      } 
      return new PsRankListItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
