package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Integer DEFAULT_FREE_CHANCE;
  
  public static final Integer DEFAULT_SCENE_ID;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer free_chance;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scene_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FREE_CHANCE = integer;
    DEFAULT_SCENE_ID = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.free_chance;
      if (integer1 == null) {
        this.free_chance = DEFAULT_FREE_CHANCE;
      } else {
        this.free_chance = integer1;
      } 
      integer = paramBuilder.scene_id;
      if (integer == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer;
      } 
    } else {
      this.free_chance = ((Builder)integer).free_chance;
      this.scene_id = ((Builder)integer).scene_id;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer free_chance;
    
    public Integer scene_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.free_chance = param1DataRes.free_chance;
      this.scene_id = param1DataRes.scene_id;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
