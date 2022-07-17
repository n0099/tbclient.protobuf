package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GraffitiRankItem extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_GID;
  
  public static final Integer DEFAULT_G_TYPE;
  
  public static final Integer DEFAULT_IS_VOTE;
  
  public static final String DEFAULT_PIC_ID = "";
  
  public static final String DEFAULT_THUMB_URL = "";
  
  public static final Long DEFAULT_UID;
  
  public static final String DEFAULT_URL = "";
  
  public static final Long DEFAULT_VOTE_COUNT;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer g_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long gid;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_vote;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String pic_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String thumb_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long vote_count;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(833201962, "Ltbclient/GraffitiRankItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(833201962, "Ltbclient/GraffitiRankItem;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_GID = long_;
    DEFAULT_VOTE_COUNT = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_VOTE = integer;
    DEFAULT_UID = long_;
    DEFAULT_G_TYPE = integer;
  }
  
  public GraffitiRankItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.gid;
      if (long_3 == null) {
        this.gid = DEFAULT_GID;
      } else {
        this.gid = long_3;
      } 
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Long long_2 = paramBuilder.vote_count;
      if (long_2 == null) {
        this.vote_count = DEFAULT_VOTE_COUNT;
      } else {
        this.vote_count = long_2;
      } 
      Integer integer2 = paramBuilder.is_vote;
      if (integer2 == null) {
        this.is_vote = DEFAULT_IS_VOTE;
      } else {
        this.is_vote = integer2;
      } 
      Long long_1 = paramBuilder.uid;
      if (long_1 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_1;
      } 
      String str1 = paramBuilder.pic_id;
      if (str1 == null) {
        this.pic_id = "";
      } else {
        this.pic_id = str1;
      } 
      Integer integer1 = paramBuilder.g_type;
      if (integer1 == null) {
        this.g_type = DEFAULT_G_TYPE;
      } else {
        this.g_type = integer1;
      } 
      str = paramBuilder.thumb_url;
      if (str == null) {
        this.thumb_url = "";
      } else {
        this.thumb_url = str;
      } 
    } else {
      this.gid = ((Builder)str).gid;
      this.url = ((Builder)str).url;
      this.vote_count = ((Builder)str).vote_count;
      this.is_vote = ((Builder)str).is_vote;
      this.uid = ((Builder)str).uid;
      this.pic_id = ((Builder)str).pic_id;
      this.g_type = ((Builder)str).g_type;
      this.thumb_url = ((Builder)str).thumb_url;
    } 
  }
  
  public GraffitiRankItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GraffitiRankItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer g_type;
    
    public Long gid;
    
    public Integer is_vote;
    
    public String pic_id;
    
    public String thumb_url;
    
    public Long uid;
    
    public String url;
    
    public Long vote_count;
    
    public Builder() {}
    
    public Builder(GraffitiRankItem param1GraffitiRankItem) {
      super(param1GraffitiRankItem);
      if (param1GraffitiRankItem == null)
        return; 
      this.gid = param1GraffitiRankItem.gid;
      this.url = param1GraffitiRankItem.url;
      this.vote_count = param1GraffitiRankItem.vote_count;
      this.is_vote = param1GraffitiRankItem.is_vote;
      this.uid = param1GraffitiRankItem.uid;
      this.pic_id = param1GraffitiRankItem.pic_id;
      this.g_type = param1GraffitiRankItem.g_type;
      this.thumb_url = param1GraffitiRankItem.thumb_url;
    }
    
    public GraffitiRankItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GraffitiRankItem)interceptResult.objValue; 
      } 
      return new GraffitiRankItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
