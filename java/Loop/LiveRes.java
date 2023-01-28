package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class LiveRes extends Message {
  public static final String DEFAULT_IS_END = "";
  
  public static final List<YyLiveInfoSimple> DEFAULT_LIVE_LIST = Collections.emptyList();
  
  public static final List<LiveNormalConfig> DEFAULT_NORMAL_CONFIG_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String is_end;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<YyLiveInfoSimple> live_list;
  
  @ProtoField(tag = 1)
  public final NormalConfig normal_config;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<LiveNormalConfig> normal_config_list;
  
  public LiveRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LiveNormalConfig> list;
    if (paramBoolean == true) {
      this.normal_config = paramBuilder.normal_config;
      List<YyLiveInfoSimple> list1 = paramBuilder.live_list;
      if (list1 == null) {
        this.live_list = DEFAULT_LIVE_LIST;
      } else {
        this.live_list = Message.immutableCopyOf(list1);
      } 
      String str = paramBuilder.is_end;
      if (str == null) {
        this.is_end = "";
      } else {
        this.is_end = str;
      } 
      list = paramBuilder.normal_config_list;
      if (list == null) {
        this.normal_config_list = DEFAULT_NORMAL_CONFIG_LIST;
      } else {
        this.normal_config_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.normal_config = ((Builder)list).normal_config;
      this.live_list = Message.immutableCopyOf(((Builder)list).live_list);
      this.is_end = ((Builder)list).is_end;
      this.normal_config_list = Message.immutableCopyOf(((Builder)list).normal_config_list);
    } 
  }
  
  public LiveRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LiveRes> {
    public String is_end;
    
    public List<YyLiveInfoSimple> live_list;
    
    public NormalConfig normal_config;
    
    public List<LiveNormalConfig> normal_config_list;
    
    public Builder() {}
    
    public Builder(LiveRes param1LiveRes) {
      super(param1LiveRes);
      if (param1LiveRes == null)
        return; 
      this.normal_config = param1LiveRes.normal_config;
      this.live_list = Message.copyOf(param1LiveRes.live_list);
      this.is_end = param1LiveRes.is_end;
      this.normal_config_list = Message.copyOf(param1LiveRes.normal_config_list);
    }
    
    public LiveRes build(boolean param1Boolean) {
      return new LiveRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
