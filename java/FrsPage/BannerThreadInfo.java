package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class BannerThreadInfo extends Message {
  public static final Integer DEFAULT_FROM = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer from;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_info;
  
  public BannerThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.thread_info = paramBuilder.thread_info;
      integer = paramBuilder.from;
      if (integer == null) {
        this.from = DEFAULT_FROM;
      } else {
        this.from = integer;
      } 
    } else {
      this.thread_info = ((Builder)integer).thread_info;
      this.from = ((Builder)integer).from;
    } 
  }
  
  public BannerThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BannerThreadInfo> {
    public Integer from;
    
    public ThreadInfo thread_info;
    
    public Builder() {}
    
    public Builder(BannerThreadInfo param1BannerThreadInfo) {
      super(param1BannerThreadInfo);
      if (param1BannerThreadInfo == null)
        return; 
      this.thread_info = param1BannerThreadInfo.thread_info;
      this.from = param1BannerThreadInfo.from;
    }
    
    public BannerThreadInfo build(boolean param1Boolean) {
      return new BannerThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
