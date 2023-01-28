package tbclient.GetLevelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LevelInfo;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final List<LevelInfo> DEFAULT_LEVEL_INFO = Collections.emptyList();
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LevelInfo> level_info;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_USER_LEVEL = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<LevelInfo> list = paramBuilder.level_info;
      if (list == null) {
        this.level_info = DEFAULT_LEVEL_INFO;
      } else {
        this.level_info = Message.immutableCopyOf(list);
      } 
      Integer integer = paramBuilder.is_like;
      if (integer == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer;
      } 
      integer = paramBuilder.user_level;
      if (integer == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer;
      } 
      str = paramBuilder.level_name;
      if (str == null) {
        this.level_name = "";
      } else {
        this.level_name = str;
      } 
    } else {
      this.level_info = Message.immutableCopyOf(((Builder)str).level_info);
      this.is_like = ((Builder)str).is_like;
      this.user_level = ((Builder)str).user_level;
      this.level_name = ((Builder)str).level_name;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer is_like;
    
    public List<LevelInfo> level_info;
    
    public String level_name;
    
    public Integer user_level;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.level_info = Message.copyOf(param1DataRes.level_info);
      this.is_like = param1DataRes.is_like;
      this.user_level = param1DataRes.user_level;
      this.level_name = param1DataRes.level_name;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
