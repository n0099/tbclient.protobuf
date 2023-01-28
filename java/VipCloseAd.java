package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VipCloseAd extends Message {
  public static final List<Integer> DEFAULT_FORUM_CLOSE;
  
  public static final Integer DEFAULT_IS_OPEN;
  
  public static final Integer DEFAULT_VIP_CLOSE;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
  public final List<Integer> forum_close;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_open;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer vip_close;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_OPEN = integer;
    DEFAULT_VIP_CLOSE = integer;
    DEFAULT_FORUM_CLOSE = Collections.emptyList();
  }
  
  public VipCloseAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_open;
      if (integer == null) {
        this.is_open = DEFAULT_IS_OPEN;
      } else {
        this.is_open = integer;
      } 
      integer = paramBuilder.vip_close;
      if (integer == null) {
        this.vip_close = DEFAULT_VIP_CLOSE;
      } else {
        this.vip_close = integer;
      } 
      list = paramBuilder.forum_close;
      if (list == null) {
        this.forum_close = DEFAULT_FORUM_CLOSE;
      } else {
        this.forum_close = Message.immutableCopyOf(list);
      } 
    } else {
      this.is_open = ((Builder)list).is_open;
      this.vip_close = ((Builder)list).vip_close;
      this.forum_close = Message.immutableCopyOf(((Builder)list).forum_close);
    } 
  }
  
  public VipCloseAd(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipCloseAd> {
    public List<Integer> forum_close;
    
    public Integer is_open;
    
    public Integer vip_close;
    
    public Builder() {}
    
    public Builder(VipCloseAd param1VipCloseAd) {
      super(param1VipCloseAd);
      if (param1VipCloseAd == null)
        return; 
      this.is_open = param1VipCloseAd.is_open;
      this.vip_close = param1VipCloseAd.vip_close;
      this.forum_close = Message.copyOf(param1VipCloseAd.forum_close);
    }
    
    public VipCloseAd build(boolean param1Boolean) {
      return new VipCloseAd(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
