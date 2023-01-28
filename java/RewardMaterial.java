package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RewardMaterial extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_IS_MATCHED;
  
  public static final Integer DEFAULT_IS_NEWEST_MATCHED_LEVEL;
  
  public static final String DEFAULT_UNLOCK_LEVEL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_matched;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_newest_matched_level;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String unlock_level;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_MATCHED = integer;
    DEFAULT_IS_NEWEST_MATCHED_LEVEL = integer;
  }
  
  public RewardMaterial(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
      str = paramBuilder.unlock_level;
      if (str == null) {
        this.unlock_level = "";
      } else {
        this.unlock_level = str;
      } 
      Integer integer1 = paramBuilder.is_matched;
      if (integer1 == null) {
        this.is_matched = DEFAULT_IS_MATCHED;
      } else {
        this.is_matched = integer1;
      } 
      integer = paramBuilder.is_newest_matched_level;
      if (integer == null) {
        this.is_newest_matched_level = DEFAULT_IS_NEWEST_MATCHED_LEVEL;
      } else {
        this.is_newest_matched_level = integer;
      } 
    } else {
      this.icon = ((Builder)integer).icon;
      this.unlock_level = ((Builder)integer).unlock_level;
      this.is_matched = ((Builder)integer).is_matched;
      this.is_newest_matched_level = ((Builder)integer).is_newest_matched_level;
    } 
  }
  
  public RewardMaterial(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RewardMaterial> {
    public String icon;
    
    public Integer is_matched;
    
    public Integer is_newest_matched_level;
    
    public String unlock_level;
    
    public Builder() {}
    
    public Builder(RewardMaterial param1RewardMaterial) {
      super(param1RewardMaterial);
      if (param1RewardMaterial == null)
        return; 
      this.icon = param1RewardMaterial.icon;
      this.unlock_level = param1RewardMaterial.unlock_level;
      this.is_matched = param1RewardMaterial.is_matched;
      this.is_newest_matched_level = param1RewardMaterial.is_newest_matched_level;
    }
    
    public RewardMaterial build(boolean param1Boolean) {
      return new RewardMaterial(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
