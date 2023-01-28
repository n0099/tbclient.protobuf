package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;

public final class BannerFollowLive extends Message {
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_SWITCH = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer _switch;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AlaLiveInfo> ala_live_list;
  
  public BannerFollowLive(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<AlaLiveInfo> list = paramBuilder.ala_live_list;
      if (list == null) {
        this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
      } else {
        this.ala_live_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder._switch;
      if (integer == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer;
      } 
    } else {
      this.ala_live_list = Message.immutableCopyOf(((Builder)integer).ala_live_list);
      this._switch = ((Builder)integer)._switch;
    } 
  }
  
  public BannerFollowLive(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BannerFollowLive> {
    public Integer _switch;
    
    public List<AlaLiveInfo> ala_live_list;
    
    public Builder() {}
    
    public Builder(BannerFollowLive param1BannerFollowLive) {
      super(param1BannerFollowLive);
      if (param1BannerFollowLive == null)
        return; 
      this.ala_live_list = Message.copyOf(param1BannerFollowLive.ala_live_list);
      this._switch = param1BannerFollowLive._switch;
    }
    
    public BannerFollowLive build(boolean param1Boolean) {
      return new BannerFollowLive(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
